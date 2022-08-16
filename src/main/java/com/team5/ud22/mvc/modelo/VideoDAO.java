package com.team5.ud22.mvc.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.team5.ud22.mvc.modelo.conexion.ConnectionDB;

public class VideoDAO {

	// INSERTAR VIDEO
	public void insertarVideo(Video Video) {
		Connection conn = null;
		try {
			conn = ConnectionDB.getConexion("UD22_2MVC");
			String sql = "INSERT INTO Videos VALUES (?,?,?);";
			PreparedStatement pSt = conn.prepareStatement(sql);
			pSt.setString(1, Video.getId());
			pSt.setString(2, Video.getTitle());
			pSt.setString(3, Video.getDirector());
			pSt.executeUpdate();

			pSt.close();
			ConnectionDB.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//ACTUALIZAR VIDEO
		
		public void actualizarVideo(Video Video) {
			Connection conn = null;
			try {
				conn = ConnectionDB.getConexion("UD22_2MVC");
				String sql = "UPDATE Videos SET title = ?, director = ? WHERE id = ?";
				PreparedStatement pSt = conn.prepareStatement(sql);
				pSt.setString(1, Video.getId());
				pSt.setString(2, Video.getTitle());
				pSt.setString(3, Video.getDirector());
				pSt.executeUpdate();

				pSt.close();
				ConnectionDB.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	//ELIMINAR VIDEO
		
		public void eliminarVideo(String id) {
			Connection conn = null;
			try {
				conn = ConnectionDB.getConexion("UD22_2MVC");
				String sql = "DELETE FROM Videos WHERE id LIKE '" + id + "'";
				Statement st = conn.createStatement();
				st.executeUpdate(sql);

				st.close();
				ConnectionDB.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
	}

}
