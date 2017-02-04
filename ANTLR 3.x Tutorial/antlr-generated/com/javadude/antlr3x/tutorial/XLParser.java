// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g 2017-01-29 18:52:22

  package com.javadude.antlr3x.tutorial;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class XLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "WS"
    };
    public static final int EOF=-1;
    public static final int IDENT=4;
    public static final int WS=5;

    // delegates
    // delegators


        public XLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public XLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return XLParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g"; }



    // $ANTLR start "rule"
    // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:16:1: rule : ( IDENT )+ ;
    public final void rule() throws RecognitionException {
        try {
            // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:16:5: ( ( IDENT )+ )
            // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:16:7: ( IDENT )+
            {
            // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:16:7: ( IDENT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:16:7: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_rule39); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "rule"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_rule39 = new BitSet(new long[]{0x0000000000000012L});

}