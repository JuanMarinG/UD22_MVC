package com.team5.ud22.mvc.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.team5.ud22.mvc.modelo.conexion.ConnectionDB;


public class ClienteDAO {
	
	// Obtener todos los clientes
	public List<Cliente> getClientes(){
		List<Cliente> clientes = new ArrayList<Cliente>();
		Connection conn = null;
		try {
			conn = ConnectionDB.getConexion("UD22MVC");
			String sql = "SELECT * FROM Cliente";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()){
				clientes.add(
					new Cliente(
						rs.getString("nombre"),
						rs.getString("apellido"),
						rs.getString("direccion"),
						rs.getString("dni"),
						rs.getString("fecha")
					)
				);
			}
			rs.close();
			st.close();
			conn.close();
		} catch(Exception e) {e.printStackTrace();}
		// Assegurar-se que es tanca la connexió
		if (conn!=null){
			try {
				conn.close();
			} catch (Exception e){}
		}
		return clientes;
	}
	
	// Obtener cliente por DNI
	public Cliente getCliente(String dni){
		Connection conn = null;
		Cliente cliente = null;
		try {			
			conn = ConnectionDB.getConexion("UD22MVC");
			String sql = "SELECT * FROM Cliente WHERE DNI iLIKE "+ dni;
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()){
				cliente = new Cliente(
							rs.getString("nombre"),
							rs.getString("apellido"),
							rs.getString("direccion"),
							rs.getString("dni"),
							rs.getString("fecha")
						);					
			}
			rs.close();
			st.close();	
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
		
		return cliente;		
	}
	
	// Crear cliente
	public void insertarCliente(Cliente cliente) {
		Connection conn = null;
		try {
			conn = ConnectionDB.getConexion("UD22MVC");			
			String sql = "INSERT INTO CLIENTE VALUES (?,?,?,?,?);";
			prepareStatement a = conn.prepareStatement(sql);
            a.setString(1, cliente.getNombre());
            a.setString(2, cliente.getApellido());
            a.setString(3, cliente.getDireccion());
            a.setString(1, cliente.getDni());
            a.setString(1, cliente.getFecha());
            a.executeUpdate();
            ResultSet rs = a.executeQuery();         

			System.out.println("Datos almacenados correctamente");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			//JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
		
	}
	
	// Actualizar cliente
	public void actualizarCliente(String dni, Cliente cliente) {
		
	}
	
	// Eliminar cliente
	public void eliminarCliente(String dni) {
		
	}
	
	/*
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
	 */
}
