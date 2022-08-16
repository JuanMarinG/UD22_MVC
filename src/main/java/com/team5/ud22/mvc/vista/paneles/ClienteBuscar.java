package com.team5.ud22.mvc.vista.paneles;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class ClienteBuscar extends JPanel {

	private static final long serialVersionUID = 1L;
    private JButton b;
    private JTextField t;
    private JTextField textField;
    private JTextField textField_1;


    public ClienteBuscar(){
    	setLayout(null);
    	setBackground(new Color(255, 255, 255));
    	setBounds(173, 11, 501, 359);
    	
    	JLabel lblNewLabel = new JLabel("DNI:");
    	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
    	lblNewLabel.setBounds(10, 64, 62, 21);
    	add(lblNewLabel);
    	
    	textField_1 = new JTextField();
    	textField_1.setBounds(46, 64, 127, 20);
    	add(textField_1);
    	textField_1.setColumns(10);
    	
    	JButton btnNewButton = new JButton("BUSCAR");
    	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
    	btnNewButton.setBounds(395, 325, 96, 23);
    	add(btnNewButton);
    	
    	JLabel lblNewLabel_1 = new JLabel("Buscar Cliente");
    	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
    	lblNewLabel_1.setBounds(10, 11, 139, 42);
    	add(lblNewLabel_1);
    	
        
       
      
        
    }
}