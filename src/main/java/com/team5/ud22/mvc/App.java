package com.team5.ud22.mvc;

import com.team5.ud22.mvc.controlador.ClienteControlador;
import com.team5.ud22.mvc.vista.ClienteVista;

public class App {
	
	ClienteControlador clienteControlador;
	ClienteVista clienteVista;
	
    public static void main(String[] args) {
    	App programa = new App();
    	programa.start();
    }

	private void start() {
		// Instanciar clase vista
		clienteVista = new ClienteVista();
    	
    	// Instanciar controlador/es
    	clienteControlador = new ClienteControlador();
    	
    	// Settear controlador a las vistas 
    	clienteVista.setControlador(clienteControlador);
    	
    	// Settear vistas al controlador 
    	clienteControlador.setClienteVista(clienteVista);
    	
    	// Iniciar programa mostrando vista principal    	
    	clienteControlador.visibilityVistaCliente(true);
	}
}