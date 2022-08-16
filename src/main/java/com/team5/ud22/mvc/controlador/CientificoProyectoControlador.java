package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.team5.ud22.mvc.vista.AsignarVista;

public class CientificoProyectoControlador implements ActionListener{
	
	private AsignarVista asignarvista;
	
	public void display() {
	asignarvista.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
