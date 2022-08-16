package com.team5.ud22.mvc.vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextArea;

public class AsignarVista extends JFrame {

	public AsignarVista() {
		
		setBounds(150, 150, 800, 375);

		/* Definition of the window */
		setTitle("Asignacion"); // PopUp window title
		setBounds(300, 200, 700, 420); // X Y coordinates of the application and its height and length
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Close the window when the operation is close
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleciona el proyecto a asignar");
		lblNewLabel.setBounds(10, 64, 284, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccionar el cientifico asignado");
		lblNewLabel_1.setBounds(10, 120, 239, 14);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(10, 188, 89, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("ASIGNACION DE PROYECTOS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 11, 264, 42);
		getContentPane().add(lblNewLabel_2);
		
		JList listProyecto = new JList();
		listProyecto.setBounds(10, 89, 161, 23);
		getContentPane().add(listProyecto);
		
		JList listCientifico = new JList();
		listCientifico.setBounds(10, 145, 161, 23);
		getContentPane().add(listCientifico);
		
		
	}
}
