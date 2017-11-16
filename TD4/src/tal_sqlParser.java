// $ANTLR 3.5.2 tal_sql.g3 2017-11-16 13:06:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "BULLETIN", 
		"CONJ_ET", "CONJ_OU", "CONTACT", "DATE", "JOUR", "MOIS", "MOT", "POINT", 
		"SELECT", "TITRE", "VAR", "WS"
	};
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
	public static final int SELECT=15;
	public static final int TITRE=16;
	public static final int VAR=17;
	public static final int WS=18;

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
	// tal_sql.g3:12:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ARTICLE | BULLETIN | TITRE ARTICLE ) ( ( MOT ps= params ) | DATE d= date ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre d =null;

		Arbre ps_arbre;
		try {
			// tal_sql.g3:13:26: ( SELECT ( ARTICLE | BULLETIN | TITRE ARTICLE ) ( ( MOT ps= params ) | DATE d= date ) )
			// tal_sql.g3:14:3: SELECT ( ARTICLE | BULLETIN | TITRE ARTICLE ) ( ( MOT ps= params ) | DATE d= date )
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

			// tal_sql.g3:30:3: ( ( MOT ps= params ) | DATE d= date )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==MOT) ) {
				alt2=1;
			}
			else if ( (LA2_0==DATE) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// tal_sql.g3:30:4: ( MOT ps= params )
					{
					// tal_sql.g3:30:4: ( MOT ps= params )
					// tal_sql.g3:30:5: MOT ps= params
					{
					match(input,MOT,FOLLOW_MOT_in_requete118); 

									req_arbre.ajouteFils(new Arbre("","from titreresume"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_params_in_requete132);
					ps=params();
					state._fsp--;


					            				ps_arbre = ps;
					            				req_arbre.ajouteFils(ps_arbre);
					            			
					}

					}
					break;
				case 2 :
					// tal_sql.g3:40:5: DATE d= date
					{
					match(input,DATE,FOLLOW_DATE_in_requete156); 

					        				req_arbre.ajouteFils(new Arbre("","from datesparution"));
					        				req_arbre.ajouteFils(new Arbre("","where"));
					        			
					pushFollow(FOLLOW_date_in_requete174);
					d=date();
					state._fsp--;


					        				ps_arbre = d;
					        				req_arbre.ajouteFils(ps_arbre);
					        			
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
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "params"
	// tal_sql.g3:53:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : sparams= suite_params ( CONJ_OU par2= param | CONJ_ET par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre sparams =null;
		Arbre par2 =null;

		Arbre sparams_arbre, par2_arbre;
		try {
			// tal_sql.g3:54:43: (sparams= suite_params ( CONJ_OU par2= param | CONJ_ET par2= param )* )
			// tal_sql.g3:55:2: sparams= suite_params ( CONJ_OU par2= param | CONJ_ET par2= param )*
			{
			pushFollow(FOLLOW_suite_params_in_params213);
			sparams=suite_params();
			state._fsp--;


				    sparams_arbre = sparams;
			         les_pars_arbre.ajouteFils(sparams_arbre);
				
			// tal_sql.g3:60:4: ( CONJ_OU par2= param | CONJ_ET par2= param )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==CONJ_OU) ) {
					alt3=1;
				}
				else if ( (LA3_0==CONJ_ET) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// tal_sql.g3:60:5: CONJ_OU par2= param
					{
					match(input,CONJ_OU,FOLLOW_CONJ_OU_in_params222); 
					pushFollow(FOLLOW_param_in_params228);
					par2=param();
					state._fsp--;


					            			par2_arbre = par2;
					                                                les_pars_arbre.ajouteFils(new Arbre("", "OR"));
					                                                les_pars_arbre.ajouteFils(par2_arbre);
					            			
					}
					break;
				case 2 :
					// tal_sql.g3:66:18: CONJ_ET par2= param
					{
					match(input,CONJ_ET,FOLLOW_CONJ_ET_in_params264); 
					pushFollow(FOLLOW_param_in_params270);
					par2=param();
					state._fsp--;


					            			par2_arbre = par2;
					                                                les_pars_arbre.ajouteFils(new Arbre("", "AND"));
					                                                les_pars_arbre.ajouteFils(par2_arbre);
					            			
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
		return les_pars_arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "dateparams"
	// tal_sql.g3:74:1: dateparams returns [Arbre les_pars_arbre = new Arbre(\"\")] : sparams= suite_params ;
	public final Arbre dateparams() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre sparams =null;

		Arbre sparams_arbre, par2_arbre;
		try {
			// tal_sql.g3:75:43: (sparams= suite_params )
			// tal_sql.g3:76:2: sparams= suite_params
			{
			pushFollow(FOLLOW_suite_params_in_dateparams313);
			sparams=suite_params();
			state._fsp--;


				    sparams_arbre = sparams;
			         les_pars_arbre.ajouteFils(sparams_arbre);
				
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
	// $ANTLR end "dateparams"



	// $ANTLR start "suite_params"
	// tal_sql.g3:83:1: suite_params returns [Arbre suite_params_arbre = new Arbre(\"\")] : par1= param (par3= param )* ;
	public final Arbre suite_params() throws RecognitionException {
		Arbre suite_params_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par3 =null;

		Arbre par1_arbre, par3_arbre;
		try {
			// tal_sql.g3:84:43: (par1= param (par3= param )* )
			// tal_sql.g3:85:5: par1= param (par3= param )*
			{
			pushFollow(FOLLOW_param_in_suite_params346);
			par1=param();
			state._fsp--;


			        				par1_arbre = par1;
			        				suite_params_arbre.ajouteFils(par1_arbre);
			        			
			// tal_sql.g3:90:7: (par3= param )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==VAR) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// tal_sql.g3:90:8: par3= param
					{
					pushFollow(FOLLOW_param_in_suite_params372);
					par3=param();
					state._fsp--;


					    				par3_arbre = par3;
					    				suite_params_arbre.ajouteFils(new Arbre("", "AND"));
					    				suite_params_arbre.ajouteFils(par3_arbre);
					    			
					}
					break;

				default :
					break loop4;
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
	// tal_sql.g3:98:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : v= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token v=null;

		Arbre d_arbre;
		try {
			// tal_sql.g3:99:28: (v= VAR )
			// tal_sql.g3:100:2: v= VAR
			{
			v=(Token)match(input,VAR,FOLLOW_VAR_in_param410); 
			 lepar_arbre.ajouteFils(new Arbre("mot =", "'"+v.getText()+"'"));
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



	// $ANTLR start "date"
	// tal_sql.g3:104:1: date returns [Arbre date_arbre = new Arbre(\"\")] : ( (j= JOUR m= MOIS a= ANNEE ) | (m= MOIS a= ANNEE ) |a= ANNEE );
	public final Arbre date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token j=null;
		Token m=null;
		Token a=null;

		try {
			// tal_sql.g3:104:49: ( (j= JOUR m= MOIS a= ANNEE ) | (m= MOIS a= ANNEE ) |a= ANNEE )
			int alt5=3;
			switch ( input.LA(1) ) {
			case JOUR:
				{
				alt5=1;
				}
				break;
			case MOIS:
				{
				alt5=2;
				}
				break;
			case ANNEE:
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
					// tal_sql.g3:105:5: (j= JOUR m= MOIS a= ANNEE )
					{
					// tal_sql.g3:105:5: (j= JOUR m= MOIS a= ANNEE )
					// tal_sql.g3:105:6: j= JOUR m= MOIS a= ANNEE
					{
					j=(Token)match(input,JOUR,FOLLOW_JOUR_in_date443); 
					 date_arbre.ajouteFils(new Arbre("jour =", "'"+j.getText()+"'"));
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_date458); 
					 date_arbre.ajouteFils(new Arbre("", "AND"));
					        	    date_arbre.ajouteFils(new Arbre("mois =", "'"+m.getText()+"'"));
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date492); 
					 date_arbre.ajouteFils(new Arbre("", "AND"));
					                        	    date_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 2 :
					// tal_sql.g3:113:5: (m= MOIS a= ANNEE )
					{
					// tal_sql.g3:113:5: (m= MOIS a= ANNEE )
					// tal_sql.g3:113:6: m= MOIS a= ANNEE
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_date535); 
					 date_arbre.ajouteFils(new Arbre("mois =", "'"+m.getText()+"'"));
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date583); 
					 date_arbre.ajouteFils(new Arbre("", "AND"));
					                               	    date_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 3 :
					// tal_sql.g3:118:5: a= ANNEE
					{
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date632); 
					 date_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
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
		}
		return date_arbre;
	}
	// $ANTLR end "date"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes26 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes28 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete55 = new BitSet(new long[]{0x0000000000010060L});
	public static final BitSet FOLLOW_ARTICLE_in_requete67 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_BULLETIN_in_requete79 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_TITRE_in_requete92 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete94 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_MOT_in_requete118 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_params_in_requete132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_requete156 = new BitSet(new long[]{0x0000000000001810L});
	public static final BitSet FOLLOW_date_in_requete174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_suite_params_in_params213 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_CONJ_OU_in_params222 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_param_in_params228 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_CONJ_ET_in_params264 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_param_in_params270 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_suite_params_in_dateparams313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_suite_params346 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_param_in_suite_params372 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_VAR_in_param410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_date443 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOIS_in_date458 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_date535 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_date632 = new BitSet(new long[]{0x0000000000000002L});
}
