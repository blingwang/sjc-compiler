// $ANTLR 3.4 /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g 2012-11-15 19:51:57

package sjc.parser;

import java.math.BigInteger;

/**
 * StaticJava parser.
 *
 * @author robby
 */


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class StaticJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUM_INT", "WS", "'!'", "'!='", "'%'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'['", "']'", "'boolean'", "'class'", "'else'", "'false'", "'if'", "'int'", "'null'", "'public'", "'return'", "'static'", "'true'", "'void'", "'while'", "'{'", "'||'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public StaticJavaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public StaticJavaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[71+1];
         

    }

    public String[] getTokenNames() { return StaticJavaParser.tokenNames; }
    public String getGrammarFileName() { return "/home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g"; }


    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
     throws RecognitionException
    {
     throw new MismatchedTokenException(ttype, input);
    }

    public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
     throws RecognitionException
    {
     throw e;
    }



    // $ANTLR start "compilationUnit"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:53:1: compilationUnit : classDefinition EOF ;
    public final void compilationUnit() throws RecognitionException {
        int compilationUnit_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:54:2: ( classDefinition EOF )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:54:4: classDefinition EOF
            {
            pushFollow(FOLLOW_classDefinition_in_compilationUnit55);
            classDefinition();

            state._fsp--;
            if (state.failed) return ;

            match(input,EOF,FOLLOW_EOF_in_compilationUnit59); if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "compilationUnit"



    // $ANTLR start "classDefinition"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:58:1: classDefinition : 'public' 'class' ID '{' mainMethodDeclaration ( fieldDeclaration | methodDeclaration )* '}' ;
    public final void classDefinition() throws RecognitionException {
        int classDefinition_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:59:2: ( 'public' 'class' ID '{' mainMethodDeclaration ( fieldDeclaration | methodDeclaration )* '}' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:59:4: 'public' 'class' ID '{' mainMethodDeclaration ( fieldDeclaration | methodDeclaration )* '}'
            {
            match(input,35,FOLLOW_35_in_classDefinition70); if (state.failed) return ;

            match(input,29,FOLLOW_29_in_classDefinition72); if (state.failed) return ;

            match(input,ID,FOLLOW_ID_in_classDefinition74); if (state.failed) return ;

            match(input,41,FOLLOW_41_in_classDefinition76); if (state.failed) return ;

            pushFollow(FOLLOW_mainMethodDeclaration_in_classDefinition81);
            mainMethodDeclaration();

            state._fsp--;
            if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:61:3: ( fieldDeclaration | methodDeclaration )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==37) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==28||LA1_2==33) ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==ID) ) {
                            int LA1_5 = input.LA(4);

                            if ( (LA1_5==19) ) {
                                alt1=1;
                            }
                            else if ( (LA1_5==11) ) {
                                alt1=2;
                            }


                        }


                    }
                    else if ( (LA1_2==39) ) {
                        alt1=2;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:61:5: fieldDeclaration
            	    {
            	    pushFollow(FOLLOW_fieldDeclaration_in_classDefinition87);
            	    fieldDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:62:5: methodDeclaration
            	    {
            	    pushFollow(FOLLOW_methodDeclaration_in_classDefinition93);
            	    methodDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,43,FOLLOW_43_in_classDefinition100); if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, classDefinition_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "classDefinition"



    // $ANTLR start "mainMethodDeclaration"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:66:1: mainMethodDeclaration : 'public' 'static' 'void' id1= ID {...}? '(' id2= ID '[' ']' {...}? ID ')' '{' methodBody '}' ;
    public final void mainMethodDeclaration() throws RecognitionException {
        int mainMethodDeclaration_StartIndex = input.index();

        Token id1=null;
        Token id2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:67:2: ( 'public' 'static' 'void' id1= ID {...}? '(' id2= ID '[' ']' {...}? ID ')' '{' methodBody '}' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:67:4: 'public' 'static' 'void' id1= ID {...}? '(' id2= ID '[' ']' {...}? ID ')' '{' methodBody '}'
            {
            match(input,35,FOLLOW_35_in_mainMethodDeclaration111); if (state.failed) return ;

            match(input,37,FOLLOW_37_in_mainMethodDeclaration113); if (state.failed) return ;

            match(input,39,FOLLOW_39_in_mainMethodDeclaration115); if (state.failed) return ;

            id1=(Token)match(input,ID,FOLLOW_ID_in_mainMethodDeclaration124); if (state.failed) return ;

            if ( !(( "main".equals(id1.getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "mainMethodDeclaration", " \"main\".equals(id1.getText()) ");
            }

            match(input,11,FOLLOW_11_in_mainMethodDeclaration139); if (state.failed) return ;

            id2=(Token)match(input,ID,FOLLOW_ID_in_mainMethodDeclaration143); if (state.failed) return ;

            match(input,26,FOLLOW_26_in_mainMethodDeclaration145); if (state.failed) return ;

            match(input,27,FOLLOW_27_in_mainMethodDeclaration147); if (state.failed) return ;

            if ( !(( "String".equals(id2.getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "mainMethodDeclaration", " \"String\".equals(id2.getText()) ");
            }

            match(input,ID,FOLLOW_ID_in_mainMethodDeclaration162); if (state.failed) return ;

            match(input,12,FOLLOW_12_in_mainMethodDeclaration169); if (state.failed) return ;

            match(input,41,FOLLOW_41_in_mainMethodDeclaration171); if (state.failed) return ;

            pushFollow(FOLLOW_methodBody_in_mainMethodDeclaration173);
            methodBody();

            state._fsp--;
            if (state.failed) return ;

            match(input,43,FOLLOW_43_in_mainMethodDeclaration175); if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, mainMethodDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "mainMethodDeclaration"



    // $ANTLR start "fieldDeclaration"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:76:1: fieldDeclaration : 'static' type ID ';' ;
    public final void fieldDeclaration() throws RecognitionException {
        int fieldDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:77:2: ( 'static' type ID ';' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:77:4: 'static' type ID ';'
            {
            match(input,37,FOLLOW_37_in_fieldDeclaration187); if (state.failed) return ;

            pushFollow(FOLLOW_type_in_fieldDeclaration189);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,ID,FOLLOW_ID_in_fieldDeclaration191); if (state.failed) return ;

            match(input,19,FOLLOW_19_in_fieldDeclaration193); if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, fieldDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "fieldDeclaration"



    // $ANTLR start "methodDeclaration"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:80:1: methodDeclaration : 'static' returnType ID '(' ( params )? ')' '{' methodBody '}' ;
    public final void methodDeclaration() throws RecognitionException {
        int methodDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:81:2: ( 'static' returnType ID '(' ( params )? ')' '{' methodBody '}' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:81:4: 'static' returnType ID '(' ( params )? ')' '{' methodBody '}'
            {
            match(input,37,FOLLOW_37_in_methodDeclaration205); if (state.failed) return ;

            pushFollow(FOLLOW_returnType_in_methodDeclaration207);
            returnType();

            state._fsp--;
            if (state.failed) return ;

            match(input,ID,FOLLOW_ID_in_methodDeclaration209); if (state.failed) return ;

            match(input,11,FOLLOW_11_in_methodDeclaration213); if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:82:7: ( params )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28||LA2_0==33) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:82:9: params
                    {
                    pushFollow(FOLLOW_params_in_methodDeclaration217);
                    params();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,12,FOLLOW_12_in_methodDeclaration222); if (state.failed) return ;

            match(input,41,FOLLOW_41_in_methodDeclaration226); if (state.failed) return ;

            pushFollow(FOLLOW_methodBody_in_methodDeclaration228);
            methodBody();

            state._fsp--;
            if (state.failed) return ;

            match(input,43,FOLLOW_43_in_methodDeclaration230); if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, methodDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "methodDeclaration"



    // $ANTLR start "type"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:86:1: type : ( 'boolean' | 'int' );
    public final void type() throws RecognitionException {
        int type_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:87:2: ( 'boolean' | 'int' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:
            {
            if ( input.LA(1)==28||input.LA(1)==33 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, type_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "type"



    // $ANTLR start "returnType"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:89:1: returnType : ( 'void' | type );
    public final void returnType() throws RecognitionException {
        int returnType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:90:2: ( 'void' | type )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==39) ) {
                alt3=1;
            }
            else if ( (LA3_0==28||LA3_0==33) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:90:4: 'void'
                    {
                    match(input,39,FOLLOW_39_in_returnType256); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:90:13: type
                    {
                    pushFollow(FOLLOW_type_in_returnType260);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, returnType_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "returnType"



    // $ANTLR start "params"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:93:1: params : param ( ',' param )* ;
    public final void params() throws RecognitionException {
        int params_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:94:2: ( param ( ',' param )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:94:4: param ( ',' param )*
            {
            pushFollow(FOLLOW_param_in_params272);
            param();

            state._fsp--;
            if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:94:10: ( ',' param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:94:12: ',' param
            	    {
            	    match(input,15,FOLLOW_15_in_params276); if (state.failed) return ;

            	    pushFollow(FOLLOW_param_in_params278);
            	    param();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, params_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "params"



    // $ANTLR start "param"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:97:1: param : type ID ;
    public final void param() throws RecognitionException {
        int param_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:98:2: ( type ID )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:98:4: type ID
            {
            pushFollow(FOLLOW_type_in_param293);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,ID,FOLLOW_ID_in_param295); if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, param_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "param"



    // $ANTLR start "methodBody"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:101:1: methodBody : ( localDeclaration )* ( statement )* ;
    public final void methodBody() throws RecognitionException {
        int methodBody_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:102:2: ( ( localDeclaration )* ( statement )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:102:4: ( localDeclaration )* ( statement )*
            {
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:102:4: ( localDeclaration )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28||LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:102:4: localDeclaration
            	    {
            	    pushFollow(FOLLOW_localDeclaration_in_methodBody306);
            	    localDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:103:3: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ID||LA6_0==32||LA6_0==36||LA6_0==40) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:103:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_methodBody312);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, methodBody_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "methodBody"



    // $ANTLR start "localDeclaration"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:106:1: localDeclaration : type ID ';' ;
    public final void localDeclaration() throws RecognitionException {
        int localDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:107:2: ( type ID ';' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:107:4: type ID ';'
            {
            pushFollow(FOLLOW_type_in_localDeclaration324);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,ID,FOLLOW_ID_in_localDeclaration326); if (state.failed) return ;

            match(input,19,FOLLOW_19_in_localDeclaration328); if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, localDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "localDeclaration"



    // $ANTLR start "statement"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:110:1: statement : ( assignStatement | ifStatement | whileStatement | invokeExpStatement | returnStatement ) ;
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:111:2: ( ( assignStatement | ifStatement | whileStatement | invokeExpStatement | returnStatement ) )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:111:4: ( assignStatement | ifStatement | whileStatement | invokeExpStatement | returnStatement )
            {
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:111:4: ( assignStatement | ifStatement | whileStatement | invokeExpStatement | returnStatement )
            int alt7=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==22) ) {
                    alt7=1;
                }
                else if ( (LA7_1==11||LA7_1==17) ) {
                    alt7=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 40:
                {
                alt7=3;
                }
                break;
            case 36:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:111:6: assignStatement
                    {
                    pushFollow(FOLLOW_assignStatement_in_statement342);
                    assignStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:112:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement348);
                    ifStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:113:5: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement354);
                    whileStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:114:5: invokeExpStatement
                    {
                    pushFollow(FOLLOW_invokeExpStatement_in_statement360);
                    invokeExpStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:115:5: returnStatement
                    {
                    pushFollow(FOLLOW_returnStatement_in_statement366);
                    returnStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "assignStatement"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:119:1: assignStatement : ID '=' exp ';' ;
    public final void assignStatement() throws RecognitionException {
        int assignStatement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:120:2: ( ID '=' exp ';' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:120:4: ID '=' exp ';'
            {
            match(input,ID,FOLLOW_ID_in_assignStatement382); if (state.failed) return ;

            match(input,22,FOLLOW_22_in_assignStatement384); if (state.failed) return ;

            pushFollow(FOLLOW_exp_in_assignStatement386);
            exp();

            state._fsp--;
            if (state.failed) return ;

            match(input,19,FOLLOW_19_in_assignStatement388); if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, assignStatement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "assignStatement"



    // $ANTLR start "ifStatement"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:123:1: ifStatement : 'if' '(' exp ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )? ;
    public final void ifStatement() throws RecognitionException {
        int ifStatement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:124:2: ( 'if' '(' exp ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )? )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:124:4: 'if' '(' exp ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )?
            {
            match(input,32,FOLLOW_32_in_ifStatement400); if (state.failed) return ;

            match(input,11,FOLLOW_11_in_ifStatement402); if (state.failed) return ;

            pushFollow(FOLLOW_exp_in_ifStatement404);
            exp();

            state._fsp--;
            if (state.failed) return ;

            match(input,12,FOLLOW_12_in_ifStatement406); if (state.failed) return ;

            match(input,41,FOLLOW_41_in_ifStatement410); if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:125:7: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID||LA8_0==32||LA8_0==36||LA8_0==40) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:125:9: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_ifStatement414);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,43,FOLLOW_43_in_ifStatement419); if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:126:3: ( 'else' '{' ( statement )* '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:126:5: 'else' '{' ( statement )* '}'
                    {
                    match(input,30,FOLLOW_30_in_ifStatement425); if (state.failed) return ;

                    match(input,41,FOLLOW_41_in_ifStatement427); if (state.failed) return ;

                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:126:16: ( statement )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ID||LA9_0==32||LA9_0==36||LA9_0==40) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:126:18: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifStatement431);
                    	    statement();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    match(input,43,FOLLOW_43_in_ifStatement438); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, ifStatement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "ifStatement"



    // $ANTLR start "whileStatement"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:130:1: whileStatement : 'while' '(' exp ')' '{' ( statement )* '}' ;
    public final void whileStatement() throws RecognitionException {
        int whileStatement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:131:2: ( 'while' '(' exp ')' '{' ( statement )* '}' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:131:4: 'while' '(' exp ')' '{' ( statement )* '}'
            {
            match(input,40,FOLLOW_40_in_whileStatement453); if (state.failed) return ;

            match(input,11,FOLLOW_11_in_whileStatement455); if (state.failed) return ;

            pushFollow(FOLLOW_exp_in_whileStatement457);
            exp();

            state._fsp--;
            if (state.failed) return ;

            match(input,12,FOLLOW_12_in_whileStatement459); if (state.failed) return ;

            match(input,41,FOLLOW_41_in_whileStatement463); if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:132:7: ( statement )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ID||LA11_0==32||LA11_0==36||LA11_0==40) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:132:9: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_whileStatement467);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input,43,FOLLOW_43_in_whileStatement472); if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, whileStatement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "whileStatement"



    // $ANTLR start "invokeExpStatement"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:135:1: invokeExpStatement : invokeExp ';' ;
    public final void invokeExpStatement() throws RecognitionException {
        int invokeExpStatement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:136:2: ( invokeExp ';' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:136:4: invokeExp ';'
            {
            pushFollow(FOLLOW_invokeExp_in_invokeExpStatement484);
            invokeExp();

            state._fsp--;
            if (state.failed) return ;

            match(input,19,FOLLOW_19_in_invokeExpStatement486); if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, invokeExpStatement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "invokeExpStatement"



    // $ANTLR start "returnStatement"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:139:1: returnStatement : 'return' ( exp )? ';' ;
    public final void returnStatement() throws RecognitionException {
        int returnStatement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:140:2: ( 'return' ( exp )? ';' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:140:4: 'return' ( exp )? ';'
            {
            match(input,36,FOLLOW_36_in_returnStatement498); if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:140:13: ( exp )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0 >= ID && LA12_0 <= NUM_INT)||LA12_0==7||LA12_0==11||LA12_0==14||LA12_0==16||LA12_0==31||LA12_0==34||LA12_0==38) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:140:15: exp
                    {
                    pushFollow(FOLLOW_exp_in_returnStatement502);
                    exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,19,FOLLOW_19_in_returnStatement507); if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, returnStatement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "returnStatement"



    // $ANTLR start "exp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:143:1: exp : logicalOrExp ;
    public final void exp() throws RecognitionException {
        int exp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:144:2: ( logicalOrExp )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:144:4: logicalOrExp
            {
            pushFollow(FOLLOW_logicalOrExp_in_exp519);
            logicalOrExp();

            state._fsp--;
            if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, exp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "exp"



    // $ANTLR start "logicalOrExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:147:1: logicalOrExp : logicalAndExp ( '||' logicalAndExp )* ;
    public final void logicalOrExp() throws RecognitionException {
        int logicalOrExp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:148:2: ( logicalAndExp ( '||' logicalAndExp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:148:4: logicalAndExp ( '||' logicalAndExp )*
            {
            pushFollow(FOLLOW_logicalAndExp_in_logicalOrExp531);
            logicalAndExp();

            state._fsp--;
            if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:148:18: ( '||' logicalAndExp )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==42) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:148:20: '||' logicalAndExp
            	    {
            	    match(input,42,FOLLOW_42_in_logicalOrExp535); if (state.failed) return ;

            	    pushFollow(FOLLOW_logicalAndExp_in_logicalOrExp537);
            	    logicalAndExp();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, logicalOrExp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "logicalOrExp"



    // $ANTLR start "logicalAndExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:151:1: logicalAndExp : equalityExp ( '&&' equalityExp )* ;
    public final void logicalAndExp() throws RecognitionException {
        int logicalAndExp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:152:2: ( equalityExp ( '&&' equalityExp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:152:4: equalityExp ( '&&' equalityExp )*
            {
            pushFollow(FOLLOW_equalityExp_in_logicalAndExp552);
            equalityExp();

            state._fsp--;
            if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:152:16: ( '&&' equalityExp )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==10) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:152:18: '&&' equalityExp
            	    {
            	    match(input,10,FOLLOW_10_in_logicalAndExp556); if (state.failed) return ;

            	    pushFollow(FOLLOW_equalityExp_in_logicalAndExp558);
            	    equalityExp();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, logicalAndExp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "logicalAndExp"



    // $ANTLR start "equalityExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:155:1: equalityExp : relationalExp ( ( '!=' | '==' ) relationalExp )* ;
    public final void equalityExp() throws RecognitionException {
        int equalityExp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:156:2: ( relationalExp ( ( '!=' | '==' ) relationalExp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:156:4: relationalExp ( ( '!=' | '==' ) relationalExp )*
            {
            pushFollow(FOLLOW_relationalExp_in_equalityExp573);
            relationalExp();

            state._fsp--;
            if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:156:18: ( ( '!=' | '==' ) relationalExp )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==8||LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:156:20: ( '!=' | '==' ) relationalExp
            	    {
            	    if ( input.LA(1)==8||input.LA(1)==23 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relationalExp_in_equalityExp585);
            	    relationalExp();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, equalityExp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "equalityExp"



    // $ANTLR start "relationalExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:159:1: relationalExp : additiveExp ( ( '<' | '>' | '<=' | '>=' ) additiveExp )* ;
    public final void relationalExp() throws RecognitionException {
        int relationalExp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:160:2: ( additiveExp ( ( '<' | '>' | '<=' | '>=' ) additiveExp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:160:4: additiveExp ( ( '<' | '>' | '<=' | '>=' ) additiveExp )*
            {
            pushFollow(FOLLOW_additiveExp_in_relationalExp600);
            additiveExp();

            state._fsp--;
            if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:160:16: ( ( '<' | '>' | '<=' | '>=' ) additiveExp )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= 20 && LA16_0 <= 21)||(LA16_0 >= 24 && LA16_0 <= 25)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:160:18: ( '<' | '>' | '<=' | '>=' ) additiveExp
            	    {
            	    if ( (input.LA(1) >= 20 && input.LA(1) <= 21)||(input.LA(1) >= 24 && input.LA(1) <= 25) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additiveExp_in_relationalExp622);
            	    additiveExp();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, relationalExp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "relationalExp"



    // $ANTLR start "additiveExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:163:1: additiveExp : multiplicativeExp ( ( '+' | '-' ) multiplicativeExp )* ;
    public final void additiveExp() throws RecognitionException {
        int additiveExp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:164:2: ( multiplicativeExp ( ( '+' | '-' ) multiplicativeExp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:164:4: multiplicativeExp ( ( '+' | '-' ) multiplicativeExp )*
            {
            pushFollow(FOLLOW_multiplicativeExp_in_additiveExp637);
            multiplicativeExp();

            state._fsp--;
            if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:164:22: ( ( '+' | '-' ) multiplicativeExp )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14||LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:164:24: ( '+' | '-' ) multiplicativeExp
            	    {
            	    if ( input.LA(1)==14||input.LA(1)==16 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicativeExp_in_additiveExp651);
            	    multiplicativeExp();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, additiveExp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "additiveExp"



    // $ANTLR start "multiplicativeExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:167:1: multiplicativeExp : unaryExp ( ( '*' | '/' | '%' ) unaryExp )* ;
    public final void multiplicativeExp() throws RecognitionException {
        int multiplicativeExp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:168:2: ( unaryExp ( ( '*' | '/' | '%' ) unaryExp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:168:4: unaryExp ( ( '*' | '/' | '%' ) unaryExp )*
            {
            pushFollow(FOLLOW_unaryExp_in_multiplicativeExp666);
            unaryExp();

            state._fsp--;
            if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:168:13: ( ( '*' | '/' | '%' ) unaryExp )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==9||LA18_0==13||LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:168:15: ( '*' | '/' | '%' ) unaryExp
            	    {
            	    if ( input.LA(1)==9||input.LA(1)==13||input.LA(1)==18 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExp_in_multiplicativeExp684);
            	    unaryExp();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, multiplicativeExp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "multiplicativeExp"



    // $ANTLR start "unaryExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:171:1: unaryExp : ( '-' unaryExp | '+' unaryExp | unaryExpNotPlusMinus );
    public final void unaryExp() throws RecognitionException {
        int unaryExp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:172:2: ( '-' unaryExp | '+' unaryExp | unaryExpNotPlusMinus )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt19=1;
                }
                break;
            case 14:
                {
                alt19=2;
                }
                break;
            case ID:
            case NUM_INT:
            case 7:
            case 11:
            case 31:
            case 34:
            case 38:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:172:4: '-' unaryExp
                    {
                    match(input,16,FOLLOW_16_in_unaryExp699); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExp_in_unaryExp701);
                    unaryExp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:173:4: '+' unaryExp
                    {
                    match(input,14,FOLLOW_14_in_unaryExp706); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExp_in_unaryExp708);
                    unaryExp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:174:4: unaryExpNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpNotPlusMinus_in_unaryExp713);
                    unaryExpNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, unaryExp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "unaryExp"



    // $ANTLR start "unaryExpNotPlusMinus"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:177:1: unaryExpNotPlusMinus : ( '!' unaryExp | primaryExp );
    public final void unaryExpNotPlusMinus() throws RecognitionException {
        int unaryExpNotPlusMinus_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:178:2: ( '!' unaryExp | primaryExp )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==7) ) {
                alt20=1;
            }
            else if ( ((LA20_0 >= ID && LA20_0 <= NUM_INT)||LA20_0==11||LA20_0==31||LA20_0==34||LA20_0==38) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:178:4: '!' unaryExp
                    {
                    match(input,7,FOLLOW_7_in_unaryExpNotPlusMinus725); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExp_in_unaryExpNotPlusMinus727);
                    unaryExp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:179:4: primaryExp
                    {
                    pushFollow(FOLLOW_primaryExp_in_unaryExpNotPlusMinus732);
                    primaryExp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, unaryExpNotPlusMinus_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "unaryExpNotPlusMinus"



    // $ANTLR start "primaryExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:182:1: primaryExp : (n= NUM_INT {...}?| 'true' | 'false' | 'null' | '(' exp ')' | invokeExp | ID );
    public final void primaryExp() throws RecognitionException {
        int primaryExp_StartIndex = input.index();

        Token n=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:183:2: (n= NUM_INT {...}?| 'true' | 'false' | 'null' | '(' exp ')' | invokeExp | ID )
            int alt21=7;
            switch ( input.LA(1) ) {
            case NUM_INT:
                {
                alt21=1;
                }
                break;
            case 38:
                {
                alt21=2;
                }
                break;
            case 31:
                {
                alt21=3;
                }
                break;
            case 34:
                {
                alt21=4;
                }
                break;
            case 11:
                {
                alt21=5;
                }
                break;
            case ID:
                {
                int LA21_6 = input.LA(2);

                if ( (LA21_6==11||LA21_6==17) ) {
                    alt21=6;
                }
                else if ( (LA21_6==EOF||(LA21_6 >= 8 && LA21_6 <= 10)||(LA21_6 >= 12 && LA21_6 <= 16)||(LA21_6 >= 18 && LA21_6 <= 21)||(LA21_6 >= 23 && LA21_6 <= 25)||LA21_6==42) ) {
                    alt21=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:183:4: n= NUM_INT {...}?
                    {
                    n=(Token)match(input,NUM_INT,FOLLOW_NUM_INT_in_primaryExp746); if (state.failed) return ;

                    if ( !(( new BigInteger(n.getText()).bitLength() < 32 )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "primaryExp", " new BigInteger(n.getText()).bitLength() < 32 ");
                    }

                    }
                    break;
                case 2 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:185:4: 'true'
                    {
                    match(input,38,FOLLOW_38_in_primaryExp755); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:186:4: 'false'
                    {
                    match(input,31,FOLLOW_31_in_primaryExp760); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:187:4: 'null'
                    {
                    match(input,34,FOLLOW_34_in_primaryExp765); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:188:4: '(' exp ')'
                    {
                    match(input,11,FOLLOW_11_in_primaryExp770); if (state.failed) return ;

                    pushFollow(FOLLOW_exp_in_primaryExp772);
                    exp();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,12,FOLLOW_12_in_primaryExp774); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:189:4: invokeExp
                    {
                    pushFollow(FOLLOW_invokeExp_in_primaryExp779);
                    invokeExp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:190:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_primaryExp784); if (state.failed) return ;

                    }
                    break;

            }
        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, primaryExp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "primaryExp"



    // $ANTLR start "invokeExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:193:1: invokeExp : ( ID '.' )? ID '(' ( args )? ')' ;
    public final void invokeExp() throws RecognitionException {
        int invokeExp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:194:2: ( ( ID '.' )? ID '(' ( args )? ')' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:194:4: ( ID '.' )? ID '(' ( args )? ')'
            {
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:194:4: ( ID '.' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==17) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:194:6: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_invokeExp798); if (state.failed) return ;

                    match(input,17,FOLLOW_17_in_invokeExp800); if (state.failed) return ;

                    }
                    break;

            }


            match(input,ID,FOLLOW_ID_in_invokeExp807); if (state.failed) return ;

            match(input,11,FOLLOW_11_in_invokeExp809); if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:195:10: ( args )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0 >= ID && LA23_0 <= NUM_INT)||LA23_0==7||LA23_0==11||LA23_0==14||LA23_0==16||LA23_0==31||LA23_0==34||LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:195:12: args
                    {
                    pushFollow(FOLLOW_args_in_invokeExp813);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,12,FOLLOW_12_in_invokeExp818); if (state.failed) return ;

            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, invokeExp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "invokeExp"



    // $ANTLR start "args"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:198:1: args : exp ( ',' exp )* ;
    public final void args() throws RecognitionException {
        int args_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:199:2: ( exp ( ',' exp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:199:4: exp ( ',' exp )*
            {
            pushFollow(FOLLOW_exp_in_args830);
            exp();

            state._fsp--;
            if (state.failed) return ;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:199:8: ( ',' exp )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==15) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJava.g:199:10: ',' exp
            	    {
            	    match(input,15,FOLLOW_15_in_args834); if (state.failed) return ;

            	    pushFollow(FOLLOW_exp_in_args836);
            	    exp();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

        }
         
         /**
          * Eliminate rule error recovery so that all parse errors 
          * cause exceptions to propogate out of the top-level parse
          * method.  
          */

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, args_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "args"

    // Delegated rules


 

    public static final BitSet FOLLOW_classDefinition_in_compilationUnit55 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_compilationUnit59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_classDefinition70 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_classDefinition72 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_classDefinition74 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_classDefinition76 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_mainMethodDeclaration_in_classDefinition81 = new BitSet(new long[]{0x0000082000000000L});
    public static final BitSet FOLLOW_fieldDeclaration_in_classDefinition87 = new BitSet(new long[]{0x0000082000000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_classDefinition93 = new BitSet(new long[]{0x0000082000000000L});
    public static final BitSet FOLLOW_43_in_classDefinition100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_mainMethodDeclaration111 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_mainMethodDeclaration113 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_mainMethodDeclaration115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_mainMethodDeclaration124 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_mainMethodDeclaration139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_mainMethodDeclaration143 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_mainMethodDeclaration145 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_mainMethodDeclaration147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_mainMethodDeclaration162 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_mainMethodDeclaration169 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_mainMethodDeclaration171 = new BitSet(new long[]{0x0000091310000010L});
    public static final BitSet FOLLOW_methodBody_in_mainMethodDeclaration173 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_mainMethodDeclaration175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_fieldDeclaration187 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_type_in_fieldDeclaration189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fieldDeclaration191 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_fieldDeclaration193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_methodDeclaration205 = new BitSet(new long[]{0x0000008210000000L});
    public static final BitSet FOLLOW_returnType_in_methodDeclaration207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration209 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_methodDeclaration213 = new BitSet(new long[]{0x0000000210001000L});
    public static final BitSet FOLLOW_params_in_methodDeclaration217 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_methodDeclaration222 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_methodDeclaration226 = new BitSet(new long[]{0x0000091310000010L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration228 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_methodDeclaration230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_returnType256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_returnType260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params272 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_params276 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_param_in_params278 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_type_in_param293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_param295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDeclaration_in_methodBody306 = new BitSet(new long[]{0x0000011310000012L});
    public static final BitSet FOLLOW_statement_in_methodBody312 = new BitSet(new long[]{0x0000011100000012L});
    public static final BitSet FOLLOW_type_in_localDeclaration324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_localDeclaration326 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_localDeclaration328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStatement_in_statement342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invokeExpStatement_in_statement360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statement366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignStatement382 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_assignStatement384 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_exp_in_assignStatement386 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_assignStatement388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ifStatement400 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ifStatement402 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_exp_in_ifStatement404 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ifStatement406 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ifStatement410 = new BitSet(new long[]{0x0000091100000010L});
    public static final BitSet FOLLOW_statement_in_ifStatement414 = new BitSet(new long[]{0x0000091100000010L});
    public static final BitSet FOLLOW_43_in_ifStatement419 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ifStatement425 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ifStatement427 = new BitSet(new long[]{0x0000091100000010L});
    public static final BitSet FOLLOW_statement_in_ifStatement431 = new BitSet(new long[]{0x0000091100000010L});
    public static final BitSet FOLLOW_43_in_ifStatement438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_whileStatement453 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_whileStatement455 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_exp_in_whileStatement457 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_whileStatement459 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_whileStatement463 = new BitSet(new long[]{0x0000091100000010L});
    public static final BitSet FOLLOW_statement_in_whileStatement467 = new BitSet(new long[]{0x0000091100000010L});
    public static final BitSet FOLLOW_43_in_whileStatement472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invokeExp_in_invokeExpStatement484 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_invokeExpStatement486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_returnStatement498 = new BitSet(new long[]{0x00000044800948B0L});
    public static final BitSet FOLLOW_exp_in_returnStatement502 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_returnStatement507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExp_in_exp519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAndExp_in_logicalOrExp531 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_logicalOrExp535 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_logicalAndExp_in_logicalOrExp537 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_equalityExp_in_logicalAndExp552 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_logicalAndExp556 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_equalityExp_in_logicalAndExp558 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp573 = new BitSet(new long[]{0x0000000000800102L});
    public static final BitSet FOLLOW_set_in_equalityExp577 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp585 = new BitSet(new long[]{0x0000000000800102L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp600 = new BitSet(new long[]{0x0000000003300002L});
    public static final BitSet FOLLOW_set_in_relationalExp604 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp622 = new BitSet(new long[]{0x0000000003300002L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp637 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_set_in_additiveExp641 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp651 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp666 = new BitSet(new long[]{0x0000000000042202L});
    public static final BitSet FOLLOW_set_in_multiplicativeExp670 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp684 = new BitSet(new long[]{0x0000000000042202L});
    public static final BitSet FOLLOW_16_in_unaryExp699 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_unaryExp_in_unaryExp701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_unaryExp706 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_unaryExp_in_unaryExp708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpNotPlusMinus_in_unaryExp713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_unaryExpNotPlusMinus725 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_unaryExp_in_unaryExpNotPlusMinus727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExp_in_unaryExpNotPlusMinus732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_INT_in_primaryExp746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_primaryExp755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_primaryExp760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_primaryExp765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_primaryExp770 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_exp_in_primaryExp772 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_primaryExp774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invokeExp_in_primaryExp779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primaryExp784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_invokeExp798 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_invokeExp800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_invokeExp807 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_invokeExp809 = new BitSet(new long[]{0x00000044800158B0L});
    public static final BitSet FOLLOW_args_in_invokeExp813 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_invokeExp818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_args830 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_args834 = new BitSet(new long[]{0x00000044800148B0L});
    public static final BitSet FOLLOW_exp_in_args836 = new BitSet(new long[]{0x0000000000008002L});

}