package sjc.test;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

import sjc.parser.StaticJavaLexer;
import sjc.parser.StaticJavaParser;

/**
 * Test cases for {@link StaticJavaParser}.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ParserTest extends TestCase {
  public static void testFail(final String filename) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(filename);
      final StaticJavaLexer sjl = new StaticJavaLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjl);
      final StaticJavaParser sjp = new StaticJavaParser(cts);
      sjp.compilationUnit();
      Assert.assertTrue("Expected Parse Error", false);
    } catch (final Exception e) {
    }
  }

  public static void testPass(final String filename) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(filename);
      final StaticJavaLexer sjl = new StaticJavaLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjl);
      final StaticJavaParser sjp = new StaticJavaParser(cts);
      sjp.compilationUnit();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  public void testFactorial() {
    ParserTest.testPass("src-examples/Factorial.java");
  }

  public void testParseError() {
    ParserTest.testPass("src-examples/ParseError.java");
  }

  public void testParseErrorPass() {
    ParserTest.testFail("src-examples/ParseError.java");
  }

  public void testPower() {
    ParserTest.testPass("src-examples/Power.java");
  }
}
