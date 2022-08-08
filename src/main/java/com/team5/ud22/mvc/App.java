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
    }
}
