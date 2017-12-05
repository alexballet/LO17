import java.sql.*;
import java.io.*;

import static java.sql.DriverManager.*;

public class interrogPostgresql  {

	private String username;
	private String password;
	private String url;
	private String nom;
	private int nbre;


	interrogPostgresql() {


	// ---- configure START
	this.username = "lo17xxx";
	//this.password = "dblo17";
	// The URL that will connect to TECFA's MySQL server
	// Syntax: jdbc:TYPE:machine:port/DB_NAME
	this.url = "jdbc:postgresql://tuxa.sme.utc:5432/dblo17";

	}

	public void requestDatabase(String sqlRequest) {

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
			con = getConnection(url, username, "dblo17");
			stmt = con.createStatement();
			// Send the query and bind to the result set
			rs = stmt.executeQuery(sqlRequest);
			while (rs.next()) {
				ResultSetMetaData rsmd = rs.getMetaData();

				int columnCount = rsmd.getColumnCount();

				// The column count starts from 1
				for (int i = 1; i <= columnCount-1; i++ ) {
					String name = rsmd.getColumnName(i);
					String s = rs.getString(name);
					System.out.print(s);
					System.out.print("\t");
				}

				String name = rsmd.getColumnName(columnCount);
				String s = rs.getString(name);
				System.out.print(s);
				System.out.println();
			}
			// Close resources
			stmt.close();
			con.close();

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
