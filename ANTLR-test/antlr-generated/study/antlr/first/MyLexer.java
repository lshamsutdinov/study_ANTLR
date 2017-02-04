// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g 2017-02-04 16:39:22

  package study.antlr.first;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MyLexer extends Lexer {
    public static final int EOF=-1;
    public static final int NAME=4;
    public static final int NUM=5;
    public static final int WS=6;

    // delegates
    // delegators

    public MyLexer() {;} 
    public MyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g"; }

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:17:5: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:17:7: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:17:7: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                alt1=1;
            }
            else if ( ((LA1_0>='A' && LA1_0<='Z')) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:17:8: ( 'a' .. 'z' )
                    {
                    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:17:8: ( 'a' .. 'z' )
                    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:17:9: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:17:19: ( 'A' .. 'Z' )
                    {
                    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:17:19: ( 'A' .. 'Z' )
                    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:17:20: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;

            }

            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:18:2: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt2=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:18:3: ( 'a' .. 'z' )
            	    {
            	    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:18:3: ( 'a' .. 'z' )
            	    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:18:4: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:18:14: ( 'A' .. 'Z' )
            	    {
            	    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:18:14: ( 'A' .. 'Z' )
            	    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:18:15: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:18:25: ( '0' .. '9' )
            	    {
            	    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:18:25: ( '0' .. '9' )
            	    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:18:26: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:21:4: ( ( '0' .. '9' )+ )
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:21:6: ( '0' .. '9' )+
            {
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:21:6: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:21:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:24:4: ( ( ' ' | '\\t' | '\\n' )+ )
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:24:6: ( ' ' | '\\t' | '\\n' )+
            {
            // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:24:6: ( ' ' | '\\t' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
        // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:1:8: ( NAME | NUM | WS )
        int alt5=3;
        switch ( input.LA(1) ) {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=1;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt5=2;
            }
            break;
        case '\t':
        case '\n':
        case ' ':
            {
            alt5=3;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;
        }

        switch (alt5) {
            case 1 :
                // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:1:10: NAME
                {
                mNAME(); 

                }
                break;
            case 2 :
                // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:1:15: NUM
                {
                mNUM(); 

                }
                break;
            case 3 :
                // D:\\WorkGithub\\ANTLR-test\\src\\study\\antlr\\first\\My.g:1:19: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}