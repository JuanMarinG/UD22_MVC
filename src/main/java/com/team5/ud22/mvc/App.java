package com.team5.ud22.mvc;

import com.team5.ud22.mvc.modelo.Cliente;
import com.team5.ud22.mvc.modelo.ClienteDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClienteDAO cdao = new ClienteDAO();
        
        for(Cliente c : cdao.getClientes()) {
        	System.out.println(c);
        }
        
        //Cliente cliente = new Cliente("marta","garcia","jshvasg","3456g","20220712");
        //cdao.insertarCliente(cliente);
        
        Cliente cliente = cdao.getCliente("399");
        cliente.setApellido("Vlasdel");
        cliente.setNombre("Ionela");
        cdao.actualizarCliente("399", cliente);
        
        for(Cliente c : cdao.getClientes()) {
        	System.out.println(c);
        }
    }
}
