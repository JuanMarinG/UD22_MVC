package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.team5.ud22.mvc.modelo.util.Data;
import com.team5.ud22.mvc.vista.ClienteVista;


public class ClienteControlador implements ActionListener{
	
	// VISTAS //
	private ClienteVista clienteVista;
	private Data utils;
	
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
		switch(e.getActionCommand()) {
		case "Nuevo":
			
			break;
		case "Modificar":
			
			break;
		case "Salir":
			
			break;
		case "Eliminar":
		
			break;
		case "Buscar...":
			
			break;
		default:
			JOptionPane.showMessageDialog(null, "ERROR");
		}
				
	}
}
