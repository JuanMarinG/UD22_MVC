package com.team5.ud22.mvc.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.team5.ud22.mvc.controlador.ClienteControlador;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NuevaVista extends JFrame {

	// ATTRIBUTES
	private ClienteControlador controlador;

	// CONSTRUCTOR VISTA

	public NuevaVista() {
		setBounds(150, 150, 800, 375);

		/* Definition of the window */
		setTitle("Cliente"); // PopUp window title
		setBounds(700, 200, 700, 420); // X Y coordinates of the application and its height and length
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton btnSalir = new JButton("Salir");
		getContentPane().add(btnSalir, BorderLayout.WEST);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambiarVistaCliente();
			}
		});

	}
	
	// Metodo para settear el controlador
	public void setControlador(ClienteControlador controlador) {
		this.controlador = controlador;
	}
}
