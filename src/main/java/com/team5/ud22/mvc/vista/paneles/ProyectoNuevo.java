package com.team5.ud22.mvc.vista.paneles;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.team5.ud22.mvc.controlador.actionProyectoNuevo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProyectoNuevo extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre, txtID, txtHoras;
	private JButton btnGuardar;
	private JLabel lblTitle, lblHoras;
	
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
    	btnGuardar.setBounds(198, 296, 121, 23);
    	add(btnGuardar);
    	btnGuardar.addActionListener(new actionProyectoNuevo(this));
    	
    	lblTitle = new JLabel("Introduce los datos del nuevo proyecto");
    	lblTitle.setBounds(142, 23, 294, 14);
    	add(lblTitle);
    	
    	lblHoras = new JLabel("Horas realizadas");
    	lblHoras.setBounds(29, 193, 146, 20);
    	add(lblHoras);
    	
    	txtHoras = new JTextField();
    	txtHoras.setColumns(10);
    	txtHoras.setBounds(29, 217, 162, 20);
    	add(txtHoras);
	}

	public String getTxtNombre() {
		return txtNombre.getText();
	}

	public void setTxtNombre(String txtNombre) {
		this.txtNombre.setText(txtNombre);;
	}

	public String getTxtID() {
		return txtID.getText();
	}

	public void setTxtID(String txtID) {
		this.txtID.setText(txtID);;
	}

	public int getTxtHoras() {
		return Integer.valueOf(txtHoras.getText());
	}

	public void setTxtHoras(String txtHoras) {
		this.txtHoras.setText(txtHoras);
	}
}
