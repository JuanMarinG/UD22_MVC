package com.team5.ud22.mvc.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
			
	//LISTAR VIDEOS
		
			public static  List<Video> getVideo() {
				List<Video> proyectos = new ArrayList<Video>();
				Connection conn = null;
				try {
					conn = ConnectionDB.getConexion("UD22_2MVC");
					String sql = "SELECT * FROM Videos";
					Statement st = conn.createStatement();
					ResultSet rs = st.executeQuery(sql);
					while (rs.next()) {
						
						Video.add(new Video(rs.getString("id"), rs.getString("title"), rs.getString("Director"), 0));
					}
					rs.close();
					st.close();
					ConnectionDB.closeConnection();
				} catch (Exception e) {
					e.printStackTrace();
				}

				return getVideo();
			}

		
			
	}


