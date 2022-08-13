package com.team5.ud22.mvc.vista;

import javax.swing.JFrame;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Ex3Vista extends JFrame {
	
	public static JButton btnCientificos, btnProyectos, btnAsignado;

	public Ex3Vista() {
		setBounds(150, 150, 400, 400);

		/* Definition of the window */
		setTitle("Cientificos"); // PopUp window title
		setBounds(700, 200, 200, 200); // X Y coordinates of the application and its height and length
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Close the window when the operation is close
		getContentPane().setLayout(null);
		
		btnCientificos = new JButton("CIENTIFICOS");
		btnCientificos.setBounds(29, 29, 129, 23);
		btnCientificos.setActionCommand("ex3BtnCientificos");
		getContentPane().add(btnCientificos);
		
		btnProyectos = new JButton("PROYECTOS");
		btnProyectos.setBounds(29, 64, 129, 23);
		btnProyectos.setActionCommand("ex3BtnProyectos");
		getContentPane().add(btnProyectos);
		
		btnAsignado = new JButton("ASIGNADO");
		btnAsignado.setBounds(29, 98, 129, 23);
		btnAsignado.setActionCommand("ex3BtnAsignado");
		getContentPane().add(btnAsignado);
	}
}
