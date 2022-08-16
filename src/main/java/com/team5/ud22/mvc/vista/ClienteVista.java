package com.team5.ud22.mvc.vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;

import com.team5.ud22.mvc.vista.paneles.ClienteBuscar;
import com.team5.ud22.mvc.vista.paneles.ClienteNuevo;
import com.team5.ud22.mvc.vista.paneles.PanelTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.CardLayout;

@SuppressWarnings("serial")
public class ClienteVista extends JFrame {

	// ATTRIBUTES
	protected static final Container content = null;
	private JButton btnNuevo,btnModificar,btnEliminar,btnBuscar,btnSalir;
	public JLabel consulta;
	private JPanel contentPane;
	
	private JPanel panelForms,cNuevo,cModificar,cEliminar,cBuscar;

	// CONSTRUCTOR VISTA
	
	public ClienteVista() {
		setBounds(150, 150, 800, 375);

		/* Definition of the window */
		setTitle("Clientes"); // PopUp window title
		setBounds(300, 200, 700, 420); // X Y coordinates of the application and its height and length
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Close the window when the operation is close
		//setVisible(true);
		
		/* Creation and added the panel to the window */
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 204));
		contentPane.setLayout(null);
		setContentPane(contentPane);
				
		// PANELS
		panelForms = new JPanel();
		panelForms.setBounds(173, 11, 501, 359);
		contentPane.add(panelForms);
		panelForms.setLayout(new CardLayout(0, 0));
		
		cNuevo = new ClienteNuevo();
		cModificar = new JPanel();
		cEliminar = new JPanel();
		cBuscar = new ClienteBuscar();
		
		cBuscar.setPreferredSize(new Dimension(300, 40));
		cNuevo.setPreferredSize(new Dimension(300, 40));
		
		cModificar.setBackground(Color.yellow);
		cModificar.setPreferredSize(new Dimension(300, 40));
		
		cEliminar.setBackground(Color.BLACK);
		cEliminar.setPreferredSize(new Dimension(300, 40));
		

		

		// BOTONES		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNuevo.setBounds(28, 128, 89, 23);
		contentPane.add(btnNuevo);		
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(27, 167, 89, 23);
		contentPane.add(btnModificar);	
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(28, 201, 89, 23);
		contentPane.add(btnEliminar);
		
		btnBuscar = new JButton("Buscar...");
		btnBuscar.setBounds(28, 69, 89, 23);
		contentPane.add(btnBuscar);
		
		
				
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(28, 347, 89, 23);
		contentPane.add(btnSalir);
		
		
		JLabel lblTitulo = new JLabel("CLIENTES");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(34, 11, 83, 23);
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

	}	
	
	public JPanel getPanelForms() {
		return panelForms;
	}
	
	public JPanel getcNuevo() {
		return cNuevo;
	}

	public JPanel getcModificar() {
		return cModificar;
	}

	public JPanel getcEliminar() {
		return cEliminar;
	}

	public JPanel getcBuscar() {
		return cBuscar;
	}
	
	public JButton getBtnNuevo() {
		return btnNuevo;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}
  
	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

}