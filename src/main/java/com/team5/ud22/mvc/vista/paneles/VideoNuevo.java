package com.team5.ud22.mvc.vista.paneles;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.team5.ud22.mvc.controlador.actionPnlVideoNuevo;


public class VideoNuevo extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTitle, txtID, txtDirector, txtCliID;
	private JButton btnGuardar;
	
	/**
	 * Create the panel.
	 */
	public VideoNuevo() {
		
		setLayout(null);
    	setBackground(new Color(51, 153, 204));
    	setBounds(173, 11, 501, 359);
    	
    	JLabel lblTitleVentana = new JLabel("Introduce los datos del nuevo proyecto");
    	lblTitleVentana.setBounds(126, 55, 294, 14);
    	add(lblTitleVentana);
    	
    	JLabel lblTitle = new JLabel("Titulo del video");
    	lblTitle.setBounds(77, 107, 121, 20);
    	add(lblTitle);
    	
    	txtTitle = new JTextField();
    	txtTitle.setBounds(208, 107, 254, 20);
    	add(txtTitle);
    	txtTitle.setColumns(10);
    	
    	JLabel lblID = new JLabel("ID del video");
    	lblID.setBounds(77, 138, 105, 20);
    	add(lblID);
    	
    	txtID = new JTextField();
    	txtID.setBounds(208, 138, 162, 20);
    	add(txtID);
    	
    	JLabel lblDirector = new JLabel("Director");
    	lblDirector.setBounds(77, 169, 121, 20);
    	add(lblDirector);
    	
    	txtDirector = new JTextField();
    	txtDirector.setBounds(208, 200, 162, 20);
    	add(txtDirector);
    	
    	JLabel lblCliID = new JLabel("Cliente_ID");
    	lblCliID.setBounds(77, 200, 105, 20);
    	add(lblCliID);
    	
    	txtCliID = new JTextField();
    	txtCliID.setBounds(208, 169, 254, 20);
    	add(txtCliID);
    	
    	btnGuardar = new JButton("GUARDAR");    	
    	btnGuardar.setBounds(198, 296, 121, 23);
    	add(btnGuardar);
    	btnGuardar.addActionListener(new actionPnlVideoNuevo(this));
    	    	
	}
	
	public String getTxtTitle() {
		return txtTitle.getText();
	}

	public void setTxtTitle(String txtTitle) {
		this.txtTitle.setText(txtTitle);;
	}

	public String getTxtID() {
		return txtID.getText();
	}

	public void setTxtID(String txtID) {
		this.txtID.setText(txtID);;
	}

	public String getTxtDirector() {
		return txtDirector.getText();
	}

	public void setTxtDirector(String txtDirector) {
		this.txtDirector.setText(txtDirector);;
	}

	public String getTxtCliID() {
		return txtCliID.getText();
	}

	public void setTxtCliID(String txtCliID) {
		this.txtCliID.setText(txtCliID);;
	}

}
