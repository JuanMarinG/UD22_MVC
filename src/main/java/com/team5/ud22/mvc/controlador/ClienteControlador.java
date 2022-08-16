package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.team5.ud22.mvc.vista.ClienteVista;
import java.awt.Font;


public class ClienteControlador implements ActionListener{
	
	// VISTAS //
	private ClienteVista clienteVista;
	
	public void display() {
		clienteVista.setVisible(true);
	}
	
	public ClienteControlador() {
		clienteVista = new ClienteVista();		
		clienteVista.getBtnNuevo().setFont(new Font("Tahoma", Font.BOLD, 12));
		afegirListenersBotons();
	}
	
	private void afegirListenersBotons() {
		clienteVista.getBtnBuscar().addActionListener(this);
		clienteVista.getBtnEliminar().addActionListener(this);
		clienteVista.getBtnModificar().addActionListener(this);
		clienteVista.getBtnNuevo().addActionListener(this);
		clienteVista.getBtnSalir().addActionListener(this);
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		switch(e.getActionCommand()) {
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

