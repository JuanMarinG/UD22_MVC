package com.team5.ud22.mvc.vista;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex2Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JButton btnClientes, btnVideos;

	public Ex2Vista() {
		setBounds(150, 150, 400, 400);

		/* Definition of the window */
		setTitle("Clientes-Videos"); // PopUp window title
		setBounds(700, 200, 200, 200); // X Y coordinates of the application and its height and length
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Close the window when the operation is close
		getContentPane().setLayout(null);
		
		btnClientes = new JButton("CLIENTES");
		btnClientes.setBounds(29, 29, 129, 23);
		btnClientes.setActionCommand("ex2BtnClientes");
		getContentPane().add(btnClientes);
		
		btnVideos = new JButton("VIDEOS");
		btnVideos.setBounds(29, 64, 129, 23);
		btnVideos.setActionCommand("ex2BtnVideos");
		getContentPane().add(btnVideos);
		
	}
	
	public static JButton getBtnClientes() {
		return btnClientes;
	}

	public static void setBtnClientes(JButton btnClientes) {
		Ex2Vista.btnClientes = btnClientes;
	}

	public static JButton getBtnVideos() {
		return btnVideos;
	}

	public static void setBtnVideos(JButton btnVideos) {
		Ex2Vista.btnVideos = btnVideos;
	}

}
