package com.team5.ud22.mvc;

import com.team5.ud22.mvc.controlador.ClienteControlador;
import com.team5.ud22.mvc.vista.ClienteVista;
import com.team5.ud22.mvc.vista.NuevaVista;

public class App {
	
	ClienteControlador clienteControlador;
	ClienteVista clienteVista;
	NuevaVista nuevaVista;
	
    public static void main(String[] args) {
    	App programa = new App();
    	programa.start();
    }

	private void start() {
		// Instanciar clases vistas
		clienteVista = new ClienteVista();
    	nuevaVista = new NuevaVista();
    	
    	// Instanciar controlador/es
    	clienteControlador = new ClienteControlador();
    	
    	// Settear controlador a las vistas
    	clienteVista.setControlador(clienteControlador);
    	nuevaVista.setControlador(clienteControlador);
    	
    	// Settear vistas al controlador
    	clienteControlador.setClienteVista(clienteVista);
    	clienteControlador.setNuevaVista(nuevaVista);
    	
    	// Iniciar programa mostrando vista principal
    	clienteVista.setVisible(true);
	}
}
