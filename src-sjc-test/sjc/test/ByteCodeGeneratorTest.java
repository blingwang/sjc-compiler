package sjc.test;

import java.io.PrintWriter;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.util.TraceClassVisitor;

import sjc.codegen.ByteCodeGenerator;
import sjc.codegen.ClassByteCodes;
import sjc.parser.StaticJavaASTLexer;
import sjc.parser.StaticJavaASTParser;
import sjc.symboltable.SymbolTable;
import sjc.symboltable.SymbolTableBuilder;
import sjc.type.TypeFactory;
import sjc.type.checker.TypeChecker;
import sjc.type.checker.TypeTable;

/**
 * Test cases for {@link TypeChecker}.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ByteCodeGeneratorTest extends TestCase {
  @SuppressWarnings("unchecked")
  static class CustomClassLoader extends ClassLoader {
    public Class loadClass(final String name, final byte[] bytecodes) {
      return defineClass(name, bytecodes, 0, bytecodes.length);
    }
  }

  @SuppressWarnings("unchecked")
  public static void testPass(final String filename, final Object[] args) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(filename);
      final StaticJavaASTLexer sjal = new StaticJavaASTLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjal);
      final StaticJavaASTParser sjap = new StaticJavaASTParser(cts);
      final CompilationUnit cu = sjap.compilationUnit();
      final SymbolTable st = SymbolTableBuilder.build(cu);
      final TypeTable tt = TypeChecker.check(new TypeFactory(), cu, st);
      final ClassByteCodes cbc = ByteCodeGenerator.generate(cu, st, tt);
      final ClassReader cr = new ClassReader(cbc.mainClassBytes);
      final TraceClassVisitor tcv = new TraceClassVisitor(new PrintWriter(
          System.out));
      cr.accept(tcv, 0);
      System.out.flush();

      final CustomClassLoader ccl = new CustomClassLoader();
      final Class c = ccl.loadClass(cbc.mainClassName, cbc.mainClassBytes);
      c.getMethod("main", new Class[] { String[].class }).invoke(null, args);
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
      throw new RuntimeException();
    }
  }

  public void testFactorial3() {
    ByteCodeGeneratorTest.testPass("src-examples/Factorial.java",
        new Object[] { new String[] { "3" } });
  }

  public void testPower2To2() {
    ByteCodeGeneratorTest.testPass("src-examples/Power.java",
        new Object[] { new String[] { "2", "2" } });
  }
}
