package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.team5.ud22.mvc.vista.Ex3Vista;

public class Ex3Controlador implements ActionListener {
	
	private Ex3Vista v;
	
	private CientificoControlador cientifico;
	private ProyectoControlador proyecto;
	private CientificoProyectoControlador asignado;
	
	public Ex3Controlador() {
		v = new Ex3Vista();
		
		cientifico = new CientificoControlador();
		proyecto = new ProyectoControlador();
		asignado = new CientificoProyectoControlador();
		
		setListeners();
	}

	private void setListeners() {
		Ex3Vista.btnAsignado.addActionListener(this);
		Ex3Vista.btnProyectos.addActionListener(this);
		Ex3Vista.btnCientificos.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "ex3BtnCientificos":
			cientifico.display();
			break;
		case "ex3BtnProyectos":
			new ProyectoControlador();
			proyecto.display();
			break;
		case "ex3BtnAsignado":
			asignado.display();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Boton no definido");
		}
	}
	
	public void display() {
		v.setVisible(true);
	}
}
