package com.team5.ud22.mvc.vista.paneles.cientifico;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CientificoBuscar extends JPanel {
	
	private JTextField txtDni, txtNomApels;
	private JLabel lblDni, lblNomApels ;
   
    public CientificoBuscar(){
    	setLayout(null);
    	setBackground(new Color(51, 153, 204));
    	setBounds(173, 11, 501, 359);
    	
    	JLabel lblTitle = new JLabel("Busca un cientifico");
    	lblTitle.setBounds(29, 18, 160, 14);
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
    	txtNomApels.setEditable(false);
    	add(txtNomApels);
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
	
	

}