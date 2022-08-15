package com.team5.ud22.mvc.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

			while (rs.next()) {
				clientes.add(new Cliente(rs.getString("nombre"), rs.getString("apellido"), rs.getString("direccion"),
						rs.getString("dni"), rs.getString("fecha")));

			}
			rs.close();
			st.close();
			ConnectionDB.closeConnection();

		} catch(Exception e) {e.printStackTrace();}
		
		return clientes;
	}
	
	// Obtener cliente por DNI
	public Cliente getCliente(String dni){
		Connection conn = null;
		Cliente cliente = null;
		try {			
			conn = ConnectionDB.getConexion("UD22MVC");
			String sql = "SELECT * FROM Cliente WHERE DNI LIKE "+ dni;
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
			ConnectionDB.closeConnection();
		} catch(Exception e) {e.printStackTrace();} 
		
		return cliente;		
	}
	

	// Crear cliente
	public void insertarCliente(Cliente cliente) {
		Connection conn = null;
		try {
			conn = ConnectionDB.getConexion("UD22MVC");

			String sql = "INSERT INTO CLIENTE(nombre,apellido,direccion,dni,fecha) VALUES (?,?,?,?,?);";
			PreparedStatement pSt = conn.prepareStatement(sql);
			pSt.setString(1, cliente.getNombre());
			pSt.setString(2, cliente.getApellido());
			pSt.setString(3, cliente.getDireccion());
			pSt.setString(4, cliente.getDni());
			pSt.setString(5, cliente.getFecha());

			pSt.executeUpdate();

			pSt.close();
			ConnectionDB.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	// Actualizar cliente
	public void actualizarCliente(Cliente cliente) {
		Connection conn = null;
		try {
			conn = ConnectionDB.getConexion("UD22MVC");			
			String sql = "UPDATE Cliente"
					+ " SET nombre = ?,"
					+ " apellido = ?,"
					+ " direccion = ?,"
					+ " dni = ?,"
					+ " fecha = ?"
					+ " WHERE dni = ?";

			PreparedStatement pSt = conn.prepareStatement(sql);
			pSt.setString(1, cliente.getNombre());
			pSt.setString(2, cliente.getApellido());
			pSt.setString(3, cliente.getDireccion());
			pSt.setString(4, cliente.getDni());
			pSt.setString(5, cliente.getFecha());
			pSt.setString(6, cliente.getDni());

			pSt.executeUpdate();                    

			pSt.close();
			ConnectionDB.closeConnection();
		} catch(Exception e) {e.printStackTrace();} 
	}
	

	// Eliminar cliente
	public void eliminarCliente(String dni) {
		Connection conn = null;
		try {

			conn = ConnectionDB.getConexion("UD22MVC");	
			String sql = "DELETE FROM Cliente WHERE DNI LIKE " + dni;
			Statement st = conn.createStatement();
			st.executeUpdate(sql);

			st.close();
			ConnectionDB.closeConnection();
		} catch(Exception e) {e.printStackTrace();} 
	}	
	
}