package com.team5.ud22.mvc.controlador;

import com.team5.ud22.mvc.vista.ClienteVista;

public class ClienteControlador {
	
	// VISTAS //
	private ClienteVista clienteVista;
	
	// GETTERS y SETTERS //
	public ClienteVista getClienteVista() {
		return clienteVista;
	}

	public void setClienteVista(ClienteVista clienteVista) {
		this.clienteVista = clienteVista;
	}	

	//nose si tiene alguna utilidad
	public void visibilityVistaCliente(boolean estado) {
		clienteVista.setVisible(estado);
	}
}