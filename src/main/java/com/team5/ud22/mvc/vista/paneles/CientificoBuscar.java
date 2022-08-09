package com.team5.ud22.mvc.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class CientificoBuscar extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField txtDNI;
	private JButton btnBuscarCientifico;

	public CientificoBuscar(){
    	setBackground(Color.GRAY);
    	setLayout(null);
    	
    	txtDNI = new JTextField();
    	txtDNI.setBounds(167, 86, 86, 20);
    	add(txtDNI);
    	txtDNI.setColumns(10);
    	
    	JLabel lblNewLabel = new JLabel("BUSCAR CIENTÍFICO");
    	lblNewLabel.setBounds(159, 36, 118, 26);
    	add(lblNewLabel);
    	
    	JLabel lblId = new JLabel("DNI:");
    	lblId.setBounds(135, 83, 22, 26);
    	add(lblId);
    	
    	btnBuscarCientifico = new JButton("BUSCAR");
    	btnBuscarCientifico.setBounds(164, 134, 89, 23);
    	add(btnBuscarCientifico);

    }
	
    public JButton getBtnBuscarCientifico() {
		return btnBuscarCientifico;
	}
    
    public String getDni() {
		return txtDNI.getText();
	}
}
