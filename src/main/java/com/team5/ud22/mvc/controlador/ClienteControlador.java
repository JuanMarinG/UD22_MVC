package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.team5.ud22.mvc.vista.ClienteVista;

public class ClienteControlador implements ActionListener{
	
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
