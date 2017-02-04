// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\WorkGithub\\ANTLR-test2\\src\\study\\antlr\\first\\My.g 2017-02-04 17:04:06

  package study.antlr.first;
  import java.util.*;
  import org.antlr.runtime.BitSet;


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
    public String getGrammarFileName() { return "D:\\WorkGithub\\ANTLR-test2\\src\\study\\antlr\\first\\My.g"; }


      public Hashtable results = new Hashtable();



    // $ANTLR start "rule"
    // D:\\WorkGithub\\ANTLR-test2\\src\\study\\antlr\\first\\My.g:21:1: rule : ( element )+ ;
    public final void rule() throws RecognitionException {
        try {
            // D:\\WorkGithub\\ANTLR-test2\\src\\study\\antlr\\first\\My.g:21:5: ( ( element )+ )
            // D:\\WorkGithub\\ANTLR-test2\\src\\study\\antlr\\first\\My.g:21:7: ( element )+
            {
            // D:\\WorkGithub\\ANTLR-test2\\src\\study\\antlr\\first\\My.g:21:7: ( element )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NAME) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\WorkGithub\\ANTLR-test2\\src\\study\\antlr\\first\\My.g:21:8: element
            	    {
            	    pushFollow(FOLLOW_element_in_rule48);
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
    // D:\\WorkGithub\\ANTLR-test2\\src\\study\\antlr\\first\\My.g:32:1: element : NAME NUM ;
    public final void element() throws RecognitionException {
        Token NAME1=null;
        Token NUM2=null;

        try {
            // D:\\WorkGithub\\ANTLR-test2\\src\\study\\antlr\\first\\My.g:32:8: ( NAME NUM )
            // D:\\WorkGithub\\ANTLR-test2\\src\\study\\antlr\\first\\My.g:33:3: NAME NUM
            {
            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_element133); 
            NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_element135); 

              results.put((NAME1!=null?NAME1.getText():null), (NUM2!=null?NUM2.getText():null));


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


 

    public static final BitSet FOLLOW_element_in_rule48 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_NAME_in_element133 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NUM_in_element135 = new BitSet(new long[]{0x0000000000000002L});

}