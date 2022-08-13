package com.team5.ud22.mvc.vista.paneles.cientifico;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class CientificoModificar extends JPanel {
	
	private JTextField txtDni, txtNomApels;
	private JLabel lblDni, lblNomApels, lblTitle;
	private JButton btnGuardar,btnAdd;
   
    public CientificoModificar(){
    	setLayout(null);
    	setBackground(new Color(51, 153, 204));
    	setBounds(173, 11, 501, 359);
    	
    	lblTitle = new JLabel("");
    	lblTitle.setBounds(29, 18, 180, 14);
    	add(lblTitle);
    	
    	lblDni = new JLabel("DNI");
    	lblDni.setBounds(29, 43, 146, 20);
    	add(lblDni);
    	
    	txtDni = new JTextField();
    	txtDni.setColumns(10);
    	txtDni.setBounds(29, 73, 125, 20);
    	add(txtDni);	    	
    	
    	lblNomApels = new JLabel("Nombre y Apellidos");
    	lblNomApels.setBounds(29, 104, 146, 20);
    	add(lblNomApels);
    	
    	txtNomApels = new JTextField();
    	txtNomApels.setColumns(10);
    	txtNomApels.setBounds(29, 135, 125, 20);
    	add(txtNomApels);
    	
    	btnGuardar = new JButton("GUARDAR");
    	btnGuardar.setBounds(51, 178, 89, 23);
    	btnGuardar.setActionCommand("guardarCientifico");
    	btnGuardar.setVisible(false);
    	add(btnGuardar);
    	
    	btnAdd = new JButton("ADD");
    	btnAdd.setBounds(51, 178, 89, 23);
    	btnAdd.setActionCommand("addCientifico");
    	btnGuardar.setVisible(false);
    	add(btnAdd);
    }
    
	public JTextField getTxtDni() {
		return txtDni;
	}

	public JTextField getTxtNomApels() {
		return txtNomApels;
	}

	public JLabel getLblNomApels() {
		return lblNomApels;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public JLabel getLblTitle() {
		return lblTitle;
	}
	
	

}