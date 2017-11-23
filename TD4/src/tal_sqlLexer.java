// $ANTLR 3.5.2 tal_sql.g3 2017-11-23 13:03:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int BULLETIN=6;
	public static final int CONJ_ET=7;
	public static final int CONJ_OU=8;
	public static final int CONTACT=9;
	public static final int DATE=10;
	public static final int JOUR=11;
	public static final int MOIS=12;
	public static final int MOT=13;
	public static final int POINT=14;
	public static final int RUBRIQUE=15;
	public static final int SELECT=16;
	public static final int TITRE=17;
	public static final int VAR=18;
	public static final int WS=19;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "tal_sql.g3"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:173:8: ( 'vouloir' )
			// tal_sql.g3:173:10: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:176:9: ( 'article' )
			// tal_sql.g3:176:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:179:7: ( 'titre' )
			// tal_sql.g3:179:9: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "CONTACT"
	public final void mCONTACT() throws RecognitionException {
		try {
			int _type = CONTACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:182:9: ( 'contact' )
			// tal_sql.g3:182:11: 'contact'
			{
			match("contact"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTACT"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:185:10: ( 'bulletin' )
			// tal_sql.g3:185:12: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "CONJ_ET"
	public final void mCONJ_ET() throws RecognitionException {
		try {
			int _type = CONJ_ET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:188:9: ( 'et' )
			// tal_sql.g3:188:11: 'et'
			{
			match("et"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ_ET"

	// $ANTLR start "CONJ_OU"
	public final void mCONJ_OU() throws RecognitionException {
		try {
			int _type = CONJ_OU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:191:9: ( 'ou' )
			// tal_sql.g3:191:11: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ_OU"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:194:7: ( '.' )
			// tal_sql.g3:194:9: '.'
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
	// $ANTLR end "POINT"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:197:5: ( 'mot' | 'contenir' | 'parler' )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt1=1;
				}
				break;
			case 'c':
				{
				alt1=2;
				}
				break;
			case 'p':
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// tal_sql.g3:197:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// tal_sql.g3:197:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// tal_sql.g3:197:28: 'parler'
					{
					match("parler"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:200:10: ( 'rubrique' )
			// tal_sql.g3:200:12: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:203:6: ( 'parution' | 'redaction' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='p') ) {
				alt2=1;
			}
			else if ( (LA2_0=='r') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// tal_sql.g3:203:8: 'parution'
					{
					match("parution"); 

					}
					break;
				case 2 :
					// tal_sql.g3:203:21: 'redaction'
					{
					match("redaction"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "MOIS"
	public final void mMOIS() throws RecognitionException {
		try {
			int _type = MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:206:7: ( ( '0' .. '1' ) ( '0' .. '9' ) )
			// tal_sql.g3:206:9: ( '0' .. '1' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOIS"

	// $ANTLR start "JOUR"
	public final void mJOUR() throws RecognitionException {
		try {
			int _type = JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:209:7: ( ( '0' .. '9' ) ( '0' .. '9' ) )
			// tal_sql.g3:209:9: ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOUR"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:212:8: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// tal_sql.g3:212:10: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNEE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:215:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\t'||LA4_0=='\r'||LA4_0==' '||LA4_0=='d'||LA4_0=='j'||LA4_0=='q') ) {
				alt4=1;
			}
			else if ( (LA4_0=='\n') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// tal_sql.g3:215:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// tal_sql.g3:215:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt3=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt3=1;
						}
						break;
					case '\t':
						{
						alt3=2;
						}
						break;
					case '\r':
						{
						alt3=3;
						}
						break;
					case 'j':
						{
						alt3=4;
						}
						break;
					case 'q':
						{
						alt3=5;
						}
						break;
					case 'd':
						{
						alt3=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// tal_sql.g3:215:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// tal_sql.g3:215:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// tal_sql.g3:215:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// tal_sql.g3:215:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// tal_sql.g3:215:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// tal_sql.g3:215:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// tal_sql.g3:215:62: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// tal_sql.g3:218:6: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' ) ( 'a' .. 'z' )* ( '0' .. '9' )* )
			// tal_sql.g3:218:8: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' ) ( 'a' .. 'z' )* ( '0' .. '9' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// tal_sql.g3:218:40: ( 'a' .. 'z' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// tal_sql.g3:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop5;
				}
			}

			// tal_sql.g3:218:51: ( '0' .. '9' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// tal_sql.g3:
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
					break loop6;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// tal_sql.g3:1:8: ( SELECT | ARTICLE | TITRE | CONTACT | BULLETIN | CONJ_ET | CONJ_OU | POINT | MOT | RUBRIQUE | DATE | MOIS | JOUR | ANNEE | WS | VAR )
		int alt7=16;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// tal_sql.g3:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// tal_sql.g3:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// tal_sql.g3:1:25: TITRE
				{
				mTITRE(); 

				}
				break;
			case 4 :
				// tal_sql.g3:1:31: CONTACT
				{
				mCONTACT(); 

				}
				break;
			case 5 :
				// tal_sql.g3:1:39: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 6 :
				// tal_sql.g3:1:48: CONJ_ET
				{
				mCONJ_ET(); 

				}
				break;
			case 7 :
				// tal_sql.g3:1:56: CONJ_OU
				{
				mCONJ_OU(); 

				}
				break;
			case 8 :
				// tal_sql.g3:1:64: POINT
				{
				mPOINT(); 

				}
				break;
			case 9 :
				// tal_sql.g3:1:70: MOT
				{
				mMOT(); 

				}
				break;
			case 10 :
				// tal_sql.g3:1:74: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 11 :
				// tal_sql.g3:1:83: DATE
				{
				mDATE(); 

				}
				break;
			case 12 :
				// tal_sql.g3:1:88: MOIS
				{
				mMOIS(); 

				}
				break;
			case 13 :
				// tal_sql.g3:1:93: JOUR
				{
				mJOUR(); 

				}
				break;
			case 14 :
				// tal_sql.g3:1:98: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 15 :
				// tal_sql.g3:1:104: WS
				{
				mWS(); 

				}
				break;
			case 16 :
				// tal_sql.g3:1:107: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\1\uffff\7\22\1\uffff\5\22\1\uffff\3\22\1\uffff\5\22\1\50\1\51\4\22\1"+
		"\57\1\60\1\16\7\22\2\uffff\1\70\4\22\2\uffff\1\16\6\22\1\uffff\4\22\1"+
		"\111\1\16\2\22\1\114\7\22\1\uffff\2\22\1\uffff\3\22\1\70\3\22\1\134\1"+
		"\135\1\136\5\22\3\uffff\1\70\1\144\1\145\1\146\1\22\3\uffff\1\145";
	static final String DFA7_eofS =
		"\150\uffff";
	static final String DFA7_minS =
		"\1\11\1\157\1\162\1\151\1\157\1\165\1\164\1\165\1\uffff\1\157\1\141\1"+
		"\145\2\60\1\uffff\1\145\1\165\1\157\1\uffff\1\165\2\164\1\156\1\154\2"+
		"\60\1\164\1\162\1\142\1\144\3\60\1\151\1\156\1\154\1\151\1\162\1\164\1"+
		"\154\2\uffff\1\60\1\154\1\162\1\141\1\60\2\uffff\1\60\1\164\1\157\1\143"+
		"\1\145\1\141\1\145\1\uffff\1\145\1\164\1\151\1\143\2\60\1\151\1\154\1"+
		"\60\1\143\1\156\1\164\1\162\1\151\1\161\1\164\1\uffff\1\162\1\145\1\uffff"+
		"\1\164\2\151\1\60\1\157\1\165\1\151\3\60\1\162\2\156\1\145\1\157\3\uffff"+
		"\4\60\1\156\3\uffff\1\60";
	static final String DFA7_maxS =
		"\1\172\1\157\1\162\1\151\1\157\1\165\1\164\1\165\1\uffff\1\157\1\141\1"+
		"\165\2\71\1\uffff\1\145\1\165\1\157\1\uffff\1\165\2\164\1\156\1\154\2"+
		"\172\1\164\1\162\1\142\1\144\2\71\1\172\1\151\1\156\1\154\1\151\1\162"+
		"\1\164\1\154\2\uffff\1\172\1\165\1\162\1\141\1\71\2\uffff\1\172\1\164"+
		"\1\157\1\143\3\145\1\uffff\1\145\1\164\1\151\1\143\1\71\1\172\1\151\1"+
		"\154\1\172\1\143\1\156\1\164\1\162\1\151\1\161\1\164\1\uffff\1\162\1\145"+
		"\1\uffff\1\164\2\151\1\172\1\157\1\165\1\151\3\172\1\162\2\156\1\145\1"+
		"\157\3\uffff\4\172\1\156\3\uffff\1\172";
	static final String DFA7_acceptS =
		"\10\uffff\1\10\5\uffff\1\17\3\uffff\1\20\25\uffff\1\6\1\7\5\uffff\1\14"+
		"\1\15\7\uffff\1\11\20\uffff\1\16\2\uffff\1\3\17\uffff\1\1\1\2\1\4\5\uffff"+
		"\1\5\1\13\1\12\1\uffff";
	static final String DFA7_specialS =
		"\150\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\16\2\uffff\1\16\22\uffff\1\16\15\uffff\1\10\1\uffff\2\14\10\15\7\uffff"+
			"\32\22\6\uffff\1\2\1\5\1\4\1\21\1\6\4\22\1\17\2\22\1\11\1\22\1\7\1\12"+
			"\1\20\1\13\1\22\1\3\1\22\1\1\4\22",
			"\1\23",
			"\1\24",
			"\1\25",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\31",
			"",
			"\1\32",
			"\1\33",
			"\1\35\17\uffff\1\34",
			"\12\36",
			"\12\37",
			"",
			"\1\40",
			"\1\41",
			"\1\42",
			"",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\12\22\47\uffff\32\22",
			"\12\22\47\uffff\32\22",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\12\56",
			"\12\56",
			"\12\22\47\uffff\32\22",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"",
			"",
			"\12\22\47\uffff\32\22",
			"\1\71\10\uffff\1\72",
			"\1\73",
			"\1\74",
			"\12\75",
			"",
			"",
			"\12\22\47\uffff\32\22",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102\3\uffff\1\103",
			"\1\104",
			"",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\12\22",
			"\12\22\47\uffff\32\22",
			"\1\112",
			"\1\113",
			"\12\22\47\uffff\32\22",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"",
			"\1\124",
			"\1\125",
			"",
			"\1\126",
			"\1\127",
			"\1\130",
			"\12\22\47\uffff\32\22",
			"\1\131",
			"\1\132",
			"\1\133",
			"\12\22\47\uffff\32\22",
			"\12\22\47\uffff\32\22",
			"\12\22\47\uffff\32\22",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"",
			"",
			"",
			"\12\22\47\uffff\32\22",
			"\12\22\47\uffff\32\22",
			"\12\22\47\uffff\32\22",
			"\12\22\47\uffff\32\22",
			"\1\147",
			"",
			"",
			"",
			"\12\22\47\uffff\32\22"
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | TITRE | CONTACT | BULLETIN | CONJ_ET | CONJ_OU | POINT | MOT | RUBRIQUE | DATE | MOIS | JOUR | ANNEE | WS | VAR );";
		}
	}

}
