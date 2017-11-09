// $ANTLR 3.5.2 tal_sql.g3 2017-11-09 13:08:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "BULLETIN", "CONJ_ET", 
		"CONJ_OU", "MOT", "POINT", "SELECT", "TITRE", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int BULLETIN=5;
	public static final int CONJ_ET=6;
	public static final int CONJ_OU=7;
	public static final int MOT=8;
	public static final int POINT=9;
	public static final int SELECT=10;
	public static final int TITRE=11;
	public static final int VAR=12;
	public static final int WS=13;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "tal_sql.g3"; }



	// $ANTLR start "listerequetes"
	// tal_sql.g3:3:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// tal_sql.g3:4:25: (r= requete POINT )
			// tal_sql.g3:5:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes26);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes28); 

							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// tal_sql.g3:12:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ARTICLE | BULLETIN | TITRE ARTICLE ) MOT ps= params ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// tal_sql.g3:13:26: ( SELECT ( ARTICLE | BULLETIN | TITRE ARTICLE ) MOT ps= params )
			// tal_sql.g3:14:3: SELECT ( ARTICLE | BULLETIN | TITRE ARTICLE ) MOT ps= params
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete55); 

							req_arbre.ajouteFils(new Arbre("","select distinct"));
						
			// tal_sql.g3:18:3: ( ARTICLE | BULLETIN | TITRE ARTICLE )
			int alt1=3;
			switch ( input.LA(1) ) {
			case ARTICLE:
				{
				alt1=1;
				}
				break;
			case BULLETIN:
				{
				alt1=2;
				}
				break;
			case TITRE:
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
					// tal_sql.g3:18:4: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete67); 

								req_arbre.ajouteFils(new Arbre("","article"));
								
					}
					break;
				case 2 :
					// tal_sql.g3:22:6: BULLETIN
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete79); 

								req_arbre.ajouteFils(new Arbre("","bulletin"));
								
					}
					break;
				case 3 :
					// tal_sql.g3:26:7: TITRE ARTICLE
					{
					match(input,TITRE,FOLLOW_TITRE_in_requete92); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete94); 

					            			req_arbre.ajouteFils(new Arbre("","titreArticle"));
					            			
					}
					break;

			}

			match(input,MOT,FOLLOW_MOT_in_requete116); 

							req_arbre.ajouteFils(new Arbre("","from titreresume"));
							req_arbre.ajouteFils(new Arbre("","where"));
						
			pushFollow(FOLLOW_params_in_requete129);
			ps=params();
			state._fsp--;


							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "params"
	// tal_sql.g3:42:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : sparams= suite_params ( CONJ_OU par2= param | CONJ_ET par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre sparams =null;
		Arbre par2 =null;

		Arbre sparams_arbre, par2_arbre;
		try {
			// tal_sql.g3:43:43: (sparams= suite_params ( CONJ_OU par2= param | CONJ_ET par2= param )* )
			// tal_sql.g3:44:2: sparams= suite_params ( CONJ_OU par2= param | CONJ_ET par2= param )*
			{
			pushFollow(FOLLOW_suite_params_in_params158);
			sparams=suite_params();
			state._fsp--;


				    sparams_arbre = sparams;
			         les_pars_arbre.ajouteFils(sparams_arbre);
				
			// tal_sql.g3:49:4: ( CONJ_OU par2= param | CONJ_ET par2= param )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CONJ_OU) ) {
					alt2=1;
				}
				else if ( (LA2_0==CONJ_ET) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// tal_sql.g3:49:5: CONJ_OU par2= param
					{
					match(input,CONJ_OU,FOLLOW_CONJ_OU_in_params167); 
					pushFollow(FOLLOW_param_in_params173);
					par2=param();
					state._fsp--;


					            			par2_arbre = par2;
					                                                les_pars_arbre.ajouteFils(new Arbre("", "OR"));
					                                                les_pars_arbre.ajouteFils(par2_arbre);
					            			
					}
					break;
				case 2 :
					// tal_sql.g3:55:18: CONJ_ET par2= param
					{
					match(input,CONJ_ET,FOLLOW_CONJ_ET_in_params209); 
					pushFollow(FOLLOW_param_in_params215);
					par2=param();
					state._fsp--;


					            			par2_arbre = par2;
					                                                les_pars_arbre.ajouteFils(new Arbre("", "AND"));
					                                                les_pars_arbre.ajouteFils(par2_arbre);
					            			
					}
					break;

				default :
					break loop2;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "suite_params"
	// tal_sql.g3:63:1: suite_params returns [Arbre suite_params_arbre = new Arbre(\"\")] : par1= param (par3= param )* ;
	public final Arbre suite_params() throws RecognitionException {
		Arbre suite_params_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par3 =null;

		Arbre par1_arbre, par3_arbre;
		try {
			// tal_sql.g3:64:43: (par1= param (par3= param )* )
			// tal_sql.g3:65:5: par1= param (par3= param )*
			{
			pushFollow(FOLLOW_param_in_suite_params264);
			par1=param();
			state._fsp--;


			        				par1_arbre = par1;
			        				suite_params_arbre.ajouteFils(par1_arbre);
			        			
			// tal_sql.g3:70:7: (par3= param )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==VAR) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// tal_sql.g3:70:8: par3= param
					{
					pushFollow(FOLLOW_param_in_suite_params290);
					par3=param();
					state._fsp--;


					    				par3_arbre = par3;
					    				suite_params_arbre.ajouteFils(new Arbre("", "AND"));
					    				suite_params_arbre.ajouteFils(par3_arbre);
					    			
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return suite_params_arbre;
	}
	// $ANTLR end "suite_params"



	// $ANTLR start "param"
	// tal_sql.g3:78:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// tal_sql.g3:78:51: (a= VAR )
			// tal_sql.g3:79:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param319); 
			 lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes26 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_POINT_in_listerequetes28 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete55 = new BitSet(new long[]{0x0000000000000830L});
	public static final BitSet FOLLOW_ARTICLE_in_requete67 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BULLETIN_in_requete79 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TITRE_in_requete92 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete94 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_MOT_in_requete116 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_params_in_requete129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_suite_params_in_params158 = new BitSet(new long[]{0x00000000000000C2L});
	public static final BitSet FOLLOW_CONJ_OU_in_params167 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_param_in_params173 = new BitSet(new long[]{0x00000000000000C2L});
	public static final BitSet FOLLOW_CONJ_ET_in_params209 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_param_in_params215 = new BitSet(new long[]{0x00000000000000C2L});
	public static final BitSet FOLLOW_param_in_suite_params264 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_param_in_suite_params290 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_VAR_in_param319 = new BitSet(new long[]{0x0000000000000002L});
}
