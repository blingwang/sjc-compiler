package sjc.test;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.jdt.core.dom.CompilationUnit;

import sjc.parser.StaticJavaASTLexer;
import sjc.parser.StaticJavaASTParser;
import sjc.symboltable.SymbolTableBuilder;

/**
 * Test cases for {@link SymbolTableBuilder}.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class SymbolTableBuilderTest extends TestCase {
  public static void testPass(final String filename) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(filename);
      final StaticJavaASTLexer sjal = new StaticJavaASTLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjal);
      final StaticJavaASTParser sjap = new StaticJavaASTParser(cts);
      final CompilationUnit cu = sjap.compilationUnit();
      System.out.print(SymbolTableBuilder.build(cu));
      System.out.flush();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  public void testFactorial() {
    SymbolTableBuilderTest.testPass("src-examples/Factorial.java");
  }

  public void testPower() {
    SymbolTableBuilderTest.testPass("src-examples/Power.java");
  }

}
