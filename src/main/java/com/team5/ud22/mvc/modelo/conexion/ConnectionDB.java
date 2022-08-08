package com.team5.ud22.mvc.modelo.conexion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

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
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(urlBaseDades, user, password);
			System.out.println("Server connected");

		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("No se ha podido conectar a la base de datos");
			System.out.println(ex);
		}
	}

	public static void closeConnection() {
		try {
			conexion.close();
			System.out.println("Se ha finalizado la conexion con el servidor");
		} catch (SQLException ex) {
			// no ho agafa tal com esta ara (Class.forName)
			// Logger.getLogger((MySQL.class.getName()).log(Level.SEVERE,null,ex);
			System.out.println(ex);
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
	
}
