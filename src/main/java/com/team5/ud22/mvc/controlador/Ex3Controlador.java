package com.team5.ud22.mvc.controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.team5.ud22.mvc.modelo.Cientifico;
import com.team5.ud22.mvc.modelo.CientificoDAO;
import com.team5.ud22.mvc.vista.CientificoVista;
import com.team5.ud22.mvc.vista.ClienteVista;
import com.team5.ud22.mvc.vista.paneles.CientificoBuscar;


public class Ex3Controlador implements ActionListener{
	
	// VISTAS //
	private CientificoVista cientificoVista;
	
	public Ex3Controlador() {
		cientificoVista = new CientificoVista();
		cientificoVista.setVisible(true);
		afegirListenersBotons();
		changePanelForm(cientificoVista.getcBuscar());
	}
	
	private void afegirListenersBotons() {
		((CientificoBuscar) cientificoVista.getcBuscar()).getBtnBuscarCientifico().addActionListener(this);;
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "BUSCAR":
			String dni = ((CientificoBuscar) cientificoVista.getcBuscar()).getDni();
			Cientifico c = CientificoDAO.getCientifico(dni);
			// Canviar-ho per poder eliminar cientific o modificar
			JOptionPane.showMessageDialog(null, c!=null ? c.toString() : "No se ha encontrado el cientifico");
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

