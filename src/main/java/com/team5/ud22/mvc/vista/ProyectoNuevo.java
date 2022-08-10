package com.team5.ud22.mvc.vista.paneles;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProyectoNuevo extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtID;
	private JButton btnGuardar;
	private JLabel lblTitle;
	private JLabel lblHoras;
	private JTextField textField;
	
	/**
	 * Create the panel.
	 */
	public ProyectoNuevo() {
		setLayout(null);
    	setBackground(new Color(51, 153, 204));
    	setBounds(173, 11, 501, 359);
		
    	txtNombre = new JTextField();
    	txtNombre.setBounds(29, 85, 383, 20);
    	add(txtNombre);
    	txtNombre.setColumns(10);
    	
    	JLabel lblNombre = new JLabel("Nombre del proyecto");
    	lblNombre.setBounds(29, 60, 146, 20);
    	add(lblNombre);
    	
    	JLabel lblID = new JLabel("ID del proyecto");
    	lblID.setBounds(29, 127, 146, 20);
    	add(lblID);
    	
    	txtID = new JTextField();
    	txtID.setColumns(10);
    	txtID.setBounds(29, 151, 162, 20);
    	add(txtID);
    	
    	btnGuardar = new JButton("GUARDAR");
    	btnGuardar.setBounds(198, 296, 89, 23);
    	add(btnGuardar);
    	
    	lblTitle = new JLabel("Introduce los datos del nuevo proyecto");
    	lblTitle.setBounds(142, 23, 294, 14);
    	add(lblTitle);
    	
    	lblHoras = new JLabel("Horas realizadas");
    	lblHoras.setBounds(29, 193, 146, 20);
    	add(lblHoras);
    	
    	textField = new JTextField();
    	textField.setColumns(10);
    	textField.setBounds(29, 217, 162, 20);
    	add(textField);
	}

}
