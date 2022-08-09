package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.team5.ud22.mvc.vista.CientificoVista;
import com.team5.ud22.mvc.vista.ClienteVista;


public class Ex3Controlador implements ActionListener{
	
	// VISTAS //
	private CientificoVista cientificoVista;
	
	public Ex3Controlador() {
		cientificoVista = new CientificoVista();
		cientificoVista.setVisible(true);
		afegirListenersBotons();
	}
	
	private void afegirListenersBotons() {
		cientificoVista.getBtnBuscar().addActionListener(this);
		cientificoVista.getBtnEliminar().addActionListener(this);
		cientificoVista.getBtnModificar().addActionListener(this);
		cientificoVista.getBtnNuevo().addActionListener(this);
		cientificoVista.getBtnSalir().addActionListener(this);
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		switch(e.getActionCommand()) {
		case "Nuevo":
			changePanelForm(cientificoVista.getcNuevo());
			break;
		case "Modificar":
			changePanelForm(cientificoVista.getcModificar());
			break;
		case "Salir":
			cientificoVista.dispose();
			break;
		case "Eliminar":
			changePanelForm(cientificoVista.getcEliminar());
			break;
		case "Buscar...":
			changePanelForm(cientificoVista.getcBuscar());
			break;
		default:
			JOptionPane.showMessageDialog(null, "ERROR");
		}				
	}
	
	public void changePanelForm(JPanel panel) {		
		cientificoVista.getPanelForms().removeAll();
		cientificoVista.getPanelForms().repaint();
		cientificoVista.getPanelForms().revalidate();
		
		cientificoVista.getPanelForms().add(panel);
		cientificoVista.getPanelForms().repaint();
		cientificoVista.getPanelForms().revalidate();		
	}
	
}

