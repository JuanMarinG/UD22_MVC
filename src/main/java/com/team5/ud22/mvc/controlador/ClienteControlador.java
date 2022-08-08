package com.team5.ud22.mvc.controlador;

import com.team5.ud22.mvc.vista.ClienteVista;
import com.team5.ud22.mvc.vista.NuevaVista;

public class ClienteControlador {
	
	// VISTAS //
	private ClienteVista clienteVista;
	private NuevaVista nuevaVista;
	
	// GETTERS y SETTERS //
	public ClienteVista getClienteVista() {
		return clienteVista;
	}

	public void setClienteVista(ClienteVista clienteVista) {
		this.clienteVista = clienteVista;
	}

	public NuevaVista getNuevaVista() {
		return nuevaVista;
	}

	public void setNuevaVista(NuevaVista nuevaVista) {
		this.nuevaVista = nuevaVista;
	}

	// CAMBIAR VISTAS //
	public void cambiarVistaNueva() {
		nuevaVista.setVisible(true);
		clienteVista.setVisible(false);
	}
	
	public void cambiarVistaCliente() {
		clienteVista.setVisible(true);
		nuevaVista.setVisible(false);
	}
}
