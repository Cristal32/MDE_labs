package org.xtext.example.mindstormsdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mindstormsdsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Choreography'", "'{'", "'instructions'", "','", "'}'", "'Grab'", "'Release'", "'random'", "'Rotate'", "'degrees'", "'GoForward'", "'cm'", "'-'"
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Choreography";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleChoreography"
    // InternalMyDsl.g:64:1: entryRuleChoreography returns [EObject current=null] : iv_ruleChoreography= ruleChoreography EOF ;
    public final EObject entryRuleChoreography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoreography = null;


        try {
            // InternalMyDsl.g:64:53: (iv_ruleChoreography= ruleChoreography EOF )
            // InternalMyDsl.g:65:2: iv_ruleChoreography= ruleChoreography EOF
            {
             newCompositeNode(grammarAccess.getChoreographyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoreography=ruleChoreography();

            state._fsp--;

             current =iv_ruleChoreography; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoreography"


    // $ANTLR start "ruleChoreography"
    // InternalMyDsl.g:71:1: ruleChoreography returns [EObject current=null] : ( () otherlv_1= 'Choreography' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleChoreography() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_instructions_6_0 = null;

        EObject lv_instructions_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'Choreography' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Choreography' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Choreography' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'Choreography' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChoreographyAccess().getChoreographyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getChoreographyAccess().getChoreographyKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChoreographyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoreographyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mindstormsdsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:113:3: (otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:114:4: otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getChoreographyAccess().getInstructionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:122:4: ( (lv_instructions_6_0= ruleInstruction ) )
                    // InternalMyDsl.g:123:5: (lv_instructions_6_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:123:5: (lv_instructions_6_0= ruleInstruction )
                    // InternalMyDsl.g:124:6: lv_instructions_6_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_instructions_6_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChoreographyRule());
                    						}
                    						add(
                    							current,
                    							"instructions",
                    							lv_instructions_6_0,
                    							"org.xtext.example.mindstormsdsl.MyDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:141:4: (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:142:5: otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getChoreographyAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:146:5: ( (lv_instructions_8_0= ruleInstruction ) )
                    	    // InternalMyDsl.g:147:6: (lv_instructions_8_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:147:6: (lv_instructions_8_0= ruleInstruction )
                    	    // InternalMyDsl.g:148:7: lv_instructions_8_0= ruleInstruction
                    	    {

                    	    							newCompositeNode(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_instructions_8_0=ruleInstruction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChoreographyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"instructions",
                    	    								lv_instructions_8_0,
                    	    								"org.xtext.example.mindstormsdsl.MyDsl.Instruction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoreography"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:179:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyDsl.g:179:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyDsl.g:180:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyDsl.g:186:1: ruleInstruction returns [EObject current=null] : (this_Choreography_0= ruleChoreography | this_Grab_1= ruleGrab | this_Release_2= ruleRelease | this_Rotate_3= ruleRotate | this_GoForward_4= ruleGoForward ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Choreography_0 = null;

        EObject this_Grab_1 = null;

        EObject this_Release_2 = null;

        EObject this_Rotate_3 = null;

        EObject this_GoForward_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:192:2: ( (this_Choreography_0= ruleChoreography | this_Grab_1= ruleGrab | this_Release_2= ruleRelease | this_Rotate_3= ruleRotate | this_GoForward_4= ruleGoForward ) )
            // InternalMyDsl.g:193:2: (this_Choreography_0= ruleChoreography | this_Grab_1= ruleGrab | this_Release_2= ruleRelease | this_Rotate_3= ruleRotate | this_GoForward_4= ruleGoForward )
            {
            // InternalMyDsl.g:193:2: (this_Choreography_0= ruleChoreography | this_Grab_1= ruleGrab | this_Release_2= ruleRelease | this_Rotate_3= ruleRotate | this_GoForward_4= ruleGoForward )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
            case 19:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:194:3: this_Choreography_0= ruleChoreography
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getChoreographyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Choreography_0=ruleChoreography();

                    state._fsp--;


                    			current = this_Choreography_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:203:3: this_Grab_1= ruleGrab
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getGrabParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Grab_1=ruleGrab();

                    state._fsp--;


                    			current = this_Grab_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:212:3: this_Release_2= ruleRelease
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Release_2=ruleRelease();

                    state._fsp--;


                    			current = this_Release_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:221:3: this_Rotate_3= ruleRotate
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getRotateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotate_3=ruleRotate();

                    state._fsp--;


                    			current = this_Rotate_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:230:3: this_GoForward_4= ruleGoForward
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getGoForwardParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoForward_4=ruleGoForward();

                    state._fsp--;


                    			current = this_GoForward_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:242:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:242:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:243:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:249:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:255:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:256:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:256:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:257:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:265:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleGrab"
    // InternalMyDsl.g:276:1: entryRuleGrab returns [EObject current=null] : iv_ruleGrab= ruleGrab EOF ;
    public final EObject entryRuleGrab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrab = null;


        try {
            // InternalMyDsl.g:276:45: (iv_ruleGrab= ruleGrab EOF )
            // InternalMyDsl.g:277:2: iv_ruleGrab= ruleGrab EOF
            {
             newCompositeNode(grammarAccess.getGrabRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrab=ruleGrab();

            state._fsp--;

             current =iv_ruleGrab; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrab"


    // $ANTLR start "ruleGrab"
    // InternalMyDsl.g:283:1: ruleGrab returns [EObject current=null] : ( () otherlv_1= 'Grab' ) ;
    public final EObject ruleGrab() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:289:2: ( ( () otherlv_1= 'Grab' ) )
            // InternalMyDsl.g:290:2: ( () otherlv_1= 'Grab' )
            {
            // InternalMyDsl.g:290:2: ( () otherlv_1= 'Grab' )
            // InternalMyDsl.g:291:3: () otherlv_1= 'Grab'
            {
            // InternalMyDsl.g:291:3: ()
            // InternalMyDsl.g:292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGrabAccess().getGrabAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGrabAccess().getGrabKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrab"


    // $ANTLR start "entryRuleRelease"
    // InternalMyDsl.g:306:1: entryRuleRelease returns [EObject current=null] : iv_ruleRelease= ruleRelease EOF ;
    public final EObject entryRuleRelease() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelease = null;


        try {
            // InternalMyDsl.g:306:48: (iv_ruleRelease= ruleRelease EOF )
            // InternalMyDsl.g:307:2: iv_ruleRelease= ruleRelease EOF
            {
             newCompositeNode(grammarAccess.getReleaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelease=ruleRelease();

            state._fsp--;

             current =iv_ruleRelease; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelease"


    // $ANTLR start "ruleRelease"
    // InternalMyDsl.g:313:1: ruleRelease returns [EObject current=null] : ( () otherlv_1= 'Release' ) ;
    public final EObject ruleRelease() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:319:2: ( ( () otherlv_1= 'Release' ) )
            // InternalMyDsl.g:320:2: ( () otherlv_1= 'Release' )
            {
            // InternalMyDsl.g:320:2: ( () otherlv_1= 'Release' )
            // InternalMyDsl.g:321:3: () otherlv_1= 'Release'
            {
            // InternalMyDsl.g:321:3: ()
            // InternalMyDsl.g:322:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReleaseAccess().getReleaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getReleaseAccess().getReleaseKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelease"


    // $ANTLR start "entryRuleRotate"
    // InternalMyDsl.g:336:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalMyDsl.g:336:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalMyDsl.g:337:2: iv_ruleRotate= ruleRotate EOF
            {
             newCompositeNode(grammarAccess.getRotateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotate=ruleRotate();

            state._fsp--;

             current =iv_ruleRotate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalMyDsl.g:343:1: ruleRotate returns [EObject current=null] : ( () ( (lv_random_1_0= 'random' ) )? otherlv_2= 'Rotate' otherlv_3= '{' (otherlv_4= 'degrees' ( (lv_degrees_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token lv_random_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_degrees_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:349:2: ( ( () ( (lv_random_1_0= 'random' ) )? otherlv_2= 'Rotate' otherlv_3= '{' (otherlv_4= 'degrees' ( (lv_degrees_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:350:2: ( () ( (lv_random_1_0= 'random' ) )? otherlv_2= 'Rotate' otherlv_3= '{' (otherlv_4= 'degrees' ( (lv_degrees_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:350:2: ( () ( (lv_random_1_0= 'random' ) )? otherlv_2= 'Rotate' otherlv_3= '{' (otherlv_4= 'degrees' ( (lv_degrees_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:351:3: () ( (lv_random_1_0= 'random' ) )? otherlv_2= 'Rotate' otherlv_3= '{' (otherlv_4= 'degrees' ( (lv_degrees_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:351:3: ()
            // InternalMyDsl.g:352:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRotateAccess().getRotateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:358:3: ( (lv_random_1_0= 'random' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:359:4: (lv_random_1_0= 'random' )
                    {
                    // InternalMyDsl.g:359:4: (lv_random_1_0= 'random' )
                    // InternalMyDsl.g:360:5: lv_random_1_0= 'random'
                    {
                    lv_random_1_0=(Token)match(input,18,FOLLOW_9); 

                    					newLeafNode(lv_random_1_0, grammarAccess.getRotateAccess().getRandomRandomKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRotateRule());
                    					}
                    					setWithLastConsumed(current, "random", lv_random_1_0 != null, "random");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRotateAccess().getRotateKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:380:3: (otherlv_4= 'degrees' ( (lv_degrees_5_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:381:4: otherlv_4= 'degrees' ( (lv_degrees_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getRotateAccess().getDegreesKeyword_4_0());
                    			
                    // InternalMyDsl.g:385:4: ( (lv_degrees_5_0= ruleEInt ) )
                    // InternalMyDsl.g:386:5: (lv_degrees_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:386:5: (lv_degrees_5_0= ruleEInt )
                    // InternalMyDsl.g:387:6: lv_degrees_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRotateAccess().getDegreesEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_degrees_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRotateRule());
                    						}
                    						set(
                    							current,
                    							"degrees",
                    							lv_degrees_5_0,
                    							"org.xtext.example.mindstormsdsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRotateAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotate"


    // $ANTLR start "entryRuleGoForward"
    // InternalMyDsl.g:413:1: entryRuleGoForward returns [EObject current=null] : iv_ruleGoForward= ruleGoForward EOF ;
    public final EObject entryRuleGoForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoForward = null;


        try {
            // InternalMyDsl.g:413:50: (iv_ruleGoForward= ruleGoForward EOF )
            // InternalMyDsl.g:414:2: iv_ruleGoForward= ruleGoForward EOF
            {
             newCompositeNode(grammarAccess.getGoForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoForward=ruleGoForward();

            state._fsp--;

             current =iv_ruleGoForward; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoForward"


    // $ANTLR start "ruleGoForward"
    // InternalMyDsl.g:420:1: ruleGoForward returns [EObject current=null] : ( () otherlv_1= 'GoForward' otherlv_2= '{' (otherlv_3= 'cm' ( (lv_cm_4_0= ruleEInt ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleGoForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_cm_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:426:2: ( ( () otherlv_1= 'GoForward' otherlv_2= '{' (otherlv_3= 'cm' ( (lv_cm_4_0= ruleEInt ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:427:2: ( () otherlv_1= 'GoForward' otherlv_2= '{' (otherlv_3= 'cm' ( (lv_cm_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:427:2: ( () otherlv_1= 'GoForward' otherlv_2= '{' (otherlv_3= 'cm' ( (lv_cm_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:428:3: () otherlv_1= 'GoForward' otherlv_2= '{' (otherlv_3= 'cm' ( (lv_cm_4_0= ruleEInt ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:428:3: ()
            // InternalMyDsl.g:429:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGoForwardAccess().getGoForwardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGoForwardAccess().getGoForwardKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getGoForwardAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:443:3: (otherlv_3= 'cm' ( (lv_cm_4_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:444:4: otherlv_3= 'cm' ( (lv_cm_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getGoForwardAccess().getCmKeyword_3_0());
                    			
                    // InternalMyDsl.g:448:4: ( (lv_cm_4_0= ruleEInt ) )
                    // InternalMyDsl.g:449:5: (lv_cm_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:449:5: (lv_cm_4_0= ruleEInt )
                    // InternalMyDsl.g:450:6: lv_cm_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getGoForwardAccess().getCmEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_cm_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGoForwardRule());
                    						}
                    						set(
                    							current,
                    							"cm",
                    							lv_cm_4_0,
                    							"org.xtext.example.mindstormsdsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGoForwardAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoForward"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:476:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:476:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:477:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:483:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:489:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:490:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:490:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:491:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:491:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:492:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000002F0800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});

}