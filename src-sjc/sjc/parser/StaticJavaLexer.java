// $ANTLR 3.4 /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g 2012-11-15 19:51:58
 
package sjc.parser;

/**
 * StaticJava lexer.
 *
 * @author robby
 */


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class StaticJavaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int ID=4;
    public static final int NUM_INT=5;
    public static final int WS=6;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public StaticJavaLexer() {} 
    public StaticJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public StaticJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:12:6: ( '!' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:12:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:13:6: ( '!=' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:13:8: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:14:6: ( '%' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:14:8: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:15:7: ( '&&' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:15:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:16:7: ( '(' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:17:7: ( ')' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:18:7: ( '*' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:18:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:19:7: ( '+' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:19:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:20:7: ( ',' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:21:7: ( '-' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:21:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:22:7: ( '.' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:22:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:23:7: ( '/' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:23:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:24:7: ( ';' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:24:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:25:7: ( '<' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:25:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:26:7: ( '<=' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:26:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:27:7: ( '=' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:28:7: ( '==' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:28:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:29:7: ( '>' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:29:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:30:7: ( '>=' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:30:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:31:7: ( '[' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:31:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:32:7: ( ']' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:33:7: ( 'boolean' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:33:9: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:34:7: ( 'class' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:34:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:35:7: ( 'else' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:35:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:36:7: ( 'false' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:36:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:37:7: ( 'if' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:37:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:38:7: ( 'int' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:38:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:39:7: ( 'null' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:39:9: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:40:7: ( 'public' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:40:9: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:41:7: ( 'return' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:41:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:42:7: ( 'static' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:42:9: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:43:7: ( 'true' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:43:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:44:7: ( 'void' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:44:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:45:7: ( 'while' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:45:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:46:7: ( '{' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:46:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:47:7: ( '||' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:47:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:48:7: ( '}' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:48:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:203:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:203:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:204:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUM_INT"
    public final void mNUM_INT() throws RecognitionException {
        try {
            int _type = NUM_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:208:2: ( ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* ) )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:208:4: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
            {
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:208:4: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:208:6: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:208:12: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:208:23: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM_INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:213:2: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:213:4: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | ID | NUM_INT | WS )
        int alt4=40;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:15: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:20: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:25: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:31: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:37: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:43: T__13
                {
                mT__13(); 


                }
                break;
            case 8 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:49: T__14
                {
                mT__14(); 


                }
                break;
            case 9 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:55: T__15
                {
                mT__15(); 


                }
                break;
            case 10 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:61: T__16
                {
                mT__16(); 


                }
                break;
            case 11 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:67: T__17
                {
                mT__17(); 


                }
                break;
            case 12 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:73: T__18
                {
                mT__18(); 


                }
                break;
            case 13 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:79: T__19
                {
                mT__19(); 


                }
                break;
            case 14 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:85: T__20
                {
                mT__20(); 


                }
                break;
            case 15 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:91: T__21
                {
                mT__21(); 


                }
                break;
            case 16 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:97: T__22
                {
                mT__22(); 


                }
                break;
            case 17 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:103: T__23
                {
                mT__23(); 


                }
                break;
            case 18 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:109: T__24
                {
                mT__24(); 


                }
                break;
            case 19 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:115: T__25
                {
                mT__25(); 


                }
                break;
            case 20 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:121: T__26
                {
                mT__26(); 


                }
                break;
            case 21 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:127: T__27
                {
                mT__27(); 


                }
                break;
            case 22 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:133: T__28
                {
                mT__28(); 


                }
                break;
            case 23 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:139: T__29
                {
                mT__29(); 


                }
                break;
            case 24 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:145: T__30
                {
                mT__30(); 


                }
                break;
            case 25 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:151: T__31
                {
                mT__31(); 


                }
                break;
            case 26 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:157: T__32
                {
                mT__32(); 


                }
                break;
            case 27 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:163: T__33
                {
                mT__33(); 


                }
                break;
            case 28 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:169: T__34
                {
                mT__34(); 


                }
                break;
            case 29 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:175: T__35
                {
                mT__35(); 


                }
                break;
            case 30 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:181: T__36
                {
                mT__36(); 


                }
                break;
            case 31 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:187: T__37
                {
                mT__37(); 


                }
                break;
            case 32 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:193: T__38
                {
                mT__38(); 


                }
                break;
            case 33 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:199: T__39
                {
                mT__39(); 


                }
                break;
            case 34 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:205: T__40
                {
                mT__40(); 


                }
                break;
            case 35 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:211: T__41
                {
                mT__41(); 


                }
                break;
            case 36 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:217: T__42
                {
                mT__42(); 


                }
                break;
            case 37 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:223: T__43
                {
                mT__43(); 


                }
                break;
            case 38 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:229: ID
                {
                mID(); 


                }
                break;
            case 39 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:232: NUM_INT
                {
                mNUM_INT(); 


                }
                break;
            case 40 :
                // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:1:240: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\1\45\13\uffff\1\47\1\51\1\53\2\uffff\14\41\16\uffff\4\41"+
        "\1\75\14\41\1\uffff\1\112\11\41\1\124\1\41\1\uffff\1\126\3\41\1"+
        "\132\1\133\2\41\1\136\1\uffff\1\137\1\uffff\3\41\2\uffff\1\143\1"+
        "\41\2\uffff\1\145\1\146\1\147\1\uffff\1\150\4\uffff";
    static final String DFA4_eofS =
        "\151\uffff";
    static final String DFA4_minS =
        "\1\11\1\75\13\uffff\3\75\2\uffff\1\157\2\154\1\141\1\146\2\165\1"+
        "\145\1\164\1\162\1\157\1\150\16\uffff\1\157\1\141\1\163\1\154\1"+
        "\44\1\164\1\154\1\142\1\164\1\141\1\165\2\151\1\154\1\163\1\145"+
        "\1\163\1\uffff\1\44\2\154\1\165\1\164\1\145\1\144\1\154\1\145\1"+
        "\163\1\44\1\145\1\uffff\1\44\1\151\1\162\1\151\2\44\1\145\1\141"+
        "\1\44\1\uffff\1\44\1\uffff\1\143\1\156\1\143\2\uffff\1\44\1\156"+
        "\2\uffff\3\44\1\uffff\1\44\4\uffff";
    static final String DFA4_maxS =
        "\1\175\1\75\13\uffff\3\75\2\uffff\1\157\2\154\1\141\1\156\2\165"+
        "\1\145\1\164\1\162\1\157\1\150\16\uffff\1\157\1\141\1\163\1\154"+
        "\1\172\1\164\1\154\1\142\1\164\1\141\1\165\2\151\1\154\1\163\1\145"+
        "\1\163\1\uffff\1\172\2\154\1\165\1\164\1\145\1\144\1\154\1\145\1"+
        "\163\1\172\1\145\1\uffff\1\172\1\151\1\162\1\151\2\172\1\145\1\141"+
        "\1\172\1\uffff\1\172\1\uffff\1\143\1\156\1\143\2\uffff\1\172\1\156"+
        "\2\uffff\3\172\1\uffff\1\172\4\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\3\uffff"+
        "\1\24\1\25\14\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\2\1\1\1\17\1"+
        "\16\1\21\1\20\1\23\1\22\21\uffff\1\32\14\uffff\1\33\11\uffff\1\30"+
        "\1\uffff\1\34\3\uffff\1\40\1\41\2\uffff\1\27\1\31\3\uffff\1\42\1"+
        "\uffff\1\35\1\36\1\37\1\26";
    static final String DFA4_specialS =
        "\151\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\43\1\uffff\2\43\22\uffff\1\43\1\1\2\uffff\1\41\1\2\1\3\1"+
            "\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\12\42\1\uffff\1\14"+
            "\1\15\1\16\1\17\2\uffff\32\41\1\20\1\uffff\1\21\1\uffff\1\41"+
            "\1\uffff\1\41\1\22\1\23\1\41\1\24\1\25\2\41\1\26\4\41\1\27\1"+
            "\41\1\30\1\41\1\31\1\32\1\33\1\41\1\34\1\35\3\41\1\36\1\37\1"+
            "\40",
            "\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46",
            "\1\50",
            "\1\52",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60\7\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\125",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\134",
            "\1\135",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\144",
            "",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | ID | NUM_INT | WS );";
        }
    }
 

}