package com.team5.ud22.mvc.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.team5.ud22.mvc.modelo.conexion.ConnectionDB;

public class ProyectoDAO {
	
	// Obtener todos los proyectos
		public List<Proyecto> getProyectos() {
			List<Proyecto> proyectos = new ArrayList<Proyecto>();
			Connection conn = null;
			try {
				conn = ConnectionDB.getConexion("UD22_3MVC");
				String sql = "SELECT * FROM Proyectos";
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while (rs.next()) {
					proyectos.add(new Proyecto(rs.getString("idProyecto"), rs.getString("nombre"), rs.getInt("horas")));
				}
				rs.close();
				st.close();
				ConnectionDB.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}

			return proyectos;
		}

		// Obtener proyecto por ID
		public Proyecto getProyecto(String id) {
			
			Connection conn = null;
			Proyecto proyecto = null;
			try {
				conn = ConnectionDB.getConexion("UD22_3MVC");
				String sql = "SELECT * FROM Proyectos WHERE idProyecto = '" + id + "'";
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				if (rs.next()) {
					proyecto = new Proyecto(rs.getString("idProyecto"), rs.getString("nombre"), rs.getInt("horas"));
				}
				rs.close();
				st.close();
				ConnectionDB.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}

			return proyecto;
		}

		// Crear proyecto
		public void insertarProyecto(Proyecto proyecto) {
			Connection conn = null;
			try {
				conn = ConnectionDB.getConexion("UD22_3MVC");
				String sql = "INSERT INTO PROYECTOs VALUES (?,?,?);";
				PreparedStatement pSt = conn.prepareStatement(sql);
				pSt.setString(1, proyecto.getId());
				pSt.setString(2, proyecto.getNombre());
				pSt.setInt(3, proyecto.getHoras());
				pSt.executeUpdate();

				pSt.close();
				ConnectionDB.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		// Actualizar proyecto
		public void actualizarProyecto(Proyecto proyecto) {
			Connection conn = null;
			try {
				conn = ConnectionDB.getConexion("UD22_3MVC");
				String sql = "UPDATE proyectos" + " SET idProyecto = ?, nombre = ?, horas = ? WHERE idProyecto = ?";
				PreparedStatement pSt = conn.prepareStatement(sql);
				pSt.setString(1, proyecto.getId());
				pSt.setString(2, proyecto.getNombre());
				pSt.setInt(3, proyecto.getHoras());
				pSt.setString(4, proyecto.getId());
				pSt.executeUpdate();

				pSt.close();
				ConnectionDB.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// Eliminar proyecto
		public void eliminarProyecto(String id) {
			Connection conn = null;
			try {
				conn = ConnectionDB.getConexion("UD22_3MVC");
				String sql = "DELETE FROM proyectos WHERE idProyecto LIKE " + id;
				Statement st = conn.createStatement();
				st.executeUpdate(sql);

				st.close();
				ConnectionDB.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
