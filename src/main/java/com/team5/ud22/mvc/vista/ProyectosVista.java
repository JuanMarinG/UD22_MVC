package com.team5.ud22.mvc.vista;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import com.team5.ud22.mvc.vista.paneles.PanelTest;
import com.team5.ud22.mvc.vista.paneles.ProyectoBuscar;
import com.team5.ud22.mvc.vista.paneles.ProyectoEliminar;
import com.team5.ud22.mvc.vista.paneles.ProyectoModificar;
import com.team5.ud22.mvc.vista.paneles.ProyectoNuevo;

public class ProyectosVista extends JFrame {

	protected static final Container content = null;
	private JPanel contentPane;	
	private JButton btnNuevo,btnBuscar,btnSalir;
	private JPanel pnlForms,pnlNuevo,pnlBuscar;

	/**
	 * Create the frame.
	 */
	public ProyectosVista() {		
		setTitle("Proyectos");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 200, 700, 420); // X Y coordinates of the application and its height and length

		contentPane = new JPanel();		
		contentPane.setBackground(new Color(51, 153, 204));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblTitulo = new JLabel("PROYECTOS");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(34, 11, 115, 23);
		contentPane.add(lblTitulo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 155, 2);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 115, 155, 2);
		contentPane.add(separator_1);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 333, 155, 2);
		contentPane.add(separator_1_1);
		
		// PANELS
		pnlForms = new JPanel();
		pnlForms.setBounds(173, 11, 501, 359);
		contentPane.add(pnlForms);
		pnlForms.setLayout(new CardLayout(0, 0));
		
		pnlNuevo = new ProyectoNuevo();		
		pnlBuscar = new ProyectoBuscar();		
		
		// BOTONES		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNuevo.setBounds(28, 128, 89, 23);
		contentPane.add(btnNuevo);		
		
		/*		 
		btnModificar = new JButton("Modificar"); 
		btnModificar.setBounds(27, 167, 89, 23); 
		contentPane.add(btnModificar);
		 			
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(28, 201, 89, 23);
		contentPane.add(btnEliminar);
		*/
		
		btnBuscar = new JButton("Buscar...");
		btnBuscar.setBounds(28, 69, 89, 23);
		contentPane.add(btnBuscar);
				
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(28, 347, 89, 23);
		contentPane.add(btnSalir);
	}

	public JButton getBtnNuevo() {
		return btnNuevo;
	}	

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JPanel getPnlForms() {
		return pnlForms;
	}

	public JPanel getPnlNuevo() {
		return pnlNuevo;
	}

	public JPanel getPnlBuscar() {
		return pnlBuscar;
	}

}
