// $ANTLR 3.5.2 tal_sql.g3 2017-11-23 13:03:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "BULLETIN", 
		"CONJ_ET", "CONJ_OU", "CONTACT", "DATE", "JOUR", "MOIS", "MOT", "POINT", 
		"RUBRIQUE", "SELECT", "TITRE", "VAR", "WS"
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
	public static final int RUBRIQUE=15;
	public static final int SELECT=16;
	public static final int TITRE=17;
	public static final int VAR=18;
	public static final int WS=19;

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
	// tal_sql.g3:12:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params ) | ( BULLETIN MOT ps= params ) | ( ( ARTICLE | TITRE ARTICLE ) RUBRIQUE rub_ps= rubrique_param ) | ( ( ARTICLE | TITRE ARTICLE ) DATE d= date ) | ( BULLETIN DATE d= date ) | ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params DATE d= date ) | ( BULLETIN MOT ps= params DATE d= date ) ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre rub_ps =null;
		Arbre d =null;

		Arbre ps_arbre, rub_ps_arbre;
		try {
			// tal_sql.g3:13:40: ( SELECT ( ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params ) | ( BULLETIN MOT ps= params ) | ( ( ARTICLE | TITRE ARTICLE ) RUBRIQUE rub_ps= rubrique_param ) | ( ( ARTICLE | TITRE ARTICLE ) DATE d= date ) | ( BULLETIN DATE d= date ) | ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params DATE d= date ) | ( BULLETIN MOT ps= params DATE d= date ) ) )
			// tal_sql.g3:14:3: SELECT ( ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params ) | ( BULLETIN MOT ps= params ) | ( ( ARTICLE | TITRE ARTICLE ) RUBRIQUE rub_ps= rubrique_param ) | ( ( ARTICLE | TITRE ARTICLE ) DATE d= date ) | ( BULLETIN DATE d= date ) | ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params DATE d= date ) | ( BULLETIN MOT ps= params DATE d= date ) )
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete54); 

							req_arbre.ajouteFils(new Arbre("","select distinct"));
						
			// tal_sql.g3:18:3: ( ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params ) | ( BULLETIN MOT ps= params ) | ( ( ARTICLE | TITRE ARTICLE ) RUBRIQUE rub_ps= rubrique_param ) | ( ( ARTICLE | TITRE ARTICLE ) DATE d= date ) | ( BULLETIN DATE d= date ) | ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params DATE d= date ) | ( BULLETIN MOT ps= params DATE d= date ) )
			int alt5=7;
			alt5 = dfa5.predict(input);
			switch (alt5) {
				case 1 :
					// tal_sql.g3:18:4: ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params )
					{
					// tal_sql.g3:18:4: ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params )
					// tal_sql.g3:18:5: ( ARTICLE | TITRE ARTICLE ) MOT ps= params
					{
					// tal_sql.g3:18:5: ( ARTICLE | TITRE ARTICLE )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ARTICLE) ) {
						alt1=1;
					}
					else if ( (LA1_0==TITRE) ) {
						alt1=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :
							// tal_sql.g3:18:6: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete68); 
							}
							break;
						case 2 :
							// tal_sql.g3:18:16: TITRE ARTICLE
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete72); 
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete74); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete77); 

					                                  			    req_arbre.ajouteFils(new Arbre("","texte.fichier"));
					                                  				req_arbre.ajouteFils(new Arbre("","from texte"));
					                                  				req_arbre.ajouteFils(new Arbre("","where"));
					                                  			
					pushFollow(FOLLOW_params_in_requete159);
					ps=params();
					state._fsp--;


					                                              				ps_arbre = ps;
					                                              				req_arbre.ajouteFils(ps_arbre);
					                                              			
					}

					}
					break;
				case 2 :
					// tal_sql.g3:29:45: ( BULLETIN MOT ps= params )
					{
					// tal_sql.g3:29:45: ( BULLETIN MOT ps= params )
					// tal_sql.g3:29:46: BULLETIN MOT ps= params
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete258); 
					match(input,MOT,FOLLOW_MOT_in_requete260); 

					                                            			    req_arbre.ajouteFils(new Arbre("","texte.bulletin"));
					                                            				req_arbre.ajouteFils(new Arbre("","from texte"));
					                                            				req_arbre.ajouteFils(new Arbre("","where"));
					                                            			
					pushFollow(FOLLOW_params_in_requete362);
					ps=params();
					state._fsp--;


					                                                        				ps_arbre = ps;
					                                                        				req_arbre.ajouteFils(ps_arbre);
					                                                        			
					}

					}
					break;
				case 3 :
					// tal_sql.g3:40:12: ( ( ARTICLE | TITRE ARTICLE ) RUBRIQUE rub_ps= rubrique_param )
					{
					// tal_sql.g3:40:12: ( ( ARTICLE | TITRE ARTICLE ) RUBRIQUE rub_ps= rubrique_param )
					// tal_sql.g3:40:13: ( ARTICLE | TITRE ARTICLE ) RUBRIQUE rub_ps= rubrique_param
					{
					// tal_sql.g3:40:13: ( ARTICLE | TITRE ARTICLE )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ARTICLE) ) {
						alt2=1;
					}
					else if ( (LA2_0==TITRE) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// tal_sql.g3:40:14: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete439); 
							}
							break;
						case 2 :
							// tal_sql.g3:40:24: TITRE ARTICLE
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete443); 
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete445); 
							}
							break;

					}

					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete448); 

					                                             			    req_arbre.ajouteFils(new Arbre("","rubrique.fichier"));
					                                             				req_arbre.ajouteFils(new Arbre("","from rubrique"));
					                                             				req_arbre.ajouteFils(new Arbre("","where"));
					                                             			
					pushFollow(FOLLOW_rubrique_param_in_requete552);
					rub_ps=rubrique_param();
					state._fsp--;


					                                                         				rub_ps_arbre = rub_ps;
					                                                         				req_arbre.ajouteFils(rub_ps_arbre);
					                                                         			
					}

					}
					break;
				case 4 :
					// tal_sql.g3:51:5: ( ( ARTICLE | TITRE ARTICLE ) DATE d= date )
					{
					// tal_sql.g3:51:5: ( ( ARTICLE | TITRE ARTICLE ) DATE d= date )
					// tal_sql.g3:51:7: ( ARTICLE | TITRE ARTICLE ) DATE d= date
					{
					// tal_sql.g3:51:7: ( ARTICLE | TITRE ARTICLE )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==ARTICLE) ) {
						alt3=1;
					}
					else if ( (LA3_0==TITRE) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// tal_sql.g3:51:8: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete624); 
							}
							break;
						case 2 :
							// tal_sql.g3:51:18: TITRE ARTICLE
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete628); 
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete630); 
							}
							break;

					}

					match(input,DATE,FOLLOW_DATE_in_requete633); 

							                req_arbre.ajouteFils(new Arbre("","date.fichier"));
					        				req_arbre.ajouteFils(new Arbre("","from date"));
					        				req_arbre.ajouteFils(new Arbre("","where"));
					        			
					pushFollow(FOLLOW_date_in_requete651);
					d=date();
					state._fsp--;


					        				ps_arbre = d;
					        				req_arbre.ajouteFils(ps_arbre);
					        			
					}

					}
					break;
				case 5 :
					// tal_sql.g3:62:11: ( BULLETIN DATE d= date )
					{
					// tal_sql.g3:62:11: ( BULLETIN DATE d= date )
					// tal_sql.g3:62:13: BULLETIN DATE d= date
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete679); 
					match(input,DATE,FOLLOW_DATE_in_requete681); 

					          		                req_arbre.ajouteFils(new Arbre("","date.bulletin"));
					                  				req_arbre.ajouteFils(new Arbre("","from date"));
					                  				req_arbre.ajouteFils(new Arbre("","where"));
					                  			
					pushFollow(FOLLOW_date_in_requete719);
					d=date();
					state._fsp--;


					                  				ps_arbre = d;
					                  				req_arbre.ajouteFils(ps_arbre);
					                  			
					}

					}
					break;
				case 6 :
					// tal_sql.g3:73:11: ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params DATE d= date )
					{
					// tal_sql.g3:73:11: ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params DATE d= date )
					// tal_sql.g3:73:12: ( ARTICLE | TITRE ARTICLE ) MOT ps= params DATE d= date
					{
					// tal_sql.g3:73:12: ( ARTICLE | TITRE ARTICLE )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==ARTICLE) ) {
						alt4=1;
					}
					else if ( (LA4_0==TITRE) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// tal_sql.g3:73:13: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete757); 
							}
							break;
						case 2 :
							// tal_sql.g3:73:23: TITRE ARTICLE
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete761); 
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete763); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete766); 
					pushFollow(FOLLOW_params_in_requete772);
					ps=params();
					state._fsp--;

					match(input,DATE,FOLLOW_DATE_in_requete774); 
					pushFollow(FOLLOW_date_in_requete780);
					d=date();
					state._fsp--;


					                		                req_arbre.ajouteFils(new Arbre("","texte.fichier"));
					                        				req_arbre.ajouteFils(new Arbre("","from texte LEFT JOIN date ON texte.fichier = date.fichier"));
					                        				req_arbre.ajouteFils(new Arbre("","where"));
					                        				ps_arbre = ps;
					                                        req_arbre.ajouteFils(ps_arbre);
					                                        req_arbre.ajouteFils(new Arbre("", "AND"));
					                                        ps_arbre = d;
					                                        req_arbre.ajouteFils(ps_arbre);
					                        			
					}

					}
					break;
				case 7 :
					// tal_sql.g3:84:11: ( BULLETIN MOT ps= params DATE d= date )
					{
					// tal_sql.g3:84:11: ( BULLETIN MOT ps= params DATE d= date )
					// tal_sql.g3:84:12: BULLETIN MOT ps= params DATE d= date
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete814); 
					match(input,MOT,FOLLOW_MOT_in_requete816); 
					pushFollow(FOLLOW_params_in_requete822);
					ps=params();
					state._fsp--;

					match(input,DATE,FOLLOW_DATE_in_requete824); 
					pushFollow(FOLLOW_date_in_requete830);
					d=date();
					state._fsp--;


					                          		                req_arbre.ajouteFils(new Arbre("","texte.bulletin"));
					                                  				req_arbre.ajouteFils(new Arbre("","from texte LEFT JOIN date ON texte.fichier = date.fichier"));
					                                  				req_arbre.ajouteFils(new Arbre("","where"));
					                                  				ps_arbre = ps;
					                                                  req_arbre.ajouteFils(ps_arbre);
					                                                  req_arbre.ajouteFils(new Arbre("", "AND"));
					                                                  ps_arbre = d;
					                                                  req_arbre.ajouteFils(ps_arbre);
					                                  			
					}

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
	// tal_sql.g3:98:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : sparams= suite_params ( CONJ_OU par2= param | CONJ_ET par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre sparams =null;
		Arbre par2 =null;

		Arbre sparams_arbre, par2_arbre;
		try {
			// tal_sql.g3:99:43: (sparams= suite_params ( CONJ_OU par2= param | CONJ_ET par2= param )* )
			// tal_sql.g3:100:2: sparams= suite_params ( CONJ_OU par2= param | CONJ_ET par2= param )*
			{
			pushFollow(FOLLOW_suite_params_in_params887);
			sparams=suite_params();
			state._fsp--;


				    sparams_arbre = sparams;
			         les_pars_arbre.ajouteFils(sparams_arbre);
				
			// tal_sql.g3:105:4: ( CONJ_OU par2= param | CONJ_ET par2= param )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==CONJ_OU) ) {
					alt6=1;
				}
				else if ( (LA6_0==CONJ_ET) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// tal_sql.g3:105:5: CONJ_OU par2= param
					{
					match(input,CONJ_OU,FOLLOW_CONJ_OU_in_params896); 
					pushFollow(FOLLOW_param_in_params902);
					par2=param();
					state._fsp--;


					            			par2_arbre = par2;
					                                                les_pars_arbre.ajouteFils(new Arbre("", "OR"));
					                                                les_pars_arbre.ajouteFils(par2_arbre);
					            			
					}
					break;
				case 2 :
					// tal_sql.g3:111:18: CONJ_ET par2= param
					{
					match(input,CONJ_ET,FOLLOW_CONJ_ET_in_params938); 
					pushFollow(FOLLOW_param_in_params944);
					par2=param();
					state._fsp--;


					            			par2_arbre = par2;
					                                                les_pars_arbre.ajouteFils(new Arbre("", "AND"));
					                                                les_pars_arbre.ajouteFils(par2_arbre);
					            			
					}
					break;

				default :
					break loop6;
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
	// tal_sql.g3:119:1: dateparams returns [Arbre les_pars_arbre = new Arbre(\"\")] : sparams= suite_params ;
	public final Arbre dateparams() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre sparams =null;

		Arbre sparams_arbre, par2_arbre;
		try {
			// tal_sql.g3:120:43: (sparams= suite_params )
			// tal_sql.g3:121:2: sparams= suite_params
			{
			pushFollow(FOLLOW_suite_params_in_dateparams987);
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
	// tal_sql.g3:128:1: suite_params returns [Arbre suite_params_arbre = new Arbre(\"\")] : par1= param (par3= param )* ;
	public final Arbre suite_params() throws RecognitionException {
		Arbre suite_params_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par3 =null;

		Arbre par1_arbre, par3_arbre;
		try {
			// tal_sql.g3:129:43: (par1= param (par3= param )* )
			// tal_sql.g3:130:5: par1= param (par3= param )*
			{
			pushFollow(FOLLOW_param_in_suite_params1020);
			par1=param();
			state._fsp--;


			        				par1_arbre = par1;
			        				suite_params_arbre.ajouteFils(par1_arbre);
			        			
			// tal_sql.g3:135:7: (par3= param )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==VAR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// tal_sql.g3:135:8: par3= param
					{
					pushFollow(FOLLOW_param_in_suite_params1046);
					par3=param();
					state._fsp--;


					    				par3_arbre = par3;
					    				suite_params_arbre.ajouteFils(new Arbre("", "AND"));
					    				suite_params_arbre.ajouteFils(par3_arbre);
					    			
					}
					break;

				default :
					break loop7;
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
	// tal_sql.g3:143:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : v= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token v=null;

		Arbre d_arbre;
		try {
			// tal_sql.g3:144:28: (v= VAR )
			// tal_sql.g3:145:2: v= VAR
			{
			v=(Token)match(input,VAR,FOLLOW_VAR_in_param1084); 
			 lepar_arbre.ajouteFils(new Arbre("mot like ", "'%"+v.getText()+"%'"));
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



	// $ANTLR start "rubrique_param"
	// tal_sql.g3:149:1: rubrique_param returns [Arbre lerubpar_arbre = new Arbre(\"\")] : v= VAR ;
	public final Arbre rubrique_param() throws RecognitionException {
		Arbre lerubpar_arbre =  new Arbre("");


		Token v=null;

		Arbre d_arbre;
		try {
			// tal_sql.g3:150:28: (v= VAR )
			// tal_sql.g3:151:2: v= VAR
			{
			v=(Token)match(input,VAR,FOLLOW_VAR_in_rubrique_param1122); 
			 lerubpar_arbre.ajouteFils(new Arbre("LOWER(rubrique) like ", "'%"+v.getText()+"%'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lerubpar_arbre;
	}
	// $ANTLR end "rubrique_param"



	// $ANTLR start "date"
	// tal_sql.g3:155:1: date returns [Arbre date_arbre = new Arbre(\"\")] : ( (j= JOUR m= MOIS a= ANNEE ) | (m= MOIS a= ANNEE ) |a= ANNEE );
	public final Arbre date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token j=null;
		Token m=null;
		Token a=null;

		try {
			// tal_sql.g3:155:49: ( (j= JOUR m= MOIS a= ANNEE ) | (m= MOIS a= ANNEE ) |a= ANNEE )
			int alt8=3;
			switch ( input.LA(1) ) {
			case JOUR:
				{
				alt8=1;
				}
				break;
			case MOIS:
				{
				alt8=2;
				}
				break;
			case ANNEE:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// tal_sql.g3:156:5: (j= JOUR m= MOIS a= ANNEE )
					{
					// tal_sql.g3:156:5: (j= JOUR m= MOIS a= ANNEE )
					// tal_sql.g3:156:6: j= JOUR m= MOIS a= ANNEE
					{
					j=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1155); 
					 date_arbre.ajouteFils(new Arbre("jour =", "'"+j.getText()+"'"));
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1170); 
					 date_arbre.ajouteFils(new Arbre("", "AND"));
					        	    date_arbre.ajouteFils(new Arbre("mois =", "'"+m.getText()+"'"));
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1204); 
					 date_arbre.ajouteFils(new Arbre("", "AND"));
					                        	    date_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 2 :
					// tal_sql.g3:164:5: (m= MOIS a= ANNEE )
					{
					// tal_sql.g3:164:5: (m= MOIS a= ANNEE )
					// tal_sql.g3:164:6: m= MOIS a= ANNEE
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1247); 
					 date_arbre.ajouteFils(new Arbre("mois =", "'"+m.getText()+"'"));
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1295); 
					 date_arbre.ajouteFils(new Arbre("", "AND"));
					                               	    date_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 3 :
					// tal_sql.g3:169:5: a= ANNEE
					{
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1344); 
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


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\32\uffff";
	static final String DFA5_eofS =
		"\32\uffff";
	static final String DFA5_minS =
		"\1\5\1\12\1\5\1\12\1\22\2\uffff\1\12\1\22\1\uffff\3\7\2\22\2\uffff\1\7"+
		"\2\22\2\uffff\4\7";
	static final String DFA5_maxS =
		"\1\21\1\17\1\5\1\15\1\22\2\uffff\1\17\1\22\1\uffff\5\22\2\uffff\3\22\2"+
		"\uffff\4\16";
	static final String DFA5_acceptS =
		"\5\uffff\1\3\1\4\2\uffff\1\5\5\uffff\1\1\1\6\3\uffff\1\2\1\7\4\uffff";
	static final String DFA5_specialS =
		"\32\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\1\1\3\12\uffff\1\2",
			"\1\6\2\uffff\1\4\1\uffff\1\5",
			"\1\7",
			"\1\11\2\uffff\1\10",
			"\1\12",
			"",
			"",
			"\1\6\2\uffff\1\4\1\uffff\1\5",
			"\1\13",
			"",
			"\1\16\1\15\1\uffff\1\20\3\uffff\1\17\3\uffff\1\14",
			"\1\23\1\22\1\uffff\1\25\3\uffff\1\24\3\uffff\1\21",
			"\1\16\1\15\1\uffff\1\20\3\uffff\1\17\3\uffff\1\14",
			"\1\26",
			"\1\27",
			"",
			"",
			"\1\23\1\22\1\uffff\1\25\3\uffff\1\24\3\uffff\1\21",
			"\1\30",
			"\1\31",
			"",
			"",
			"\1\16\1\15\1\uffff\1\20\3\uffff\1\17",
			"\1\16\1\15\1\uffff\1\20\3\uffff\1\17",
			"\1\23\1\22\1\uffff\1\25\3\uffff\1\24",
			"\1\23\1\22\1\uffff\1\25\3\uffff\1\24"
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "18:3: ( ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params ) | ( BULLETIN MOT ps= params ) | ( ( ARTICLE | TITRE ARTICLE ) RUBRIQUE rub_ps= rubrique_param ) | ( ( ARTICLE | TITRE ARTICLE ) DATE d= date ) | ( BULLETIN DATE d= date ) | ( ( ARTICLE | TITRE ARTICLE ) MOT ps= params DATE d= date ) | ( BULLETIN MOT ps= params DATE d= date ) )";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes26 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes28 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete54 = new BitSet(new long[]{0x0000000000020060L});
	public static final BitSet FOLLOW_ARTICLE_in_requete68 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_TITRE_in_requete72 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete74 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete77 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_params_in_requete159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete258 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete260 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_params_in_requete362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete439 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_TITRE_in_requete443 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete445 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete448 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_rubrique_param_in_requete552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete624 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_TITRE_in_requete628 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete630 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DATE_in_requete633 = new BitSet(new long[]{0x0000000000001810L});
	public static final BitSet FOLLOW_date_in_requete651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete679 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DATE_in_requete681 = new BitSet(new long[]{0x0000000000001810L});
	public static final BitSet FOLLOW_date_in_requete719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete757 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_TITRE_in_requete761 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete763 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete766 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_params_in_requete772 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DATE_in_requete774 = new BitSet(new long[]{0x0000000000001810L});
	public static final BitSet FOLLOW_date_in_requete780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete814 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete816 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_params_in_requete822 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DATE_in_requete824 = new BitSet(new long[]{0x0000000000001810L});
	public static final BitSet FOLLOW_date_in_requete830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_suite_params_in_params887 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_CONJ_OU_in_params896 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_param_in_params902 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_CONJ_ET_in_params938 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_param_in_params944 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_suite_params_in_dateparams987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_suite_params1020 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_param_in_suite_params1046 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_VAR_in_param1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_rubrique_param1122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_date1155 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOIS_in_date1170 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_date1247 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_date1344 = new BitSet(new long[]{0x0000000000000002L});
}
