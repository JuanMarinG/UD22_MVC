package com.team5.ud22.mvc;

import com.team5.ud22.mvc.modelo.Cliente;
import com.team5.ud22.mvc.modelo.ClienteDAO;
import com.team5.ud22.mvc.modelo.conexion.ConnectionDB;

/**
 * Hello world!
 *
 */
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
        
        //Cliente cliente = new Cliente("marta","garcia","jshvasg","3456g","20220712");
        //cdao.insertarCliente(cliente);
        
        Cliente cliente = cdao.getCliente("3339");
        cliente.setApellido("Vlasdel");
        cliente.setNombre("Ionela");
        // No es pot modificar el dni
        cdao.actualizarCliente(cliente);
        
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
	}
}
