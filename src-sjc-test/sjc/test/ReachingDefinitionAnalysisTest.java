package sjc.test;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import sjc.analysis.CFG;
import sjc.analysis.ReachingDefinitionAnalysis;
import sjc.parser.StaticJavaASTLexer;
import sjc.parser.StaticJavaASTParser;
import sjc.symboltable.SymbolTable;
import sjc.symboltable.SymbolTableBuilder;

/**
 * Test cases for {@link ReachingDefinitionAnalysis}.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ReachingDefinitionAnalysisTest extends TestCase {
  public static void testPass(final String filename) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(filename);
      final StaticJavaASTLexer sjal = new StaticJavaASTLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjal);
      final StaticJavaASTParser sjap = new StaticJavaASTParser(cts);
      final CompilationUnit cu = sjap.compilationUnit();
      final SymbolTable st = SymbolTableBuilder.build(cu);
      for (final Object o : cu.types()) {
        if (o instanceof TypeDeclaration) {
          for (final Object o2 : ((TypeDeclaration) o).bodyDeclarations()) {
            if (o2 instanceof MethodDeclaration) {
              final MethodDeclaration md = (MethodDeclaration) o2;
              final ReachingDefinitionAnalysis rda = new ReachingDefinitionAnalysis(
                  st, new CFG(md));
              rda.computeFixPoint();
              System.out.println(rda.getResultString());
              System.out.println();
            }
          }
        }
      }
      System.out.flush();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  public void testFactorial() {
    ReachingDefinitionAnalysisTest.testPass("src-examples/Factorial.java");
  }

  public void testPower() {
    ReachingDefinitionAnalysisTest.testPass("src-examples/Power.java");
  }

}
