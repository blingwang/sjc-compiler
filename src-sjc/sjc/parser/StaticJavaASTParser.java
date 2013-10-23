// $ANTLR 3.4 /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g 2012-11-15 19:51:55

package sjc.parser;

import org.eclipse.jdt.core.dom.*;

import java.math.BigInteger;

import java.util.ArrayList;

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
public class StaticJavaASTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUM_INT", "WS", "'!'", "'!='", "'%'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'['", "']'", "'boolean'", "'class'", "'else'", "'false'", "'if'", "'int'", "'public'", "'return'", "'static'", "'true'", "'void'", "'while'", "'{'", "'||'", "'}'"
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
    public static final int ID=4;
    public static final int NUM_INT=5;
    public static final int WS=6;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public StaticJavaASTParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public StaticJavaASTParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[70+1];
         

    }

    public String[] getTokenNames() { return StaticJavaASTParser.tokenNames; }
    public String getGrammarFileName() { return "/home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g"; }


    	protected AST ast = AST.newAST(AST.JLS3);



    // $ANTLR start "compilationUnit"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:37:1: compilationUnit returns [CompilationUnit result = ast.newCompilationUnit()] : td= classDefinition EOF ;
    public final CompilationUnit compilationUnit() throws RecognitionException {
        CompilationUnit result =  ast.newCompilationUnit();

        int compilationUnit_StartIndex = input.index();

        TypeDeclaration td =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:38:2: (td= classDefinition EOF )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:38:4: td= classDefinition EOF
            {
            pushFollow(FOLLOW_classDefinition_in_compilationUnit53);
            td=classDefinition();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result.types().add(td); }

            match(input,EOF,FOLLOW_EOF_in_compilationUnit76); if (state.failed) return result;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "compilationUnit"



    // $ANTLR start "classDefinition"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:42:1: classDefinition returns [TypeDeclaration result = ast.newTypeDeclaration()] : 'public' 'class' ID '{' md= mainMethodDeclaration (fd= fieldDeclaration |md= methodDeclaration )* '}' ;
    public final TypeDeclaration classDefinition() throws RecognitionException {
        TypeDeclaration result =  ast.newTypeDeclaration();

        int classDefinition_StartIndex = input.index();

        Token ID1=null;
        MethodDeclaration md =null;

        FieldDeclaration fd =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:43:2: ( 'public' 'class' ID '{' md= mainMethodDeclaration (fd= fieldDeclaration |md= methodDeclaration )* '}' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:43:4: 'public' 'class' ID '{' md= mainMethodDeclaration (fd= fieldDeclaration |md= methodDeclaration )* '}'
            {
            match(input,34,FOLLOW_34_in_classDefinition92); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD)); }

            match(input,29,FOLLOW_29_in_classDefinition122); if (state.failed) return result;

            ID1=(Token)match(input,ID,FOLLOW_ID_in_classDefinition124); if (state.failed) return result;

            match(input,40,FOLLOW_40_in_classDefinition126); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setName(ast.newSimpleName((ID1!=null?ID1.getText():null))); }

            pushFollow(FOLLOW_mainMethodDeclaration_in_classDefinition160);
            md=mainMethodDeclaration();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result.bodyDeclarations().add(md); }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:46:3: (fd= fieldDeclaration |md= methodDeclaration )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==36) ) {
                    switch ( input.LA(2) ) {
                    case 28:
                        {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==ID) ) {
                            int LA1_6 = input.LA(4);

                            if ( (LA1_6==11) ) {
                                alt1=2;
                            }
                            else if ( (LA1_6==19) ) {
                                alt1=1;
                            }


                        }


                        }
                        break;
                    case 33:
                        {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==ID) ) {
                            int LA1_6 = input.LA(4);

                            if ( (LA1_6==11) ) {
                                alt1=2;
                            }
                            else if ( (LA1_6==19) ) {
                                alt1=1;
                            }


                        }


                        }
                        break;
                    case 38:
                        {
                        alt1=2;
                        }
                        break;

                    }

                }


                switch (alt1) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:46:5: fd= fieldDeclaration
            	    {
            	    pushFollow(FOLLOW_fieldDeclaration_in_classDefinition182);
            	    fd=fieldDeclaration();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { result.bodyDeclarations().add(fd); }

            	    }
            	    break;
            	case 2 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:47:5: md= methodDeclaration
            	    {
            	    pushFollow(FOLLOW_methodDeclaration_in_classDefinition210);
            	    md=methodDeclaration();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { result.bodyDeclarations().add(md); }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,42,FOLLOW_42_in_classDefinition239); if (state.failed) return result;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, classDefinition_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "classDefinition"



    // $ANTLR start "mainMethodDeclaration"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:53:1: mainMethodDeclaration returns [MethodDeclaration result = ast.newMethodDeclaration()] : 'public' 'static' 'void' id1= ID {...}? '(' id2= ID {...}? '[' ']' id3= ID ')' '{' b= methodBody '}' ;
    public final MethodDeclaration mainMethodDeclaration() throws RecognitionException {
        MethodDeclaration result =  ast.newMethodDeclaration();

        int mainMethodDeclaration_StartIndex = input.index();

        Token id1=null;
        Token id2=null;
        Token id3=null;
        Block b =null;



        	SingleVariableDeclaration svd = ast.newSingleVariableDeclaration();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:57:2: ( 'public' 'static' 'void' id1= ID {...}? '(' id2= ID {...}? '[' ']' id3= ID ')' '{' b= methodBody '}' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:57:4: 'public' 'static' 'void' id1= ID {...}? '(' id2= ID {...}? '[' ']' id3= ID ')' '{' b= methodBody '}'
            {
            match(input,34,FOLLOW_34_in_mainMethodDeclaration260); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD)); }

            match(input,36,FOLLOW_36_in_mainMethodDeclaration297); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD)); }

            match(input,38,FOLLOW_38_in_mainMethodDeclaration334); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setReturnType2(ast.newPrimitiveType(PrimitiveType.VOID)); }

            id1=(Token)match(input,ID,FOLLOW_ID_in_mainMethodDeclaration375); if (state.failed) return result;

            if ( !(("main".equals((id1!=null?id1.getText():null)))) ) {
                if (state.backtracking>0) {state.failed=true; return result;}
                throw new FailedPredicateException(input, "mainMethodDeclaration", "\"main\".equals($id1.text)");
            }

            if ( state.backtracking==0 ) { result.setName(ast.newSimpleName("main")); }

            match(input,11,FOLLOW_11_in_mainMethodDeclaration389); if (state.failed) return result;

            id2=(Token)match(input,ID,FOLLOW_ID_in_mainMethodDeclaration396); if (state.failed) return result;

            if ( !(("String".equals((id2!=null?id2.getText():null)))) ) {
                if (state.backtracking>0) {state.failed=true; return result;}
                throw new FailedPredicateException(input, "mainMethodDeclaration", "\"String\".equals($id2.text)");
            }

            if ( state.backtracking==0 ) { svd.setType(ast.newArrayType(ast.newSimpleType(ast.newSimpleName("String")))); }

            match(input,26,FOLLOW_26_in_mainMethodDeclaration407); if (state.failed) return result;

            match(input,27,FOLLOW_27_in_mainMethodDeclaration409); if (state.failed) return result;

            id3=(Token)match(input,ID,FOLLOW_ID_in_mainMethodDeclaration413); if (state.failed) return result;

            if ( state.backtracking==0 ) { svd.setName(ast.newSimpleName((id3!=null?id3.getText():null)));
            		                                          result.parameters().add(svd); }

            match(input,12,FOLLOW_12_in_mainMethodDeclaration444); if (state.failed) return result;

            match(input,40,FOLLOW_40_in_mainMethodDeclaration446); if (state.failed) return result;

            pushFollow(FOLLOW_methodBody_in_mainMethodDeclaration450);
            b=methodBody();

            state._fsp--;
            if (state.failed) return result;

            match(input,42,FOLLOW_42_in_mainMethodDeclaration452); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setBody(b); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, mainMethodDeclaration_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "mainMethodDeclaration"



    // $ANTLR start "fieldDeclaration"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:69:1: fieldDeclaration returns [FieldDeclaration result = null] : 'static' fieldType= type ID ';' ;
    public final FieldDeclaration fieldDeclaration() throws RecognitionException {
        FieldDeclaration result =  null;

        int fieldDeclaration_StartIndex = input.index();

        Token ID2=null;
        Type fieldType =null;



        	VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();;
        	result = ast.newFieldDeclaration(vdf);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:74:2: ( 'static' fieldType= type ID ';' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:74:4: 'static' fieldType= type ID ';'
            {
            match(input,36,FOLLOW_36_in_fieldDeclaration490); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD)); }

            pushFollow(FOLLOW_type_in_fieldDeclaration530);
            fieldType=type();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setType(fieldType); }

            ID2=(Token)match(input,ID,FOLLOW_ID_in_fieldDeclaration562); if (state.failed) return result;

            if ( state.backtracking==0 ) { vdf.setName(ast.newSimpleName(ID2.getText())); }

            match(input,19,FOLLOW_19_in_fieldDeclaration605); if (state.failed) return result;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, fieldDeclaration_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "fieldDeclaration"



    // $ANTLR start "methodDeclaration"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:80:1: methodDeclaration returns [MethodDeclaration result = ast.newMethodDeclaration()] : 'static' retType= returnType ID '(' (sdvs= params )? ')' '{' b= methodBody '}' ;
    public final MethodDeclaration methodDeclaration() throws RecognitionException {
        MethodDeclaration result =  ast.newMethodDeclaration();

        int methodDeclaration_StartIndex = input.index();

        Token ID3=null;
        Type retType =null;

        ArrayList<SingleVariableDeclaration> sdvs =null;

        Block b =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:81:2: ( 'static' retType= returnType ID '(' (sdvs= params )? ')' '{' b= methodBody '}' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:81:4: 'static' retType= returnType ID '(' (sdvs= params )? ')' '{' b= methodBody '}'
            {
            match(input,36,FOLLOW_36_in_methodDeclaration621); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD)); }

            pushFollow(FOLLOW_returnType_in_methodDeclaration661);
            retType=returnType();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setReturnType2(retType); }

            ID3=(Token)match(input,ID,FOLLOW_ID_in_methodDeclaration688); if (state.failed) return result;

            match(input,11,FOLLOW_11_in_methodDeclaration690); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setName(ast.newSimpleName((ID3!=null?ID3.getText():null))); }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:84:3: (sdvs= params )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28||LA2_0==33) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:85:4: sdvs= params
                    {
                    pushFollow(FOLLOW_params_in_methodDeclaration733);
                    sdvs=params();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result.parameters().addAll(sdvs); }

                    }
                    break;

            }


            match(input,12,FOLLOW_12_in_methodDeclaration770); if (state.failed) return result;

            match(input,40,FOLLOW_40_in_methodDeclaration772); if (state.failed) return result;

            pushFollow(FOLLOW_methodBody_in_methodDeclaration776);
            b=methodBody();

            state._fsp--;
            if (state.failed) return result;

            match(input,42,FOLLOW_42_in_methodDeclaration778); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setBody(b); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, methodDeclaration_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "methodDeclaration"



    // $ANTLR start "type"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:90:1: type returns [Type result = null] : ( 'boolean' | 'int' );
    public final Type type() throws RecognitionException {
        Type result =  null;

        int type_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:91:2: ( 'boolean' | 'int' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:91:4: 'boolean'
                    {
                    match(input,28,FOLLOW_28_in_type811); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = ast.newPrimitiveType(PrimitiveType.BOOLEAN); }

                    }
                    break;
                case 2 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:92:4: 'int'
                    {
                    match(input,33,FOLLOW_33_in_type848); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = ast.newPrimitiveType(PrimitiveType.INT); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, type_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "type"



    // $ANTLR start "returnType"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:95:1: returnType returns [Type result = null] : ( 'void' |t= type );
    public final Type returnType() throws RecognitionException {
        Type result =  null;

        int returnType_StartIndex = input.index();

        Type t =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:96:2: ( 'void' |t= type )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==38) ) {
                alt4=1;
            }
            else if ( (LA4_0==28||LA4_0==33) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:96:4: 'void'
                    {
                    match(input,38,FOLLOW_38_in_returnType900); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = ast.newPrimitiveType(PrimitiveType.VOID); }

                    }
                    break;
                case 2 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:97:4: t= type
                    {
                    pushFollow(FOLLOW_type_in_returnType940);
                    t=type();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = t; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, returnType_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "returnType"



    // $ANTLR start "params"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:100:1: params returns [ArrayList<SingleVariableDeclaration> result = new ArrayList<SingleVariableDeclaration>()] : svd= param ( ',' svd= param )* ;
    public final ArrayList<SingleVariableDeclaration> params() throws RecognitionException {
        ArrayList<SingleVariableDeclaration> result =  new ArrayList<SingleVariableDeclaration>();

        int params_StartIndex = input.index();

        SingleVariableDeclaration svd =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:101:2: (svd= param ( ',' svd= param )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:101:4: svd= param ( ',' svd= param )*
            {
            pushFollow(FOLLOW_param_in_params993);
            svd=param();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result.add(svd); }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:102:3: ( ',' svd= param )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:102:5: ',' svd= param
            	    {
            	    match(input,15,FOLLOW_15_in_params1032); if (state.failed) return result;

            	    pushFollow(FOLLOW_param_in_params1036);
            	    svd=param();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { result.add(svd); }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, params_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "params"



    // $ANTLR start "param"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:106:1: param returns [SingleVariableDeclaration result = ast.newSingleVariableDeclaration()] : paramType= type ID ;
    public final SingleVariableDeclaration param() throws RecognitionException {
        SingleVariableDeclaration result =  ast.newSingleVariableDeclaration();

        int param_StartIndex = input.index();

        Token ID4=null;
        Type paramType =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:107:2: (paramType= type ID )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:107:4: paramType= type ID
            {
            pushFollow(FOLLOW_type_in_param1085);
            paramType=type();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setType(paramType); }

            ID4=(Token)match(input,ID,FOLLOW_ID_in_param1116); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setName(ast.newSimpleName((ID4!=null?ID4.getText():null))); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, param_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "param"



    // $ANTLR start "methodBody"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:111:1: methodBody returns [Block result = ast.newBlock()] : (l= localDeclaration )* (s= statement )* ;
    public final Block methodBody() throws RecognitionException {
        Block result =  ast.newBlock();

        int methodBody_StartIndex = input.index();

        VariableDeclarationStatement l =null;

        Statement s =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:112:2: ( (l= localDeclaration )* (s= statement )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:113:3: (l= localDeclaration )* (s= statement )*
            {
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:113:3: (l= localDeclaration )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28||LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:113:5: l= localDeclaration
            	    {
            	    pushFollow(FOLLOW_localDeclaration_in_methodBody1178);
            	    l=localDeclaration();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { result.statements().add(l); }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:115:3: (s= statement )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID||LA7_0==32||LA7_0==35||LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:115:5: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_methodBody1212);
            	    s=statement();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { result.statements().add(s); }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, methodBody_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "methodBody"



    // $ANTLR start "localDeclaration"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:119:1: localDeclaration returns [VariableDeclarationStatement result = null] : localType= type ID ';' ;
    public final VariableDeclarationStatement localDeclaration() throws RecognitionException {
        VariableDeclarationStatement result =  null;

        int localDeclaration_StartIndex = input.index();

        Token ID5=null;
        Type localType =null;



        	VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();
        	result = ast.newVariableDeclarationStatement(vdf);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:124:2: (localType= type ID ';' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:124:4: localType= type ID ';'
            {
            pushFollow(FOLLOW_type_in_localDeclaration1267);
            localType=type();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setType(localType); }

            ID5=(Token)match(input,ID,FOLLOW_ID_in_localDeclaration1298); if (state.failed) return result;

            match(input,19,FOLLOW_19_in_localDeclaration1300); if (state.failed) return result;

            if ( state.backtracking==0 ) { vdf.setName(ast.newSimpleName((ID5!=null?ID5.getText():null))); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, localDeclaration_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "localDeclaration"



    // $ANTLR start "statement"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:128:1: statement returns [Statement result = null] : (a= assignStatement |i= ifStatement |w= whileStatement |in= invokeExpStatement |r= returnStatement ) ;
    public final Statement statement() throws RecognitionException {
        Statement result =  null;

        int statement_StartIndex = input.index();

        ExpressionStatement a =null;

        IfStatement i =null;

        WhileStatement w =null;

        ExpressionStatement in =null;

        ReturnStatement r =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:129:2: ( (a= assignStatement |i= ifStatement |w= whileStatement |in= invokeExpStatement |r= returnStatement ) )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:129:4: (a= assignStatement |i= ifStatement |w= whileStatement |in= invokeExpStatement |r= returnStatement )
            {
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:129:4: (a= assignStatement |i= ifStatement |w= whileStatement |in= invokeExpStatement |r= returnStatement )
            int alt8=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==22) ) {
                    alt8=1;
                }
                else if ( (LA8_1==11||LA8_1==17) ) {
                    alt8=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 39:
                {
                alt8=3;
                }
                break;
            case 35:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:129:6: a= assignStatement
                    {
                    pushFollow(FOLLOW_assignStatement_in_statement1355);
                    a=assignStatement();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = a; }

                    }
                    break;
                case 2 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:130:5: i= ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1385);
                    i=ifStatement();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = i; }

                    }
                    break;
                case 3 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:131:5: w= whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1419);
                    w=whileStatement();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = w; }

                    }
                    break;
                case 4 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:132:5: in= invokeExpStatement
                    {
                    pushFollow(FOLLOW_invokeExpStatement_in_statement1450);
                    in=invokeExpStatement();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = in; }

                    }
                    break;
                case 5 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:133:5: r= returnStatement
                    {
                    pushFollow(FOLLOW_returnStatement_in_statement1476);
                    r=returnStatement();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = r; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, statement_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "statement"



    // $ANTLR start "assignStatement"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:137:1: assignStatement returns [ExpressionStatement result = null] : ID '=' e= exp ';' ;
    public final ExpressionStatement assignStatement() throws RecognitionException {
        ExpressionStatement result =  null;

        int assignStatement_StartIndex = input.index();

        Token ID6=null;
        Expression e =null;



        	Assignment a = ast.newAssignment();
        	result = ast.newExpressionStatement(a);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:142:2: ( ID '=' e= exp ';' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:142:4: ID '=' e= exp ';'
            {
            ID6=(Token)match(input,ID,FOLLOW_ID_in_assignStatement1523); if (state.failed) return result;

            if ( state.backtracking==0 ) { a.setLeftHandSide(ast.newSimpleName((ID6!=null?ID6.getText():null))); }

            match(input,22,FOLLOW_22_in_assignStatement1566); if (state.failed) return result;

            pushFollow(FOLLOW_exp_in_assignStatement1570);
            e=exp();

            state._fsp--;
            if (state.failed) return result;

            match(input,19,FOLLOW_19_in_assignStatement1572); if (state.failed) return result;

            if ( state.backtracking==0 ) { a.setRightHandSide(e); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, assignStatement_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "assignStatement"



    // $ANTLR start "ifStatement"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:146:1: ifStatement returns [IfStatement result = ast.newIfStatement()] : 'if' '(' condExp= exp ')' '{' (s= statement )* '}' ( 'else' '{' (s= statement )* '}' )? ;
    public final IfStatement ifStatement() throws RecognitionException {
        IfStatement result =  ast.newIfStatement();

        int ifStatement_StartIndex = input.index();

        Expression condExp =null;

        Statement s =null;



        	Block thenStatement = ast.newBlock();
        	result.setThenStatement(thenStatement);
        	Block elseStatement = ast.newBlock();
        	result.setElseStatement(elseStatement);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:153:2: ( 'if' '(' condExp= exp ')' '{' (s= statement )* '}' ( 'else' '{' (s= statement )* '}' )? )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:153:4: 'if' '(' condExp= exp ')' '{' (s= statement )* '}' ( 'else' '{' (s= statement )* '}' )?
            {
            match(input,32,FOLLOW_32_in_ifStatement1620); if (state.failed) return result;

            match(input,11,FOLLOW_11_in_ifStatement1622); if (state.failed) return result;

            pushFollow(FOLLOW_exp_in_ifStatement1626);
            condExp=exp();

            state._fsp--;
            if (state.failed) return result;

            match(input,12,FOLLOW_12_in_ifStatement1628); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setExpression(condExp); }

            match(input,40,FOLLOW_40_in_ifStatement1649); if (state.failed) return result;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:155:3: (s= statement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID||LA9_0==32||LA9_0==35||LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:156:4: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_ifStatement1661);
            	    s=statement();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { thenStatement.statements().add(s); }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input,42,FOLLOW_42_in_ifStatement1699); if (state.failed) return result;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:159:3: ( 'else' '{' (s= statement )* '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:159:5: 'else' '{' (s= statement )* '}'
                    {
                    match(input,30,FOLLOW_30_in_ifStatement1705); if (state.failed) return result;

                    match(input,40,FOLLOW_40_in_ifStatement1707); if (state.failed) return result;

                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:160:4: (s= statement )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==ID||LA10_0==32||LA10_0==35||LA10_0==39) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:161:5: s= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifStatement1722);
                    	    s=statement();

                    	    state._fsp--;
                    	    if (state.failed) return result;

                    	    if ( state.backtracking==0 ) { elseStatement.statements().add(s); }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    match(input,42,FOLLOW_42_in_ifStatement1756); if (state.failed) return result;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, ifStatement_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "ifStatement"



    // $ANTLR start "whileStatement"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:165:1: whileStatement returns [WhileStatement result = ast.newWhileStatement()] : 'while' '(' condExp= exp ')' '{' (s= statement )* '}' ;
    public final WhileStatement whileStatement() throws RecognitionException {
        WhileStatement result =  ast.newWhileStatement();

        int whileStatement_StartIndex = input.index();

        Expression condExp =null;

        Statement s =null;



        	Block whileBody = ast.newBlock();
        	result.setBody(whileBody);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:170:2: ( 'while' '(' condExp= exp ')' '{' (s= statement )* '}' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:170:4: 'while' '(' condExp= exp ')' '{' (s= statement )* '}'
            {
            match(input,39,FOLLOW_39_in_whileStatement1780); if (state.failed) return result;

            match(input,11,FOLLOW_11_in_whileStatement1782); if (state.failed) return result;

            pushFollow(FOLLOW_exp_in_whileStatement1786);
            condExp=exp();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setExpression(condExp); }

            match(input,12,FOLLOW_12_in_whileStatement1808); if (state.failed) return result;

            match(input,40,FOLLOW_40_in_whileStatement1810); if (state.failed) return result;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:172:3: (s= statement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ID||LA12_0==32||LA12_0==35||LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:173:4: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_whileStatement1822);
            	    s=statement();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { whileBody.statements().add(s); }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match(input,42,FOLLOW_42_in_whileStatement1857); if (state.failed) return result;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, whileStatement_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "whileStatement"



    // $ANTLR start "invokeExpStatement"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:177:1: invokeExpStatement returns [ExpressionStatement result = null] : mi= invokeExp ';' ;
    public final ExpressionStatement invokeExpStatement() throws RecognitionException {
        ExpressionStatement result =  null;

        int invokeExpStatement_StartIndex = input.index();

        MethodInvocation mi =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:178:2: (mi= invokeExp ';' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:178:4: mi= invokeExp ';'
            {
            pushFollow(FOLLOW_invokeExp_in_invokeExpStatement1875);
            mi=invokeExp();

            state._fsp--;
            if (state.failed) return result;

            match(input,19,FOLLOW_19_in_invokeExpStatement1877); if (state.failed) return result;

            if ( state.backtracking==0 ) { result = ast.newExpressionStatement(mi); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, invokeExpStatement_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "invokeExpStatement"



    // $ANTLR start "returnStatement"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:181:1: returnStatement returns [ReturnStatement result = ast.newReturnStatement()] : 'return' (e= exp )? ';' ;
    public final ReturnStatement returnStatement() throws RecognitionException {
        ReturnStatement result =  ast.newReturnStatement();

        int returnStatement_StartIndex = input.index();

        Expression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:182:2: ( 'return' (e= exp )? ';' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:182:4: 'return' (e= exp )? ';'
            {
            match(input,35,FOLLOW_35_in_returnStatement1917); if (state.failed) return result;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:183:3: (e= exp )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0 >= ID && LA13_0 <= NUM_INT)||LA13_0==7||LA13_0==11||LA13_0==14||LA13_0==16||LA13_0==31||LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:184:4: e= exp
                    {
                    pushFollow(FOLLOW_exp_in_returnStatement1930);
                    e=exp();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result.setExpression(e); }

                    }
                    break;

            }


            match(input,19,FOLLOW_19_in_returnStatement1971); if (state.failed) return result;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, returnStatement_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "returnStatement"



    // $ANTLR start "exp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:188:1: exp returns [Expression result = null] : e= logicalOrExp ;
    public final Expression exp() throws RecognitionException {
        Expression result =  null;

        int exp_StartIndex = input.index();

        Expression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:189:2: (e= logicalOrExp )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:189:4: e= logicalOrExp
            {
            pushFollow(FOLLOW_logicalOrExp_in_exp1989);
            e=logicalOrExp();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = e; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, exp_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "exp"



    // $ANTLR start "logicalOrExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:192:1: logicalOrExp returns [Expression result = null] : e= logicalAndExp ( '||' e= logicalAndExp )* ;
    public final Expression logicalOrExp() throws RecognitionException {
        Expression result =  null;

        int logicalOrExp_StartIndex = input.index();

        Expression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:193:2: (e= logicalAndExp ( '||' e= logicalAndExp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:193:4: e= logicalAndExp ( '||' e= logicalAndExp )*
            {
            pushFollow(FOLLOW_logicalAndExp_in_logicalOrExp2033);
            e=logicalAndExp();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = e; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:194:3: ( '||' e= logicalAndExp )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:194:5: '||' e= logicalAndExp
            	    {
            	    match(input,41,FOLLOW_41_in_logicalOrExp2068); if (state.failed) return result;

            	    pushFollow(FOLLOW_logicalAndExp_in_logicalOrExp2072);
            	    e=logicalAndExp();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { InfixExpression ie = ast.newInfixExpression();
            	    											                        ie.setLeftOperand(result);
            	    											                        ie.setOperator(InfixExpression.Operator.CONDITIONAL_OR);
            	    											                        ie.setRightOperand(e); 
            	    											                        result = ie; }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, logicalOrExp_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "logicalOrExp"



    // $ANTLR start "logicalAndExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:202:1: logicalAndExp returns [Expression result = null] : e= equalityExp ( '&&' e= equalityExp )* ;
    public final Expression logicalAndExp() throws RecognitionException {
        Expression result =  null;

        int logicalAndExp_StartIndex = input.index();

        Expression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:203:2: (e= equalityExp ( '&&' e= equalityExp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:203:4: e= equalityExp ( '&&' e= equalityExp )*
            {
            pushFollow(FOLLOW_equalityExp_in_logicalAndExp2112);
            e=equalityExp();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = e; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:204:3: ( '&&' e= equalityExp )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==10) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:204:5: '&&' e= equalityExp
            	    {
            	    match(input,10,FOLLOW_10_in_logicalAndExp2147); if (state.failed) return result;

            	    pushFollow(FOLLOW_equalityExp_in_logicalAndExp2151);
            	    e=equalityExp();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { InfixExpression ie = ast.newInfixExpression();
            	                                                  ie.setLeftOperand(result);
            	                                                  ie.setOperator(InfixExpression.Operator.CONDITIONAL_AND);
            	                                                  ie.setRightOperand(e); 
            	                                                  result = ie; }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, logicalAndExp_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "logicalAndExp"



    // $ANTLR start "equalityExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:212:1: equalityExp returns [Expression result = null] : e= relationalExp ( ( '!=' | '==' ) e= relationalExp )* ;
    public final Expression equalityExp() throws RecognitionException {
        Expression result =  null;

        int equalityExp_StartIndex = input.index();

        Expression e =null;



        	InfixExpression.Operator op = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:216:2: (e= relationalExp ( ( '!=' | '==' ) e= relationalExp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:216:4: e= relationalExp ( ( '!=' | '==' ) e= relationalExp )*
            {
            pushFollow(FOLLOW_relationalExp_in_equalityExp2199);
            e=relationalExp();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = e; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:217:3: ( ( '!=' | '==' ) e= relationalExp )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==8||LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:218:4: ( '!=' | '==' ) e= relationalExp
            	    {
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:218:4: ( '!=' | '==' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==8) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==23) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:219:5: '!='
            	            {
            	            match(input,8,FOLLOW_8_in_equalityExp2241); if (state.failed) return result;

            	            if ( state.backtracking==0 ) { op = InfixExpression.Operator.NOT_EQUALS; }

            	            }
            	            break;
            	        case 2 :
            	            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:220:6: '=='
            	            {
            	            match(input,23,FOLLOW_23_in_equalityExp2281); if (state.failed) return result;

            	            if ( state.backtracking==0 ) { op = InfixExpression.Operator.EQUALS; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relationalExp_in_equalityExp2327);
            	    e=relationalExp();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { InfixExpression ie = ast.newInfixExpression();
            	    											                        ie.setLeftOperand(result);
            	    											                        ie.setOperator(op);
            	    											                        ie.setRightOperand(e); 
            	    											                        result = ie; }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, equalityExp_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "equalityExp"



    // $ANTLR start "relationalExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:230:1: relationalExp returns [Expression result = null] : e= additiveExp ( ( '<' | '>' | '<=' | '>=' ) e= additiveExp )* ;
    public final Expression relationalExp() throws RecognitionException {
        Expression result =  null;

        int relationalExp_StartIndex = input.index();

        Expression e =null;



        	InfixExpression.Operator op = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:234:2: (e= additiveExp ( ( '<' | '>' | '<=' | '>=' ) e= additiveExp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:234:4: e= additiveExp ( ( '<' | '>' | '<=' | '>=' ) e= additiveExp )*
            {
            pushFollow(FOLLOW_additiveExp_in_relationalExp2379);
            e=additiveExp();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = e; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:235:3: ( ( '<' | '>' | '<=' | '>=' ) e= additiveExp )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= 20 && LA19_0 <= 21)||(LA19_0 >= 24 && LA19_0 <= 25)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:236:4: ( '<' | '>' | '<=' | '>=' ) e= additiveExp
            	    {
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:236:4: ( '<' | '>' | '<=' | '>=' )
            	    int alt18=4;
            	    switch ( input.LA(1) ) {
            	    case 20:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:236:6: '<'
            	            {
            	            match(input,20,FOLLOW_20_in_relationalExp2419); if (state.failed) return result;

            	            if ( state.backtracking==0 ) { op = InfixExpression.Operator.LESS; }

            	            }
            	            break;
            	        case 2 :
            	            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:237:6: '>'
            	            {
            	            match(input,24,FOLLOW_24_in_relationalExp2460); if (state.failed) return result;

            	            if ( state.backtracking==0 ) { op = InfixExpression.Operator.GREATER; }

            	            }
            	            break;
            	        case 3 :
            	            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:238:6: '<='
            	            {
            	            match(input,21,FOLLOW_21_in_relationalExp2501); if (state.failed) return result;

            	            if ( state.backtracking==0 ) { op = InfixExpression.Operator.LESS_EQUALS; }

            	            }
            	            break;
            	        case 4 :
            	            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:239:6: '>='
            	            {
            	            match(input,25,FOLLOW_25_in_relationalExp2541); if (state.failed) return result;

            	            if ( state.backtracking==0 ) { op = InfixExpression.Operator.GREATER_EQUALS; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_additiveExp_in_relationalExp2587);
            	    e=additiveExp();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { InfixExpression ie = ast.newInfixExpression();
            	    											                        ie.setLeftOperand(result);
            	    											                        ie.setOperator(op);
            	    											                        ie.setRightOperand(e);
            	    											                        result = ie; }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, relationalExp_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "relationalExp"



    // $ANTLR start "additiveExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:249:1: additiveExp returns [Expression result = null] : e= multiplicativeExp ( ( '+' | '-' ) e= multiplicativeExp )* ;
    public final Expression additiveExp() throws RecognitionException {
        Expression result =  null;

        int additiveExp_StartIndex = input.index();

        Expression e =null;



        	InfixExpression.Operator op = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:253:2: (e= multiplicativeExp ( ( '+' | '-' ) e= multiplicativeExp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:253:4: e= multiplicativeExp ( ( '+' | '-' ) e= multiplicativeExp )*
            {
            pushFollow(FOLLOW_multiplicativeExp_in_additiveExp2641);
            e=multiplicativeExp();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = e; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:254:3: ( ( '+' | '-' ) e= multiplicativeExp )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14||LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:255:4: ( '+' | '-' ) e= multiplicativeExp
            	    {
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:255:4: ( '+' | '-' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==14) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==16) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:255:6: '+'
            	            {
            	            match(input,14,FOLLOW_14_in_additiveExp2674); if (state.failed) return result;

            	            if ( state.backtracking==0 ) { op = InfixExpression.Operator.PLUS; }

            	            }
            	            break;
            	        case 2 :
            	            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:256:6: '-'
            	            {
            	            match(input,16,FOLLOW_16_in_additiveExp2715); if (state.failed) return result;

            	            if ( state.backtracking==0 ) { op = InfixExpression.Operator.MINUS; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicativeExp_in_additiveExp2762);
            	    e=multiplicativeExp();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { InfixExpression ie = ast.newInfixExpression();
            	    			                                        ie.setLeftOperand(result);
            	    											                        ie.setOperator(op);
            	    											                        ie.setRightOperand(e); 
            	    											                        result = ie; }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, additiveExp_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "additiveExp"



    // $ANTLR start "multiplicativeExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:266:1: multiplicativeExp returns [Expression result = null] : e= unaryExp ( ( '*' | '/' | '%' ) e= unaryExp )* ;
    public final Expression multiplicativeExp() throws RecognitionException {
        Expression result =  null;

        int multiplicativeExp_StartIndex = input.index();

        Expression e =null;



        	InfixExpression.Operator op = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:270:2: (e= unaryExp ( ( '*' | '/' | '%' ) e= unaryExp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:270:4: e= unaryExp ( ( '*' | '/' | '%' ) e= unaryExp )*
            {
            pushFollow(FOLLOW_unaryExp_in_multiplicativeExp2810);
            e=unaryExp();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = e; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:271:3: ( ( '*' | '/' | '%' ) e= unaryExp )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==9||LA23_0==13||LA23_0==18) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:272:4: ( '*' | '/' | '%' ) e= unaryExp
            	    {
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:272:4: ( '*' | '/' | '%' )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 13:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 9:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:272:6: '*'
            	            {
            	            match(input,13,FOLLOW_13_in_multiplicativeExp2852); if (state.failed) return result;

            	            if ( state.backtracking==0 ) { op = InfixExpression.Operator.TIMES; }

            	            }
            	            break;
            	        case 2 :
            	            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:273:6: '/'
            	            {
            	            match(input,18,FOLLOW_18_in_multiplicativeExp2893); if (state.failed) return result;

            	            if ( state.backtracking==0 ) { op = InfixExpression.Operator.DIVIDE; }

            	            }
            	            break;
            	        case 3 :
            	            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:274:6: '%'
            	            {
            	            match(input,9,FOLLOW_9_in_multiplicativeExp2934); if (state.failed) return result;

            	            if ( state.backtracking==0 ) { op = InfixExpression.Operator.REMAINDER; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unaryExp_in_multiplicativeExp2980);
            	    e=unaryExp();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { InfixExpression ie = ast.newInfixExpression();
            	    											                        ie.setLeftOperand(result);
            	    											                        ie.setOperator(op);
            	    											                        ie.setRightOperand(e); 
            	    											                        result = ie; }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, multiplicativeExp_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "multiplicativeExp"



    // $ANTLR start "unaryExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:284:1: unaryExp returns [Expression result = null] : ( '-' e= unaryExp | '+' e= unaryExp |e= unaryExpNotPlusMinus );
    public final Expression unaryExp() throws RecognitionException {
        Expression result =  null;

        int unaryExp_StartIndex = input.index();

        Expression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:285:2: ( '-' e= unaryExp | '+' e= unaryExp |e= unaryExpNotPlusMinus )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt24=1;
                }
                break;
            case 14:
                {
                alt24=2;
                }
                break;
            case ID:
            case NUM_INT:
            case 7:
            case 11:
            case 31:
            case 37:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:285:4: '-' e= unaryExp
                    {
                    match(input,16,FOLLOW_16_in_unaryExp3030); if (state.failed) return result;

                    pushFollow(FOLLOW_unaryExp_in_unaryExp3034);
                    e=unaryExp();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { PrefixExpression pe = ast.newPrefixExpression();
                    											                        pe.setOperator(PrefixExpression.Operator.MINUS);
                    											                        pe.setOperand(e);
                    											                        result = pe; }

                    }
                    break;
                case 2 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:289:4: '+' e= unaryExp
                    {
                    match(input,14,FOLLOW_14_in_unaryExp3066); if (state.failed) return result;

                    pushFollow(FOLLOW_unaryExp_in_unaryExp3070);
                    e=unaryExp();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { PrefixExpression pe = ast.newPrefixExpression();
                    											                        pe.setOperator(PrefixExpression.Operator.PLUS);
                    											                        pe.setOperand(e);
                    											                        result = pe;
                    										                        }

                    }
                    break;
                case 3 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:294:4: e= unaryExpNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpNotPlusMinus_in_unaryExp3104);
                    e=unaryExpNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = e; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, unaryExp_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "unaryExp"



    // $ANTLR start "unaryExpNotPlusMinus"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:297:1: unaryExpNotPlusMinus returns [Expression result = null] : ( '!' e= unaryExp |e= primaryExp );
    public final Expression unaryExpNotPlusMinus() throws RecognitionException {
        Expression result =  null;

        int unaryExpNotPlusMinus_StartIndex = input.index();

        Expression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:298:2: ( '!' e= unaryExp |e= primaryExp )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==7) ) {
                alt25=1;
            }
            else if ( ((LA25_0 >= ID && LA25_0 <= NUM_INT)||LA25_0==11||LA25_0==31||LA25_0==37) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:298:4: '!' e= unaryExp
                    {
                    match(input,7,FOLLOW_7_in_unaryExpNotPlusMinus3139); if (state.failed) return result;

                    pushFollow(FOLLOW_unaryExp_in_unaryExpNotPlusMinus3143);
                    e=unaryExp();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { PrefixExpression pe = ast.newPrefixExpression();
                    											                        pe.setOperator(PrefixExpression.Operator.NOT);
                    											                        pe.setOperand(e);
                                                                  result = pe; }

                    }
                    break;
                case 2 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:302:4: e= primaryExp
                    {
                    pushFollow(FOLLOW_primaryExp_in_unaryExpNotPlusMinus3177);
                    e=primaryExp();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = e; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, unaryExpNotPlusMinus_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "unaryExpNotPlusMinus"



    // $ANTLR start "primaryExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:305:1: primaryExp returns [Expression result = null] : (n= NUM_INT {...}?| 'true' | 'false' | '(' e= exp ')' |i= invokeExp | ID );
    public final Expression primaryExp() throws RecognitionException {
        Expression result =  null;

        int primaryExp_StartIndex = input.index();

        Token n=null;
        Token ID7=null;
        Expression e =null;

        MethodInvocation i =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:306:2: (n= NUM_INT {...}?| 'true' | 'false' | '(' e= exp ')' |i= invokeExp | ID )
            int alt26=6;
            switch ( input.LA(1) ) {
            case NUM_INT:
                {
                alt26=1;
                }
                break;
            case 37:
                {
                alt26=2;
                }
                break;
            case 31:
                {
                alt26=3;
                }
                break;
            case 11:
                {
                alt26=4;
                }
                break;
            case ID:
                {
                int LA26_5 = input.LA(2);

                if ( (LA26_5==11||LA26_5==17) ) {
                    alt26=5;
                }
                else if ( (LA26_5==EOF||(LA26_5 >= 8 && LA26_5 <= 10)||(LA26_5 >= 12 && LA26_5 <= 16)||(LA26_5 >= 18 && LA26_5 <= 21)||(LA26_5 >= 23 && LA26_5 <= 25)||LA26_5==41) ) {
                    alt26=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:306:4: n= NUM_INT {...}?
                    {
                    n=(Token)match(input,NUM_INT,FOLLOW_NUM_INT_in_primaryExp3224); if (state.failed) return result;

                    if ( !(( new BigInteger(n.getText()).bitLength() < 32 )) ) {
                        if (state.backtracking>0) {state.failed=true; return result;}
                        throw new FailedPredicateException(input, "primaryExp", " new BigInteger(n.getText()).bitLength() < 32 ");
                    }

                    if ( state.backtracking==0 ) { NumberLiteral nl = ast.newNumberLiteral();
                    											                        nl.setToken((n!=null?n.getText():null));
                    											                        result = nl; }

                    }
                    break;
                case 2 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:311:4: 'true'
                    {
                    match(input,37,FOLLOW_37_in_primaryExp3275); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = ast.newBooleanLiteral(true); }

                    }
                    break;
                case 3 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:312:4: 'false'
                    {
                    match(input,31,FOLLOW_31_in_primaryExp3315); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = ast.newBooleanLiteral(false); }

                    }
                    break;
                case 4 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:313:4: '(' e= exp ')'
                    {
                    match(input,11,FOLLOW_11_in_primaryExp3354); if (state.failed) return result;

                    pushFollow(FOLLOW_exp_in_primaryExp3358);
                    e=exp();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,12,FOLLOW_12_in_primaryExp3360); if (state.failed) return result;

                    if ( state.backtracking==0 ) { ParenthesizedExpression pe = ast.newParenthesizedExpression();
                                                                  pe.setExpression(e);
                                                                  result = pe; }

                    }
                    break;
                case 5 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:316:4: i= invokeExp
                    {
                    pushFollow(FOLLOW_invokeExp_in_primaryExp3395);
                    i=invokeExp();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = i; }

                    }
                    break;
                case 6 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:317:4: ID
                    {
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_primaryExp3430); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = ast.newSimpleName((ID7!=null?ID7.getText():null)); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, primaryExp_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "primaryExp"



    // $ANTLR start "invokeExp"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:321:1: invokeExp returns [MethodInvocation result = ast.newMethodInvocation()] : (id1= ID '.' )? id2= ID '(' (es= args )? ')' ;
    public final MethodInvocation invokeExp() throws RecognitionException {
        MethodInvocation result =  ast.newMethodInvocation();

        int invokeExp_StartIndex = input.index();

        Token id1=null;
        Token id2=null;
        ArrayList<Expression> es =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:322:2: ( (id1= ID '.' )? id2= ID '(' (es= args )? ')' )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:322:4: (id1= ID '.' )? id2= ID '(' (es= args )? ')'
            {
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:322:4: (id1= ID '.' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==17) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:323:4: id1= ID '.'
                    {
                    id1=(Token)match(input,ID,FOLLOW_ID_in_invokeExp3494); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result.setExpression(ast.newSimpleName((id1!=null?id1.getText():null))); }

                    match(input,17,FOLLOW_17_in_invokeExp3532); if (state.failed) return result;

                    }
                    break;

            }


            id2=(Token)match(input,ID,FOLLOW_ID_in_invokeExp3553); if (state.failed) return result;

            if ( state.backtracking==0 ) { result.setName(ast.newSimpleName((id2!=null?id2.getText():null))); }

            match(input,11,FOLLOW_11_in_invokeExp3592); if (state.failed) return result;

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:327:7: (es= args )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0 >= ID && LA28_0 <= NUM_INT)||LA28_0==7||LA28_0==11||LA28_0==14||LA28_0==16||LA28_0==31||LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:327:9: es= args
                    {
                    pushFollow(FOLLOW_args_in_invokeExp3598);
                    es=args();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result.arguments().addAll(es); }

                    }
                    break;

            }


            match(input,12,FOLLOW_12_in_invokeExp3633); if (state.failed) return result;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, invokeExp_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "invokeExp"



    // $ANTLR start "args"
    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:331:1: args returns [ArrayList<Expression> result = new ArrayList<Expression>()] : e= exp ( ',' e= exp )* ;
    public final ArrayList<Expression> args() throws RecognitionException {
        ArrayList<Expression> result =  new ArrayList<Expression>();

        int args_StartIndex = input.index();

        Expression e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return result; }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:332:2: (e= exp ( ',' e= exp )* )
            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:332:4: e= exp ( ',' e= exp )*
            {
            pushFollow(FOLLOW_exp_in_args3654);
            e=exp();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result.add(e); }

            // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:333:3: ( ',' e= exp )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/edward/workspace/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:334:4: ',' e= exp
            	    {
            	    match(input,15,FOLLOW_15_in_args3699); if (state.failed) return result;

            	    pushFollow(FOLLOW_exp_in_args3703);
            	    e=exp();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { result.add(e); }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, args_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "args"

    // Delegated rules


 

    public static final BitSet FOLLOW_classDefinition_in_compilationUnit53 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_compilationUnit76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_classDefinition92 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_classDefinition122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_classDefinition124 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_classDefinition126 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_mainMethodDeclaration_in_classDefinition160 = new BitSet(new long[]{0x0000041000000000L});
    public static final BitSet FOLLOW_fieldDeclaration_in_classDefinition182 = new BitSet(new long[]{0x0000041000000000L});
    public static final BitSet FOLLOW_methodDeclaration_in_classDefinition210 = new BitSet(new long[]{0x0000041000000000L});
    public static final BitSet FOLLOW_42_in_classDefinition239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_mainMethodDeclaration260 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_mainMethodDeclaration297 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_mainMethodDeclaration334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_mainMethodDeclaration375 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_mainMethodDeclaration389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_mainMethodDeclaration396 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_mainMethodDeclaration407 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_mainMethodDeclaration409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_mainMethodDeclaration413 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_mainMethodDeclaration444 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_mainMethodDeclaration446 = new BitSet(new long[]{0x0000048B10000010L});
    public static final BitSet FOLLOW_methodBody_in_mainMethodDeclaration450 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_mainMethodDeclaration452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_fieldDeclaration490 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_type_in_fieldDeclaration530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fieldDeclaration562 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_fieldDeclaration605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_methodDeclaration621 = new BitSet(new long[]{0x0000004210000000L});
    public static final BitSet FOLLOW_returnType_in_methodDeclaration661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration688 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_methodDeclaration690 = new BitSet(new long[]{0x0000000210001000L});
    public static final BitSet FOLLOW_params_in_methodDeclaration733 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_methodDeclaration770 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_methodDeclaration772 = new BitSet(new long[]{0x0000048B10000010L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaration776 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_methodDeclaration778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_type811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_type848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_returnType900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_returnType940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params993 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_params1032 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_param_in_params1036 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_type_in_param1085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_param1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDeclaration_in_methodBody1178 = new BitSet(new long[]{0x0000008B10000012L});
    public static final BitSet FOLLOW_statement_in_methodBody1212 = new BitSet(new long[]{0x0000008900000012L});
    public static final BitSet FOLLOW_type_in_localDeclaration1267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_localDeclaration1298 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_localDeclaration1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStatement_in_statement1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invokeExpStatement_in_statement1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statement1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignStatement1523 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_assignStatement1566 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_exp_in_assignStatement1570 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_assignStatement1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ifStatement1620 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ifStatement1622 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_exp_in_ifStatement1626 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ifStatement1628 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifStatement1649 = new BitSet(new long[]{0x0000048900000010L});
    public static final BitSet FOLLOW_statement_in_ifStatement1661 = new BitSet(new long[]{0x0000048900000010L});
    public static final BitSet FOLLOW_42_in_ifStatement1699 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ifStatement1705 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifStatement1707 = new BitSet(new long[]{0x0000048900000010L});
    public static final BitSet FOLLOW_statement_in_ifStatement1722 = new BitSet(new long[]{0x0000048900000010L});
    public static final BitSet FOLLOW_42_in_ifStatement1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_whileStatement1780 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_whileStatement1782 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_exp_in_whileStatement1786 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_whileStatement1808 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_whileStatement1810 = new BitSet(new long[]{0x0000048900000010L});
    public static final BitSet FOLLOW_statement_in_whileStatement1822 = new BitSet(new long[]{0x0000048900000010L});
    public static final BitSet FOLLOW_42_in_whileStatement1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invokeExp_in_invokeExpStatement1875 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_invokeExpStatement1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_returnStatement1917 = new BitSet(new long[]{0x00000020800948B0L});
    public static final BitSet FOLLOW_exp_in_returnStatement1930 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_returnStatement1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExp_in_exp1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAndExp_in_logicalOrExp2033 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_logicalOrExp2068 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_logicalAndExp_in_logicalOrExp2072 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_equalityExp_in_logicalAndExp2112 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_logicalAndExp2147 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_equalityExp_in_logicalAndExp2151 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp2199 = new BitSet(new long[]{0x0000000000800102L});
    public static final BitSet FOLLOW_8_in_equalityExp2241 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_23_in_equalityExp2281 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp2327 = new BitSet(new long[]{0x0000000000800102L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp2379 = new BitSet(new long[]{0x0000000003300002L});
    public static final BitSet FOLLOW_20_in_relationalExp2419 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_24_in_relationalExp2460 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_21_in_relationalExp2501 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_25_in_relationalExp2541 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp2587 = new BitSet(new long[]{0x0000000003300002L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp2641 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_14_in_additiveExp2674 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_16_in_additiveExp2715 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp2762 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp2810 = new BitSet(new long[]{0x0000000000042202L});
    public static final BitSet FOLLOW_13_in_multiplicativeExp2852 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_18_in_multiplicativeExp2893 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_9_in_multiplicativeExp2934 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp2980 = new BitSet(new long[]{0x0000000000042202L});
    public static final BitSet FOLLOW_16_in_unaryExp3030 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_unaryExp_in_unaryExp3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_unaryExp3066 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_unaryExp_in_unaryExp3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpNotPlusMinus_in_unaryExp3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_unaryExpNotPlusMinus3139 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_unaryExp_in_unaryExpNotPlusMinus3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExp_in_unaryExpNotPlusMinus3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_INT_in_primaryExp3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_primaryExp3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_primaryExp3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_primaryExp3354 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_exp_in_primaryExp3358 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_primaryExp3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invokeExp_in_primaryExp3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primaryExp3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_invokeExp3494 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_invokeExp3532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_invokeExp3553 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_invokeExp3592 = new BitSet(new long[]{0x00000020800158B0L});
    public static final BitSet FOLLOW_args_in_invokeExp3598 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_invokeExp3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_args3654 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_args3699 = new BitSet(new long[]{0x00000020800148B0L});
    public static final BitSet FOLLOW_exp_in_args3703 = new BitSet(new long[]{0x0000000000008002L});

}