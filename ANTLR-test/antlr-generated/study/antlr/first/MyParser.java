// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g 2017-02-04 16:39:22

  package study.antlr.first;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MyParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NAME", "NUM", "WS"
    };
    public static final int EOF=-1;
    public static final int NAME=4;
    public static final int NUM=5;
    public static final int WS=6;

    // delegates
    // delegators


        public MyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return MyParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g"; }



    // $ANTLR start "rule"
    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:15:1: rule : ( element )+ ;
    public final void rule() throws RecognitionException {
        try {
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:15:5: ( ( element )+ )
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:15:7: ( element )+
            {
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:15:7: ( element )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=NAME && LA1_0<=NUM)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:15:7: element
            	    {
            	    pushFollow(FOLLOW_element_in_rule38);
            	    element();

            	    state._fsp--;


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


    // $ANTLR start "element"
    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:26:1: element : ( NAME | NUM );
    public final void element() throws RecognitionException {
        try {
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:26:8: ( NAME | NUM )
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:
            {
            if ( (input.LA(1)>=NAME && input.LA(1)<=NUM) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "element"

    // Delegated rules


 

    public static final BitSet FOLLOW_element_in_rule38 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_element0 = new BitSet(new long[]{0x0000000000000002L});

}