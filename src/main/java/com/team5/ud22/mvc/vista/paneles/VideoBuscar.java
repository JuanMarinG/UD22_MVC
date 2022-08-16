package com.team5.ud22.mvc.vista.paneles;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.team5.ud22.mvc.controlador.actionPnlVideoBuscar;


public class VideoBuscar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTitle, txtID, txtDirector, txtCliID;

	private JButton btnOK, btnModificar, btnEliminar;
	
	/**
	 * Create the panel.
	 */
	public VideoBuscar() {

		setLayout(null);
    	setBackground(new Color(51, 153, 204));
    	setBounds(173, 11, 501, 359);
    	
    	JLabel lblTitle = new JLabel("Busca un video");
    	lblTitle.setBounds(192, 24, 111, 14);
    	add(lblTitle);
    	
    	JLabel lblPorNombre = new JLabel("Titulo del video");
    	lblPorNombre.setBounds(87, 116, 146, 20);
    	add(lblPorNombre);
    	
    	txtTitle = new JTextField();
    	txtTitle.setEnabled(false);
    	txtTitle.setBounds(207, 116, 247, 20);
    	add(txtTitle);
    	
    	JLabel lblPorID = new JLabel("ID del video");
    	lblPorID.setBounds(87, 72, 146, 20);
    	add(lblPorID);
    	
    	txtID = new JTextField();    	
    	txtID.setDisabledTextColor(Color.LIGHT_GRAY);
    	txtID.setText("Introduce valor y dale ENTER");
    	txtID.setBounds(207, 72, 247, 20);
    	add(txtID);
    	//añadimos el keyPressed a este campo de texto
    	txtID.addKeyListener(new actionPnlVideoBuscar(this)); 
    	
    	JLabel lblCliID = new JLabel("Cliente_ID");
    	lblCliID.setBounds(87, 210, 105, 20);
    	add(lblCliID);
    	
    	txtCliID = new JTextField();
    	txtCliID.setBounds(207, 163, 254, 20);
    	add(txtCliID);

    	
    	JLabel lblDirector = new JLabel("Director");
    	lblDirector.setBounds(87, 163, 99, 20);
    	add(lblDirector);
    	
    	txtDirector = new JTextField();
    	txtDirector.setEnabled(false);
    	txtDirector.setBounds(207, 210, 96, 20);
    	add(txtDirector);
    	txtDirector.setColumns(10);
    	
    	
    	btnOK = new JButton("OK");
    	btnOK.setBounds(79, 296, 89, 23);
    	add(btnOK);
    	btnOK.addActionListener(new actionPnlVideoBuscar(this));

    	btnModificar = new JButton("Modificar");
    	btnModificar.setEnabled(false);
    	btnModificar.setBounds(207, 296, 89, 23);
    	add(btnModificar);
    	btnModificar.addActionListener(new actionPnlVideoBuscar(this));
    	
    	btnEliminar = new JButton("Eliminar");
    	btnEliminar.setEnabled(false);
    	btnEliminar.setBounds(346, 296, 89, 23);
    	add(btnEliminar);
    	btnEliminar.addActionListener(new actionPnlVideoBuscar(this));
    	
	}
	
	public JTextField getTxtCliID() {
		return txtCliID;
	}

	public void setTxtCliID(String txtCliID) {
		this.txtCliID.setText(txtCliID);
	}

	public JTextField getTxtTitle() {
		return txtTitle;
	}

	public void setTxtTitle(String nombre) {
		this.txtTitle.setText(nombre); 
	}

	
	public JTextField getTxtID() {
		return txtID;
	}

	public void setTxtID(String txtID) {
		this.txtID.setText(txtID);

	}

	public JButton getBtnOK() {
		return btnOK;
	}

	public JTextField getTxtDirector() {
		return txtDirector;
	}	

	public void setTxtDirector(String txtDirector) {
		this.txtDirector.setText(txtDirector);
	}
	
	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

}
