package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnexion {

	public static void main(String[] args) throws Exception {
		
		//chargement de pilote en m�moire
		Class.forName("org.hsqldb.jdbcDriver");
		
		//�tablissement de la connexion avec la base de donn�es
		Connection connexion = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/","jason","jason");
		
		Statement st = connexion.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM document");
		
		// mapping objet relationnel pour changer les objets
		while( rs.next()) {
			String  str = rs.getString("nom");
		}
		
		 st.close();
		 connexion.close();

	}

}
