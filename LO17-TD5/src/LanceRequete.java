import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
import java.io.*;

import static java.sql.DriverManager.*;

public class LanceRequete extends HttpServlet {
	String username;
	String password;
	String url;
	String requete ="";
	String nom;
	int nbre;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Lance requete!</title>");
        out.println("</head>");
        out.println("<body>");

	// ---- configure START
	username = "lo17xxx";
	//password = "dblo17";
	// The URL that will connect to TECFA's MySQL server
        // Syntax: jdbc:TYPE:machine:port/DB_NAME
        url = "jdbc:postgresql://tuxa.sme.utc:5432/dblo17";
	// dans certaines configurations locales il faut d�finir l'url par :
	//url = "jdbc:postgresql://tuxa.sme.utc";
	// ---- configure END

	String requete = request.getParameter("requete");
	Requester requester = new Requester();
	String corretRequest = requester.prepareRequest(requete);
	if (requete != null) {
		// INSTALL/load the Driver (Vendor specific Code)
		try {
			Class.forName("org.postgresql.Driver");
			} catch(java.lang.ClassNotFoundException e) {
	    		System.err.print("ClassNotFoundException: ");
	    		System.err.println(e.getMessage());
			}
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
		try {
			// Establish Connection to the database at URL with usename and password
			con = DriverManager.getConnection(url, username, "dblo17");
			stmt = con.createStatement();
			// Send the query and bind to the result set
			rs = stmt.executeQuery(corretRequest);
			ResultSetMetaData rsmd=rs.getMetaData();
			nbre=rsmd.getColumnCount();
			while (rs.next()) {
				for (int i=1; i<=nbre;i++){
				nom = rsmd.getColumnName(i);
				String s = rs.getString(nom);
				out.print(s);
				}
			out.print("<p>");
			}
		out.println("</body>");
		out.println("</html>");
		}
		// print out decent erreur messages
		catch(SQLException ex) {
			System.err.println("==> SQLException: ");
			while (ex != null) {
				System.out.println("Message:   " + ex.getMessage ());
				System.out.println("SQLState:  " + ex.getSQLState ());
				System.out.println("ErrorCode: " + ex.getErrorCode ());
				ex = ex.getNextException();
				System.out.println("");
	    			}
			} finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
            }
	}
}
