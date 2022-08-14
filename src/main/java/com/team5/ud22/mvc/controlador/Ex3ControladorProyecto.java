package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.team5.ud22.mvc.modelo.ProyectoDAO;
import com.team5.ud22.mvc.vista.ProyectosVista;
import com.team5.ud22.mvc.vista.paneles.ProyectoBuscar;

public class Ex3ControladorProyecto implements ActionListener{

	private ProyectosVista proyectoVista;
	
	
	public Ex3ControladorProyecto() {		
		proyectoVista = new ProyectosVista();		
		proyectoVista.setVisible(true);
		
		afegirListenersBotons();
	}

	private void afegirListenersBotons() {
		proyectoVista.getBtnBuscar().addActionListener(this);
		proyectoVista.getBtnNuevo().addActionListener(this);
		proyectoVista.getBtnSalir().addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		switch(e.getActionCommand()) {
		case "Nuevo":
			changePanelForm(proyectoVista.getPnlNuevo());		
			break;		
		case "Buscar...":
			changePanelForm(proyectoVista.getPnlBuscar());
			break;
		case "Salir":
			proyectoVista.dispose();
			break;		
		}
	}
	
	public void changePanelForm(JPanel panel) {		
		proyectoVista.getPnlForms().removeAll();
		proyectoVista.getPnlForms().repaint();
		proyectoVista.getPnlForms().revalidate();
		
		proyectoVista.getPnlForms().add(panel);		
		proyectoVista.getPnlForms().repaint();
		proyectoVista.getPnlForms().revalidate();		
	}
	
	public ProyectosVista getProyectoVista() {
		return proyectoVista;
	}

	public void setProyectoVista(ProyectosVista proyectoVista) {
		this.proyectoVista = proyectoVista;
	}
}