package com.team5.ud22.mvc.vista.paneles;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

public class ProyectoBuscar extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtID;
	private JButton btnOK;
	private JTextArea txtResultInfo;
   
    public ProyectoBuscar(){
    	setLayout(null);
    	setBackground(new Color(51, 153, 204));
    	setBounds(173, 11, 501, 359);
    	
    	txtNombre = new JTextField();
    	txtNombre.setBounds(28, 81, 162, 20);
    	add(txtNombre);
    	txtNombre.setColumns(10);
    	
    	JLabel lblPorNombre = new JLabel("Nombre del proyecto");
    	lblPorNombre.setBounds(29, 50, 146, 20);
    	add(lblPorNombre);
    	
    	JLabel lblPorID = new JLabel("ID del proyecto");
    	lblPorID.setBounds(29, 136, 146, 20);
    	add(lblPorID);
    	
    	txtID = new JTextField();
    	txtID.setColumns(10);
    	txtID.setBounds(28, 167, 125, 20);
    	add(txtID);
    	
    	btnOK = new JButton("OK");
    	btnOK.setBounds(198, 296, 89, 23);
    	add(btnOK);
    	
    	txtResultInfo = new JTextArea();
    	txtResultInfo.setText("Se actualizara con el \r\nresultado de la busqueda");
    	txtResultInfo.setEditable(false);
    	txtResultInfo.setBounds(233, 24, 243, 241);
    	add(txtResultInfo);
    	    	
    }
    
    public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtID() {
		return txtID;
	}

	public void setTxtID(JTextField txtID) {
		this.txtID = txtID;
	}

	public JButton getBtnOK() {
		return btnOK;
	}

	public void setBtnOK(JButton btnOK) {
		this.btnOK = btnOK;
	}

	public JTextArea getTxtResultInfo() {
		return txtResultInfo;
	}

	public void setTxtResultInfo(JTextArea txtResultInfo) {
		this.txtResultInfo = txtResultInfo;
	}

}