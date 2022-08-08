package com.team5.ud22.mvc.modelo.conexion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionDB {

	private static Connection conexion = null;

	private static void openConnection(String db) {

		String user = "", password = "";
		String urlBaseDades = "jdbc:mysql://localhost:3306/"+db+"?useTimezone=true&serverTimezone=UTC";

		// Carregar user i password
		try (InputStream input = new FileInputStream("src/main/java/com/team5/ud22/mvc/modelo/conexion/login.properties")) {
			Properties prop = new Properties();
			prop.load(input);
			user = prop.getProperty("user");
			password = prop.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(urlBaseDades, user, password);			

		} catch (SQLException | ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}

	public static void closeConnection() {
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConexion(String db) {
		try {
			if(conexion == null || conexion.isClosed())
				openConnection(db);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexion;
	}
	
	public static void clear() {
		try {
			String Query = "DELETE FROM Cliente";
			Statement st = getConexion("UD22MVC").createStatement();
			st.executeUpdate(Query);
		} catch (SQLException ex) {}
	}
		
}
