package sjc.test;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.jdt.core.dom.ASTParser;

import sjc.parser.StaticJavaASTLexer;
import sjc.parser.StaticJavaASTParser;

/**
 * Test cases for {@link ASTParser}.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ASTParserTest extends TestCase {
  public static void testPass(final String filename) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(filename);
      final StaticJavaASTLexer sjal = new StaticJavaASTLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjal);
      final StaticJavaASTParser sjap = new StaticJavaASTParser(cts);
      System.out.println(sjap.compilationUnit().toString());
      System.out.flush();

    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  public void testFactorial() {
    ASTParserTest.testPass("src-examples/Factorial.java");
  }

  public void testPower() {
    ASTParserTest.testPass("src-examples/Power.java");
  }
}
