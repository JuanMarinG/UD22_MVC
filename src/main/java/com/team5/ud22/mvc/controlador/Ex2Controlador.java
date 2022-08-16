package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.team5.ud22.mvc.vista.Ex2Vista;

public class Ex2Controlador implements ActionListener{
	
	private Ex2Vista v;
	
	private VideoControlador video;
	private ClienteControlador cliente;
	
	public Ex2Controlador() {
		v = new Ex2Vista();
		
		cliente = new ClienteControlador();
		video = new VideoControlador();
		
		setListeners();
	}

	private void setListeners() {
		Ex2Vista.getBtnClientes().addActionListener(this);
		Ex2Vista.getBtnVideos().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "ex2BtnClientes":
			cliente.display();
			break;
		case "ex3BtnVideos":
			video.display();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Boton no definido");
		}
	}
	
	public void display() {
		v.setVisible(true);
	}

}
