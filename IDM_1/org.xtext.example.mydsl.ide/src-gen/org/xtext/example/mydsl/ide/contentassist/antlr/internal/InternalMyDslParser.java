package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DB'", "'{'", "'}'", "'tables'", "','", "'Table'", "'columns'", "'Column'", "'type'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDB"
    // InternalMyDsl.g:53:1: entryRuleDB : ruleDB EOF ;
    public final void entryRuleDB() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleDB EOF )
            // InternalMyDsl.g:55:1: ruleDB EOF
            {
             before(grammarAccess.getDBRule()); 
            pushFollow(FOLLOW_1);
            ruleDB();

            state._fsp--;

             after(grammarAccess.getDBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDB"


    // $ANTLR start "ruleDB"
    // InternalMyDsl.g:62:1: ruleDB : ( ( rule__DB__Group__0 ) ) ;
    public final void ruleDB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__DB__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__DB__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__DB__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__DB__Group__0 )
            {
             before(grammarAccess.getDBAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__DB__Group__0 )
            // InternalMyDsl.g:69:4: rule__DB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDB"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEString EOF )
            // InternalMyDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTable"
    // InternalMyDsl.g:103:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleTable EOF )
            // InternalMyDsl.g:105:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMyDsl.g:112:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Table__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Table__Group__0 )
            // InternalMyDsl.g:119:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalMyDsl.g:128:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleColumn EOF )
            // InternalMyDsl.g:130:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMyDsl.g:137:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Column__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Column__Group__0 )
            // InternalMyDsl.g:144:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:157:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:157:2: ( RULE_STRING )
                    // InternalMyDsl.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:163:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:163:2: ( RULE_ID )
                    // InternalMyDsl.g:164:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__DB__Group__0"
    // InternalMyDsl.g:173:1: rule__DB__Group__0 : rule__DB__Group__0__Impl rule__DB__Group__1 ;
    public final void rule__DB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:177:1: ( rule__DB__Group__0__Impl rule__DB__Group__1 )
            // InternalMyDsl.g:178:2: rule__DB__Group__0__Impl rule__DB__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__0"


    // $ANTLR start "rule__DB__Group__0__Impl"
    // InternalMyDsl.g:185:1: rule__DB__Group__0__Impl : ( () ) ;
    public final void rule__DB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:189:1: ( ( () ) )
            // InternalMyDsl.g:190:1: ( () )
            {
            // InternalMyDsl.g:190:1: ( () )
            // InternalMyDsl.g:191:2: ()
            {
             before(grammarAccess.getDBAccess().getDBAction_0()); 
            // InternalMyDsl.g:192:2: ()
            // InternalMyDsl.g:192:3: 
            {
            }

             after(grammarAccess.getDBAccess().getDBAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__0__Impl"


    // $ANTLR start "rule__DB__Group__1"
    // InternalMyDsl.g:200:1: rule__DB__Group__1 : rule__DB__Group__1__Impl rule__DB__Group__2 ;
    public final void rule__DB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:204:1: ( rule__DB__Group__1__Impl rule__DB__Group__2 )
            // InternalMyDsl.g:205:2: rule__DB__Group__1__Impl rule__DB__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DB__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__1"


    // $ANTLR start "rule__DB__Group__1__Impl"
    // InternalMyDsl.g:212:1: rule__DB__Group__1__Impl : ( 'DB' ) ;
    public final void rule__DB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:1: ( ( 'DB' ) )
            // InternalMyDsl.g:217:1: ( 'DB' )
            {
            // InternalMyDsl.g:217:1: ( 'DB' )
            // InternalMyDsl.g:218:2: 'DB'
            {
             before(grammarAccess.getDBAccess().getDBKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDBAccess().getDBKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__1__Impl"


    // $ANTLR start "rule__DB__Group__2"
    // InternalMyDsl.g:227:1: rule__DB__Group__2 : rule__DB__Group__2__Impl rule__DB__Group__3 ;
    public final void rule__DB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( rule__DB__Group__2__Impl rule__DB__Group__3 )
            // InternalMyDsl.g:232:2: rule__DB__Group__2__Impl rule__DB__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DB__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__2"


    // $ANTLR start "rule__DB__Group__2__Impl"
    // InternalMyDsl.g:239:1: rule__DB__Group__2__Impl : ( ( rule__DB__NameAssignment_2 ) ) ;
    public final void rule__DB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:243:1: ( ( ( rule__DB__NameAssignment_2 ) ) )
            // InternalMyDsl.g:244:1: ( ( rule__DB__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:244:1: ( ( rule__DB__NameAssignment_2 ) )
            // InternalMyDsl.g:245:2: ( rule__DB__NameAssignment_2 )
            {
             before(grammarAccess.getDBAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:246:2: ( rule__DB__NameAssignment_2 )
            // InternalMyDsl.g:246:3: rule__DB__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DB__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDBAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__2__Impl"


    // $ANTLR start "rule__DB__Group__3"
    // InternalMyDsl.g:254:1: rule__DB__Group__3 : rule__DB__Group__3__Impl rule__DB__Group__4 ;
    public final void rule__DB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:258:1: ( rule__DB__Group__3__Impl rule__DB__Group__4 )
            // InternalMyDsl.g:259:2: rule__DB__Group__3__Impl rule__DB__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DB__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DB__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__3"


    // $ANTLR start "rule__DB__Group__3__Impl"
    // InternalMyDsl.g:266:1: rule__DB__Group__3__Impl : ( '{' ) ;
    public final void rule__DB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:270:1: ( ( '{' ) )
            // InternalMyDsl.g:271:1: ( '{' )
            {
            // InternalMyDsl.g:271:1: ( '{' )
            // InternalMyDsl.g:272:2: '{'
            {
             before(grammarAccess.getDBAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDBAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__3__Impl"


    // $ANTLR start "rule__DB__Group__4"
    // InternalMyDsl.g:281:1: rule__DB__Group__4 : rule__DB__Group__4__Impl rule__DB__Group__5 ;
    public final void rule__DB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:285:1: ( rule__DB__Group__4__Impl rule__DB__Group__5 )
            // InternalMyDsl.g:286:2: rule__DB__Group__4__Impl rule__DB__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DB__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DB__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__4"


    // $ANTLR start "rule__DB__Group__4__Impl"
    // InternalMyDsl.g:293:1: rule__DB__Group__4__Impl : ( ( rule__DB__Group_4__0 )? ) ;
    public final void rule__DB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:297:1: ( ( ( rule__DB__Group_4__0 )? ) )
            // InternalMyDsl.g:298:1: ( ( rule__DB__Group_4__0 )? )
            {
            // InternalMyDsl.g:298:1: ( ( rule__DB__Group_4__0 )? )
            // InternalMyDsl.g:299:2: ( rule__DB__Group_4__0 )?
            {
             before(grammarAccess.getDBAccess().getGroup_4()); 
            // InternalMyDsl.g:300:2: ( rule__DB__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:300:3: rule__DB__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DB__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDBAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__4__Impl"


    // $ANTLR start "rule__DB__Group__5"
    // InternalMyDsl.g:308:1: rule__DB__Group__5 : rule__DB__Group__5__Impl ;
    public final void rule__DB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:312:1: ( rule__DB__Group__5__Impl )
            // InternalMyDsl.g:313:2: rule__DB__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DB__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__5"


    // $ANTLR start "rule__DB__Group__5__Impl"
    // InternalMyDsl.g:319:1: rule__DB__Group__5__Impl : ( '}' ) ;
    public final void rule__DB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:1: ( ( '}' ) )
            // InternalMyDsl.g:324:1: ( '}' )
            {
            // InternalMyDsl.g:324:1: ( '}' )
            // InternalMyDsl.g:325:2: '}'
            {
             before(grammarAccess.getDBAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDBAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__5__Impl"


    // $ANTLR start "rule__DB__Group_4__0"
    // InternalMyDsl.g:335:1: rule__DB__Group_4__0 : rule__DB__Group_4__0__Impl rule__DB__Group_4__1 ;
    public final void rule__DB__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:339:1: ( rule__DB__Group_4__0__Impl rule__DB__Group_4__1 )
            // InternalMyDsl.g:340:2: rule__DB__Group_4__0__Impl rule__DB__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__DB__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DB__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4__0"


    // $ANTLR start "rule__DB__Group_4__0__Impl"
    // InternalMyDsl.g:347:1: rule__DB__Group_4__0__Impl : ( 'tables' ) ;
    public final void rule__DB__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:351:1: ( ( 'tables' ) )
            // InternalMyDsl.g:352:1: ( 'tables' )
            {
            // InternalMyDsl.g:352:1: ( 'tables' )
            // InternalMyDsl.g:353:2: 'tables'
            {
             before(grammarAccess.getDBAccess().getTablesKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDBAccess().getTablesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4__0__Impl"


    // $ANTLR start "rule__DB__Group_4__1"
    // InternalMyDsl.g:362:1: rule__DB__Group_4__1 : rule__DB__Group_4__1__Impl rule__DB__Group_4__2 ;
    public final void rule__DB__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:1: ( rule__DB__Group_4__1__Impl rule__DB__Group_4__2 )
            // InternalMyDsl.g:367:2: rule__DB__Group_4__1__Impl rule__DB__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__DB__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DB__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4__1"


    // $ANTLR start "rule__DB__Group_4__1__Impl"
    // InternalMyDsl.g:374:1: rule__DB__Group_4__1__Impl : ( '{' ) ;
    public final void rule__DB__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:378:1: ( ( '{' ) )
            // InternalMyDsl.g:379:1: ( '{' )
            {
            // InternalMyDsl.g:379:1: ( '{' )
            // InternalMyDsl.g:380:2: '{'
            {
             before(grammarAccess.getDBAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDBAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4__1__Impl"


    // $ANTLR start "rule__DB__Group_4__2"
    // InternalMyDsl.g:389:1: rule__DB__Group_4__2 : rule__DB__Group_4__2__Impl rule__DB__Group_4__3 ;
    public final void rule__DB__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:393:1: ( rule__DB__Group_4__2__Impl rule__DB__Group_4__3 )
            // InternalMyDsl.g:394:2: rule__DB__Group_4__2__Impl rule__DB__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__DB__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DB__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4__2"


    // $ANTLR start "rule__DB__Group_4__2__Impl"
    // InternalMyDsl.g:401:1: rule__DB__Group_4__2__Impl : ( ( rule__DB__TablesAssignment_4_2 ) ) ;
    public final void rule__DB__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( ( ( rule__DB__TablesAssignment_4_2 ) ) )
            // InternalMyDsl.g:406:1: ( ( rule__DB__TablesAssignment_4_2 ) )
            {
            // InternalMyDsl.g:406:1: ( ( rule__DB__TablesAssignment_4_2 ) )
            // InternalMyDsl.g:407:2: ( rule__DB__TablesAssignment_4_2 )
            {
             before(grammarAccess.getDBAccess().getTablesAssignment_4_2()); 
            // InternalMyDsl.g:408:2: ( rule__DB__TablesAssignment_4_2 )
            // InternalMyDsl.g:408:3: rule__DB__TablesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DB__TablesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDBAccess().getTablesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4__2__Impl"


    // $ANTLR start "rule__DB__Group_4__3"
    // InternalMyDsl.g:416:1: rule__DB__Group_4__3 : rule__DB__Group_4__3__Impl rule__DB__Group_4__4 ;
    public final void rule__DB__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:420:1: ( rule__DB__Group_4__3__Impl rule__DB__Group_4__4 )
            // InternalMyDsl.g:421:2: rule__DB__Group_4__3__Impl rule__DB__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__DB__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DB__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4__3"


    // $ANTLR start "rule__DB__Group_4__3__Impl"
    // InternalMyDsl.g:428:1: rule__DB__Group_4__3__Impl : ( ( rule__DB__Group_4_3__0 )* ) ;
    public final void rule__DB__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( ( ( rule__DB__Group_4_3__0 )* ) )
            // InternalMyDsl.g:433:1: ( ( rule__DB__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:433:1: ( ( rule__DB__Group_4_3__0 )* )
            // InternalMyDsl.g:434:2: ( rule__DB__Group_4_3__0 )*
            {
             before(grammarAccess.getDBAccess().getGroup_4_3()); 
            // InternalMyDsl.g:435:2: ( rule__DB__Group_4_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:435:3: rule__DB__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DB__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDBAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4__3__Impl"


    // $ANTLR start "rule__DB__Group_4__4"
    // InternalMyDsl.g:443:1: rule__DB__Group_4__4 : rule__DB__Group_4__4__Impl ;
    public final void rule__DB__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:447:1: ( rule__DB__Group_4__4__Impl )
            // InternalMyDsl.g:448:2: rule__DB__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DB__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4__4"


    // $ANTLR start "rule__DB__Group_4__4__Impl"
    // InternalMyDsl.g:454:1: rule__DB__Group_4__4__Impl : ( '}' ) ;
    public final void rule__DB__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:1: ( ( '}' ) )
            // InternalMyDsl.g:459:1: ( '}' )
            {
            // InternalMyDsl.g:459:1: ( '}' )
            // InternalMyDsl.g:460:2: '}'
            {
             before(grammarAccess.getDBAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDBAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4__4__Impl"


    // $ANTLR start "rule__DB__Group_4_3__0"
    // InternalMyDsl.g:470:1: rule__DB__Group_4_3__0 : rule__DB__Group_4_3__0__Impl rule__DB__Group_4_3__1 ;
    public final void rule__DB__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:474:1: ( rule__DB__Group_4_3__0__Impl rule__DB__Group_4_3__1 )
            // InternalMyDsl.g:475:2: rule__DB__Group_4_3__0__Impl rule__DB__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__DB__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DB__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4_3__0"


    // $ANTLR start "rule__DB__Group_4_3__0__Impl"
    // InternalMyDsl.g:482:1: rule__DB__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__DB__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:486:1: ( ( ',' ) )
            // InternalMyDsl.g:487:1: ( ',' )
            {
            // InternalMyDsl.g:487:1: ( ',' )
            // InternalMyDsl.g:488:2: ','
            {
             before(grammarAccess.getDBAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDBAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4_3__0__Impl"


    // $ANTLR start "rule__DB__Group_4_3__1"
    // InternalMyDsl.g:497:1: rule__DB__Group_4_3__1 : rule__DB__Group_4_3__1__Impl ;
    public final void rule__DB__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:501:1: ( rule__DB__Group_4_3__1__Impl )
            // InternalMyDsl.g:502:2: rule__DB__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DB__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4_3__1"


    // $ANTLR start "rule__DB__Group_4_3__1__Impl"
    // InternalMyDsl.g:508:1: rule__DB__Group_4_3__1__Impl : ( ( rule__DB__TablesAssignment_4_3_1 ) ) ;
    public final void rule__DB__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:512:1: ( ( ( rule__DB__TablesAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:513:1: ( ( rule__DB__TablesAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:513:1: ( ( rule__DB__TablesAssignment_4_3_1 ) )
            // InternalMyDsl.g:514:2: ( rule__DB__TablesAssignment_4_3_1 )
            {
             before(grammarAccess.getDBAccess().getTablesAssignment_4_3_1()); 
            // InternalMyDsl.g:515:2: ( rule__DB__TablesAssignment_4_3_1 )
            // InternalMyDsl.g:515:3: rule__DB__TablesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DB__TablesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDBAccess().getTablesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group_4_3__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalMyDsl.g:524:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalMyDsl.g:529:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalMyDsl.g:536:1: rule__Table__Group__0__Impl : ( () ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( ( () ) )
            // InternalMyDsl.g:541:1: ( () )
            {
            // InternalMyDsl.g:541:1: ( () )
            // InternalMyDsl.g:542:2: ()
            {
             before(grammarAccess.getTableAccess().getTableAction_0()); 
            // InternalMyDsl.g:543:2: ()
            // InternalMyDsl.g:543:3: 
            {
            }

             after(grammarAccess.getTableAccess().getTableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalMyDsl.g:551:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalMyDsl.g:556:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalMyDsl.g:563:1: rule__Table__Group__1__Impl : ( 'Table' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( ( 'Table' ) )
            // InternalMyDsl.g:568:1: ( 'Table' )
            {
            // InternalMyDsl.g:568:1: ( 'Table' )
            // InternalMyDsl.g:569:2: 'Table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalMyDsl.g:578:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalMyDsl.g:583:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalMyDsl.g:590:1: rule__Table__Group__2__Impl : ( ( rule__Table__NameAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( ( ( rule__Table__NameAssignment_2 ) ) )
            // InternalMyDsl.g:595:1: ( ( rule__Table__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:595:1: ( ( rule__Table__NameAssignment_2 ) )
            // InternalMyDsl.g:596:2: ( rule__Table__NameAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:597:2: ( rule__Table__NameAssignment_2 )
            // InternalMyDsl.g:597:3: rule__Table__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalMyDsl.g:605:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:609:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalMyDsl.g:610:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalMyDsl.g:617:1: rule__Table__Group__3__Impl : ( '{' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( '{' ) )
            // InternalMyDsl.g:622:1: ( '{' )
            {
            // InternalMyDsl.g:622:1: ( '{' )
            // InternalMyDsl.g:623:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalMyDsl.g:632:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalMyDsl.g:637:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalMyDsl.g:644:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )? ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( ( ( rule__Table__Group_4__0 )? ) )
            // InternalMyDsl.g:649:1: ( ( rule__Table__Group_4__0 )? )
            {
            // InternalMyDsl.g:649:1: ( ( rule__Table__Group_4__0 )? )
            // InternalMyDsl.g:650:2: ( rule__Table__Group_4__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalMyDsl.g:651:2: ( rule__Table__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:651:3: rule__Table__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalMyDsl.g:659:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:1: ( rule__Table__Group__5__Impl )
            // InternalMyDsl.g:664:2: rule__Table__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalMyDsl.g:670:1: rule__Table__Group__5__Impl : ( '}' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( ( '}' ) )
            // InternalMyDsl.g:675:1: ( '}' )
            {
            // InternalMyDsl.g:675:1: ( '}' )
            // InternalMyDsl.g:676:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group_4__0"
    // InternalMyDsl.g:686:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalMyDsl.g:691:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__0"


    // $ANTLR start "rule__Table__Group_4__0__Impl"
    // InternalMyDsl.g:698:1: rule__Table__Group_4__0__Impl : ( 'columns' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( 'columns' ) )
            // InternalMyDsl.g:703:1: ( 'columns' )
            {
            // InternalMyDsl.g:703:1: ( 'columns' )
            // InternalMyDsl.g:704:2: 'columns'
            {
             before(grammarAccess.getTableAccess().getColumnsKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getColumnsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__0__Impl"


    // $ANTLR start "rule__Table__Group_4__1"
    // InternalMyDsl.g:713:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl rule__Table__Group_4__2 ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( rule__Table__Group_4__1__Impl rule__Table__Group_4__2 )
            // InternalMyDsl.g:718:2: rule__Table__Group_4__1__Impl rule__Table__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__1"


    // $ANTLR start "rule__Table__Group_4__1__Impl"
    // InternalMyDsl.g:725:1: rule__Table__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( ( '{' ) )
            // InternalMyDsl.g:730:1: ( '{' )
            {
            // InternalMyDsl.g:730:1: ( '{' )
            // InternalMyDsl.g:731:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__1__Impl"


    // $ANTLR start "rule__Table__Group_4__2"
    // InternalMyDsl.g:740:1: rule__Table__Group_4__2 : rule__Table__Group_4__2__Impl rule__Table__Group_4__3 ;
    public final void rule__Table__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( rule__Table__Group_4__2__Impl rule__Table__Group_4__3 )
            // InternalMyDsl.g:745:2: rule__Table__Group_4__2__Impl rule__Table__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__2"


    // $ANTLR start "rule__Table__Group_4__2__Impl"
    // InternalMyDsl.g:752:1: rule__Table__Group_4__2__Impl : ( ( rule__Table__ColumnsAssignment_4_2 ) ) ;
    public final void rule__Table__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( ( rule__Table__ColumnsAssignment_4_2 ) ) )
            // InternalMyDsl.g:757:1: ( ( rule__Table__ColumnsAssignment_4_2 ) )
            {
            // InternalMyDsl.g:757:1: ( ( rule__Table__ColumnsAssignment_4_2 ) )
            // InternalMyDsl.g:758:2: ( rule__Table__ColumnsAssignment_4_2 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_4_2()); 
            // InternalMyDsl.g:759:2: ( rule__Table__ColumnsAssignment_4_2 )
            // InternalMyDsl.g:759:3: rule__Table__ColumnsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__2__Impl"


    // $ANTLR start "rule__Table__Group_4__3"
    // InternalMyDsl.g:767:1: rule__Table__Group_4__3 : rule__Table__Group_4__3__Impl rule__Table__Group_4__4 ;
    public final void rule__Table__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( rule__Table__Group_4__3__Impl rule__Table__Group_4__4 )
            // InternalMyDsl.g:772:2: rule__Table__Group_4__3__Impl rule__Table__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__3"


    // $ANTLR start "rule__Table__Group_4__3__Impl"
    // InternalMyDsl.g:779:1: rule__Table__Group_4__3__Impl : ( ( rule__Table__Group_4_3__0 )* ) ;
    public final void rule__Table__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( ( ( rule__Table__Group_4_3__0 )* ) )
            // InternalMyDsl.g:784:1: ( ( rule__Table__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:784:1: ( ( rule__Table__Group_4_3__0 )* )
            // InternalMyDsl.g:785:2: ( rule__Table__Group_4_3__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_4_3()); 
            // InternalMyDsl.g:786:2: ( rule__Table__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:786:3: rule__Table__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__3__Impl"


    // $ANTLR start "rule__Table__Group_4__4"
    // InternalMyDsl.g:794:1: rule__Table__Group_4__4 : rule__Table__Group_4__4__Impl ;
    public final void rule__Table__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( rule__Table__Group_4__4__Impl )
            // InternalMyDsl.g:799:2: rule__Table__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__4"


    // $ANTLR start "rule__Table__Group_4__4__Impl"
    // InternalMyDsl.g:805:1: rule__Table__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Table__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( ( '}' ) )
            // InternalMyDsl.g:810:1: ( '}' )
            {
            // InternalMyDsl.g:810:1: ( '}' )
            // InternalMyDsl.g:811:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__4__Impl"


    // $ANTLR start "rule__Table__Group_4_3__0"
    // InternalMyDsl.g:821:1: rule__Table__Group_4_3__0 : rule__Table__Group_4_3__0__Impl rule__Table__Group_4_3__1 ;
    public final void rule__Table__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( rule__Table__Group_4_3__0__Impl rule__Table__Group_4_3__1 )
            // InternalMyDsl.g:826:2: rule__Table__Group_4_3__0__Impl rule__Table__Group_4_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4_3__0"


    // $ANTLR start "rule__Table__Group_4_3__0__Impl"
    // InternalMyDsl.g:833:1: rule__Table__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( ',' ) )
            // InternalMyDsl.g:838:1: ( ',' )
            {
            // InternalMyDsl.g:838:1: ( ',' )
            // InternalMyDsl.g:839:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4_3__0__Impl"


    // $ANTLR start "rule__Table__Group_4_3__1"
    // InternalMyDsl.g:848:1: rule__Table__Group_4_3__1 : rule__Table__Group_4_3__1__Impl ;
    public final void rule__Table__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( rule__Table__Group_4_3__1__Impl )
            // InternalMyDsl.g:853:2: rule__Table__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4_3__1"


    // $ANTLR start "rule__Table__Group_4_3__1__Impl"
    // InternalMyDsl.g:859:1: rule__Table__Group_4_3__1__Impl : ( ( rule__Table__ColumnsAssignment_4_3_1 ) ) ;
    public final void rule__Table__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( ( ( rule__Table__ColumnsAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:864:1: ( ( rule__Table__ColumnsAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:864:1: ( ( rule__Table__ColumnsAssignment_4_3_1 ) )
            // InternalMyDsl.g:865:2: ( rule__Table__ColumnsAssignment_4_3_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_4_3_1()); 
            // InternalMyDsl.g:866:2: ( rule__Table__ColumnsAssignment_4_3_1 )
            // InternalMyDsl.g:866:3: rule__Table__ColumnsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4_3__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalMyDsl.g:875:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalMyDsl.g:880:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalMyDsl.g:887:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( () ) )
            // InternalMyDsl.g:892:1: ( () )
            {
            // InternalMyDsl.g:892:1: ( () )
            // InternalMyDsl.g:893:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalMyDsl.g:894:2: ()
            // InternalMyDsl.g:894:3: 
            {
            }

             after(grammarAccess.getColumnAccess().getColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalMyDsl.g:902:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalMyDsl.g:907:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalMyDsl.g:914:1: rule__Column__Group__1__Impl : ( 'Column' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( ( 'Column' ) )
            // InternalMyDsl.g:919:1: ( 'Column' )
            {
            // InternalMyDsl.g:919:1: ( 'Column' )
            // InternalMyDsl.g:920:2: 'Column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColumnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalMyDsl.g:929:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalMyDsl.g:934:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalMyDsl.g:941:1: rule__Column__Group__2__Impl : ( ( rule__Column__NameAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( ( ( rule__Column__NameAssignment_2 ) ) )
            // InternalMyDsl.g:946:1: ( ( rule__Column__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:946:1: ( ( rule__Column__NameAssignment_2 ) )
            // InternalMyDsl.g:947:2: ( rule__Column__NameAssignment_2 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:948:2: ( rule__Column__NameAssignment_2 )
            // InternalMyDsl.g:948:3: rule__Column__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalMyDsl.g:956:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalMyDsl.g:961:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalMyDsl.g:968:1: rule__Column__Group__3__Impl : ( '{' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( '{' ) )
            // InternalMyDsl.g:973:1: ( '{' )
            {
            // InternalMyDsl.g:973:1: ( '{' )
            // InternalMyDsl.g:974:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // InternalMyDsl.g:983:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalMyDsl.g:988:2: rule__Column__Group__4__Impl rule__Column__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Column__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalMyDsl.g:995:1: rule__Column__Group__4__Impl : ( ( rule__Column__Group_4__0 )? ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( ( ( rule__Column__Group_4__0 )? ) )
            // InternalMyDsl.g:1000:1: ( ( rule__Column__Group_4__0 )? )
            {
            // InternalMyDsl.g:1000:1: ( ( rule__Column__Group_4__0 )? )
            // InternalMyDsl.g:1001:2: ( rule__Column__Group_4__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_4()); 
            // InternalMyDsl.g:1002:2: ( rule__Column__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1002:3: rule__Column__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__5"
    // InternalMyDsl.g:1010:1: rule__Column__Group__5 : rule__Column__Group__5__Impl ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( rule__Column__Group__5__Impl )
            // InternalMyDsl.g:1015:2: rule__Column__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5"


    // $ANTLR start "rule__Column__Group__5__Impl"
    // InternalMyDsl.g:1021:1: rule__Column__Group__5__Impl : ( '}' ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( ( '}' ) )
            // InternalMyDsl.g:1026:1: ( '}' )
            {
            // InternalMyDsl.g:1026:1: ( '}' )
            // InternalMyDsl.g:1027:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5__Impl"


    // $ANTLR start "rule__Column__Group_4__0"
    // InternalMyDsl.g:1037:1: rule__Column__Group_4__0 : rule__Column__Group_4__0__Impl rule__Column__Group_4__1 ;
    public final void rule__Column__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( rule__Column__Group_4__0__Impl rule__Column__Group_4__1 )
            // InternalMyDsl.g:1042:2: rule__Column__Group_4__0__Impl rule__Column__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Column__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__0"


    // $ANTLR start "rule__Column__Group_4__0__Impl"
    // InternalMyDsl.g:1049:1: rule__Column__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Column__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( ( 'type' ) )
            // InternalMyDsl.g:1054:1: ( 'type' )
            {
            // InternalMyDsl.g:1054:1: ( 'type' )
            // InternalMyDsl.g:1055:2: 'type'
            {
             before(grammarAccess.getColumnAccess().getTypeKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__0__Impl"


    // $ANTLR start "rule__Column__Group_4__1"
    // InternalMyDsl.g:1064:1: rule__Column__Group_4__1 : rule__Column__Group_4__1__Impl ;
    public final void rule__Column__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( rule__Column__Group_4__1__Impl )
            // InternalMyDsl.g:1069:2: rule__Column__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__1"


    // $ANTLR start "rule__Column__Group_4__1__Impl"
    // InternalMyDsl.g:1075:1: rule__Column__Group_4__1__Impl : ( ( rule__Column__TypeAssignment_4_1 ) ) ;
    public final void rule__Column__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( ( ( rule__Column__TypeAssignment_4_1 ) ) )
            // InternalMyDsl.g:1080:1: ( ( rule__Column__TypeAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1080:1: ( ( rule__Column__TypeAssignment_4_1 ) )
            // InternalMyDsl.g:1081:2: ( rule__Column__TypeAssignment_4_1 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_4_1()); 
            // InternalMyDsl.g:1082:2: ( rule__Column__TypeAssignment_4_1 )
            // InternalMyDsl.g:1082:3: rule__Column__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__1__Impl"


    // $ANTLR start "rule__DB__NameAssignment_2"
    // InternalMyDsl.g:1091:1: rule__DB__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DB__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1096:2: ( ruleEString )
            {
            // InternalMyDsl.g:1096:2: ( ruleEString )
            // InternalMyDsl.g:1097:3: ruleEString
            {
             before(grammarAccess.getDBAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDBAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__NameAssignment_2"


    // $ANTLR start "rule__DB__TablesAssignment_4_2"
    // InternalMyDsl.g:1106:1: rule__DB__TablesAssignment_4_2 : ( ruleTable ) ;
    public final void rule__DB__TablesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1110:1: ( ( ruleTable ) )
            // InternalMyDsl.g:1111:2: ( ruleTable )
            {
            // InternalMyDsl.g:1111:2: ( ruleTable )
            // InternalMyDsl.g:1112:3: ruleTable
            {
             before(grammarAccess.getDBAccess().getTablesTableParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDBAccess().getTablesTableParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__TablesAssignment_4_2"


    // $ANTLR start "rule__DB__TablesAssignment_4_3_1"
    // InternalMyDsl.g:1121:1: rule__DB__TablesAssignment_4_3_1 : ( ruleTable ) ;
    public final void rule__DB__TablesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( ( ruleTable ) )
            // InternalMyDsl.g:1126:2: ( ruleTable )
            {
            // InternalMyDsl.g:1126:2: ( ruleTable )
            // InternalMyDsl.g:1127:3: ruleTable
            {
             before(grammarAccess.getDBAccess().getTablesTableParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDBAccess().getTablesTableParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__TablesAssignment_4_3_1"


    // $ANTLR start "rule__Table__NameAssignment_2"
    // InternalMyDsl.g:1136:1: rule__Table__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1140:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1141:2: ( ruleEString )
            {
            // InternalMyDsl.g:1141:2: ( ruleEString )
            // InternalMyDsl.g:1142:3: ruleEString
            {
             before(grammarAccess.getTableAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_2"


    // $ANTLR start "rule__Table__ColumnsAssignment_4_2"
    // InternalMyDsl.g:1151:1: rule__Table__ColumnsAssignment_4_2 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1155:1: ( ( ruleColumn ) )
            // InternalMyDsl.g:1156:2: ( ruleColumn )
            {
            // InternalMyDsl.g:1156:2: ( ruleColumn )
            // InternalMyDsl.g:1157:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_4_2"


    // $ANTLR start "rule__Table__ColumnsAssignment_4_3_1"
    // InternalMyDsl.g:1166:1: rule__Table__ColumnsAssignment_4_3_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( ( ruleColumn ) )
            // InternalMyDsl.g:1171:2: ( ruleColumn )
            {
            // InternalMyDsl.g:1171:2: ( ruleColumn )
            // InternalMyDsl.g:1172:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_4_3_1"


    // $ANTLR start "rule__Column__NameAssignment_2"
    // InternalMyDsl.g:1181:1: rule__Column__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Column__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1185:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1186:2: ( ruleEString )
            {
            // InternalMyDsl.g:1186:2: ( ruleEString )
            // InternalMyDsl.g:1187:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_2"


    // $ANTLR start "rule__Column__TypeAssignment_4_1"
    // InternalMyDsl.g:1196:1: rule__Column__TypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Column__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1200:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1201:2: ( ruleEString )
            {
            // InternalMyDsl.g:1201:2: ( ruleEString )
            // InternalMyDsl.g:1202:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getTypeEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getTypeEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__TypeAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082000L});

}