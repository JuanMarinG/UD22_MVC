package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
		String boton = e.getActionCommand();
		switch(boton) {
		case "Nuevo":
			changePanelForm(clienteVista.getcNuevo());
			break;
		case "Modificar":
			changePanelForm(clienteVista.getcModificar());
			break;
		case "Salir":
			clienteVista.dispose();
			break;
		case "Eliminar":
			changePanelForm(clienteVista.getcEliminar());
			break;
		case "Buscar...":
			changePanelForm(clienteVista.getcBuscar());
			break;
		default:
			JOptionPane.showMessageDialog(null, "ERROR");
		}
				
	}
	
	public void changePanelForm(JPanel panel) {		
		clienteVista.getPanelForms().removeAll();
		clienteVista.getPanelForms().repaint();
		clienteVista.getPanelForms().revalidate();
		
		clienteVista.getPanelForms().add(panel);
		clienteVista.getPanelForms().repaint();
		clienteVista.getPanelForms().revalidate();		
	}
}
