package com.team5.ud22.mvc.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.team5.ud22.mvc.modelo.conexion.ConnectionDB;


public class CientificoDAO {
	
	// Obtener todos los cientificos
	public List<Cientifico> getCientificos(){
		List<Cientifico> cientificos = new ArrayList<Cientifico>();
		Connection conn = null;
		try {
			conn = ConnectionDB.getConexion("UD22_3MVC");
			String sql = "SELECT * FROM Cientificos";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()){
				cientificos.add(
					new Cientifico(
						rs.getString("DNI"),
						rs.getString("NomApels")
					)
				);
			}
			rs.close();
			st.close();
			ConnectionDB.closeConnection();
		} catch(Exception e) {e.printStackTrace();}
		
		return cientificos;
	}
	
	// Obtener cientifico por DNI
	public static Cientifico getCientifico(String dni){
		Connection conn = null;
		Cientifico cientifico = null;
		try {			
			conn = ConnectionDB.getConexion("UD22_3MVC");
			String sql = "SELECT * FROM Cientificos WHERE DNI LIKE "+ dni;
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()){
				cientifico = new Cientifico(
							rs.getString("DNI"),
							rs.getString("NomApels")
						);					
			}
			rs.close();
			st.close();	
			ConnectionDB.closeConnection();
		} catch(Exception e) {e.printStackTrace();} 
		
		return cientifico;		
	}
	
	// Crear cientifico
	public void insertarCientifico(Cientifico cientifico) {
		Connection conn = null;
		try {
			conn = ConnectionDB.getConexion("UD22_3MVC");			
			String sql = "INSERT INTO Cientificos VALUES (?,?)";
			PreparedStatement pSt = conn.prepareStatement(sql);
			pSt.setString(1, cientifico.getDni());
			pSt.setString(2, cientifico.getNomApels());
			pSt.executeUpdate();                    

			pSt.close();
			ConnectionDB.closeConnection();
		} catch(Exception e) {e.printStackTrace();} 
		
	}
	
	// Actualizar cientifico
	public void actualizarCientifico(Cientifico cientifico) {
		Connection conn = null;
		try {
			conn = ConnectionDB.getConexion("UD22_3MVC");			
			String sql = "UPDATE Cientificos"
					+ " NomApels = ?,"
					+ " WHERE DNI = ?";
			PreparedStatement pSt = conn.prepareStatement(sql);
			pSt.setString(1, cientifico.getNomApels());
			pSt.setString(2, cientifico.getDni());
			pSt.executeUpdate();                    

			pSt.close();
			ConnectionDB.closeConnection();
		} catch(Exception e) {e.printStackTrace();} 
	}
	
	// Eliminar cientifico
	public void eliminarCientifico(String dni) {
		Connection conn = null;
		try {
			conn = ConnectionDB.getConexion("UD22_3MVC");	
			String sql = "DELETE FROM Cientificos WHERE DNI LIKE " + dni;
			Statement st = conn.createStatement();
			st.executeUpdate(sql);

			st.close();
			ConnectionDB.closeConnection();
		} catch(Exception e) {e.printStackTrace();} 
	}	
	
}