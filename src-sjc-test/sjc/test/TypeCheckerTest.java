package sjc.test;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.jdt.core.dom.CompilationUnit;

import sjc.parser.StaticJavaASTLexer;
import sjc.parser.StaticJavaASTParser;
import sjc.symboltable.SymbolTable;
import sjc.symboltable.SymbolTableBuilder;
import sjc.type.TypeFactory;
import sjc.type.checker.TypeChecker;

/**
 * Test cases for {@link TypeChecker}.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class TypeCheckerTest extends TestCase {
  public static void testPass(final String filename) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(filename);
      final StaticJavaASTLexer sjal = new StaticJavaASTLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjal);
      final StaticJavaASTParser sjap = new StaticJavaASTParser(cts);
      final CompilationUnit cu = sjap.compilationUnit();
      final SymbolTable st = SymbolTableBuilder.build(cu);
      System.out.println(st);
      System.out.print(TypeChecker.check(new TypeFactory(), cu, st));
      System.out.flush();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  public void testFactorial() {
    TypeCheckerTest.testPass("src-examples/Factorial.java");
  }

  public void testPower() {
    TypeCheckerTest.testPass("src-examples/Power.java");
  }
}
