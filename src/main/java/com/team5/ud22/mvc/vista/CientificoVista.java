package com.team5.ud22.mvc.vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Color;


@SuppressWarnings("serial")
public class CientificoVista extends JFrame {

	private  JPanel contentPane, panel;
	
	private  JButton btnNuevo,btnModificar,btnEliminar,btnBuscar,btnSalir,btnGuardar,btnAdd;
	
	private  JTextField txtDNI, txtNomApels;
	private  JLabel lblNomApels;


	public CientificoVista() {
		setBounds(150, 150, 800, 375);

		/* Definition of the window */
		setTitle("Cientificos"); // PopUp window title
		setBounds(700, 200, 700, 420); // X Y coordinates of the application and its height and length
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Close the window when the operation is close
		//setVisible(true);
		
		/* Creation and added the panel to the window */
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 204));
		contentPane.setLayout(null);
		setContentPane(contentPane);
				
		// PANELS
		panel = new JPanel();
		panel.setBounds(173, 11, 501, 359);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(203, 141, 32, 28);
		panel.add(lblDni);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(235, 145, 86, 20);
		panel.add(txtDNI);
		txtDNI.setColumns(10);
		
		lblNomApels = new JLabel("NomApels:");
		lblNomApels.setBounds(165, 175, 70, 28);
		lblNomApels.setVisible(false);
		panel.add(lblNomApels);
		
		txtNomApels = new JTextField();
		txtNomApels.setEditable(false);
		txtNomApels.setColumns(10);
		txtNomApels.setBounds(235, 179, 86, 20);
		txtNomApels.setVisible(false);
		panel.add(txtNomApels);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(194, 233, 114, 23);
		btnGuardar.setVisible(false);
		btnGuardar.setActionCommand("cientificoBtnGuardar");
		panel.add(btnGuardar);
		
		btnAdd = new JButton("ADD");
		btnAdd.setBounds(194, 233, 114, 23);
		btnAdd.setVisible(false);
		btnAdd.setActionCommand("cientificoBtnAdd");
		panel.add(btnAdd);
		

		// BOTONES		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNuevo.setBounds(28, 128, 89, 23);
		btnNuevo.setActionCommand("cientificoBtnNuevo");
		contentPane.add(btnNuevo);		
		
		btnModificar = new JButton("Modificar");
		btnModificar.setEnabled(false);
		btnModificar.setBounds(27, 167, 89, 23);
		btnModificar.setActionCommand("cientificoBtnModificar");
		contentPane.add(btnModificar);	
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		btnEliminar.setBounds(28, 201, 89, 23);
		btnEliminar.setActionCommand("cientificoBtnEliminar");
		contentPane.add(btnEliminar);
		
		btnBuscar = new JButton("Buscar...");
		btnBuscar.setBounds(28, 69, 89, 23);
		btnBuscar.setActionCommand("cientificoBtnBuscar");
		contentPane.add(btnBuscar);
				
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(28, 347, 89, 23);
		btnSalir.setActionCommand("cientificoBtnSalir");
		contentPane.add(btnSalir);
		
		
		JLabel lblTitulo = new JLabel("CIENTIFICOS");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(28, 11, 108, 23);
		contentPane.add(lblTitulo);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 155, 2);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 115, 155, 2);
		contentPane.add(separator_1);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 333, 155, 2);
		getContentPane().add(separator_1_1);	
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


	public JButton getBtnGuardar() {
		return btnGuardar;
	}


	public JButton getBtnAdd() {
		return btnAdd;
	}


	public JTextField getTxtDNI() {
		return txtDNI;
	}


	public JTextField getTxtNomApels() {
		return txtNomApels;
	}


	public JLabel getLblNomApels() {
		return lblNomApels;
	}
	
}