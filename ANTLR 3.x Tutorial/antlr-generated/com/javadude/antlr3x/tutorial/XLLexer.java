// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g 2017-01-29 18:52:22

  package com.javadude.antlr3x.tutorial;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class XLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int IDENT=4;
    public static final int WS=5;

    // delegates
    // delegators

    public XLLexer() {;} 
    public XLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public XLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g"; }

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:18:7: ( ( 'a' .. 'z' )+ )
            // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:18:9: ( 'a' .. 'z' )+
            {
            // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:18:9: ( 'a' .. 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:18:9: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:19:4: ( ( ' ' )+ )
            // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:19:6: ( ' ' )+
            {
            // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:19:6: ( ' ' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:19:6: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:1:8: ( IDENT | WS )
        int alt3=2;
        int LA3_0 = input.LA(1);

        if ( ((LA3_0>='a' && LA3_0<='z')) ) {
            alt3=1;
        }
        else if ( (LA3_0==' ') ) {
            alt3=2;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;
        }
        switch (alt3) {
            case 1 :
                // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:1:10: IDENT
                {
                mIDENT(); 

                }
                break;
            case 2 :
                // D:\\WorkGithub\\ANTLR 3.x Tutorial\\src\\com\\javadude\\antlr3x\\tutorial\\XL.g:1:16: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}