package com.team5.ud22.mvc;

import com.team5.ud22.mvc.modelo.Cliente;
import com.team5.ud22.mvc.modelo.ClienteDAO;
import com.team5.ud22.mvc.modelo.conexion.ConnectionDB;

public class App 
{
    public static void main( String[] args )
    {
    	setupDefault();
    	
        ClienteDAO cdao = new ClienteDAO();
        
        System.out.println("---ANTES---");
        for(Cliente c : cdao.getClientes()) {
        	System.out.println(c);
        }        
        
        Cliente cliente = cdao.getCliente("3339");
        cliente.setApellido("Vlasdel");
        cliente.setNombre("Ionela");
        // No es pot modificar el dni
        cdao.actualizarCliente(cliente);
        
        cdao.eliminarCliente("'3456g'");
        
        System.out.println("\n---DESPUES---");
        for(Cliente c : cdao.getClientes()) {
        	System.out.println(c);
        }
    }

	private static void setupDefault() {
		ConnectionDB.clear();
		ClienteDAO cdao = new ClienteDAO();
		cdao.insertarCliente(new Cliente("Jone","Joana","Tgn","7778","20220101"));
		cdao.insertarCliente(new Cliente("Arnau","Mas","Alcover","3339","20020926"));
		cdao.insertarCliente(new Cliente("Marta","garcia","Bcn","3456g","20220712"));
	}
}
