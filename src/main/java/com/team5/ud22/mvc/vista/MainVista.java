package com.team5.ud22.mvc.vista;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MainVista extends JFrame{
	private JButton btnProyectos, btnCientificos, btnRelacion;
	
	public MainVista() {
		getContentPane().setLayout(null);
		/* Definition of the window */
		setTitle("MAIN"); // PopUp window title
		setBounds(700, 200, 400, 200); // X Y coordinates of the application and its height and length
		
		btnProyectos = new JButton("PROYECTOS");
		btnProyectos.setBounds(123, 25, 126, 23);
		btnProyectos.setActionCommand("mainBtnProyectos");
		getContentPane().add(btnProyectos);
		
		btnCientificos = new JButton("CIENTIFICOS");
		btnCientificos.setBounds(123, 59, 126, 23);
		btnCientificos.setActionCommand("mainBtnCientificos");
		getContentPane().add(btnCientificos);
		
		btnRelacion = new JButton("VER");
		btnRelacion.setBounds(131, 127, 103, 23);
		btnRelacion.setActionCommand("mainBtnVer");
		getContentPane().add(btnRelacion);
		
		JLabel lblNewLabel = new JLabel("Cientificos x Proyectos");
		lblNewLabel.setBounds(113, 109, 160, 14);
		getContentPane().add(lblNewLabel);
	}

	public JButton getBtnProyectos() {
		return btnProyectos;
	}

	public JButton getBtnCientificos() {
		return btnCientificos;
	}

	public JButton getBtnRelacion() {
		return btnRelacion;
	}
	
}
