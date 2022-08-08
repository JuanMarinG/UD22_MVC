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

	private Connection conexion;

	public void openConnection() {

		String user = "", password = "";
		String urlBaseDades = "jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC";

		// Carregar user i password
		try (InputStream input = new FileInputStream("src/connectionDB/login.properties")) {
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

	public void closeConnection() {
		try {
			conexion.close();
			System.out.println("Se ha finalizado la conexion con el servidor");
		} catch (SQLException ex) {
			// no ho agafa tal com esta ara (Class.forName)
			// Logger.getLogger((MySQL.class.getName()).log(Level.SEVERE,null,ex);
			System.out.println(ex);
		}
	}

	public void createDB(String name) {
		try {
			if (conexion == null)
				openConnection();
			String Query = "CREATE DATABASE " + name;
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Se ha creado la base de datos " + name + " de forma exitosa.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Error creando DB.");
		}
	}

	public void createTable(String db, String name, String campos) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + name + " " + campos;
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Error creando tabla.");
		}
	}

	// INSERTAR DATOS EN TABLAS MYSQL
	public void insertData(String db, String nombre_tabla, String campos) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "REPLACE INTO " + nombre_tabla + " " + campos; // TENER EN CUENTA QUE INSERTA I TAMBIEN HACE UPDATE SI JA EXISTE

			Statement st = conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("Datos almacenados correctamente");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
	}

	// OBTENER VALORES MYSQL
	public void getValues(String db, String nombre_tabla) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "SELECT * FROM " + nombre_tabla;
			Statement st = conexion.createStatement();
			ResultSet resultSet;
			resultSet = st.executeQuery(Query);

			System.out.println("### "+nombre_tabla+" ###");
			while (resultSet.next()) {
				for(int i=1;i>0;i++) {
					try {
						resultSet.getString(i);
					}catch(Exception e) {
						break;
					}
					System.out.print(resultSet.getString(i) + " | ");
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	//METODO ELIMINA VALORES DE DB

	public void deleteRecord(String nombre_tabla, String ID) {
		try {
			String Query = "DELETE FROM " + nombre_tabla + "WHERE ID " + ID + "\"";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
		}
	}
	
	public void dropElement(String tipoElement,String element) {
		try {
			String Query = "DROP " + tipoElement + " IF EXISTS" + element;
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
		}
		
	}
}
