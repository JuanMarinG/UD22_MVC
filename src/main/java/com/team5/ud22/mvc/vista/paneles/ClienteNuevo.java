package com.team5.ud22.mvc.vista.paneles;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class ClienteNuevo extends JPanel {

	private static final long serialVersionUID = 1L;
    private JButton b;
    private JTextField t;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

    public ClienteNuevo(){
    	setBackground(new Color(255, 255, 255));
    	setBounds(173, 11, 501, 359);
        b = new JButton("GUARDAR");
        b.setFont(new Font("Tahoma", Font.BOLD, 11));
        b.setBounds(392, 325, 99, 23);
        t = new JTextField("id");
        t.setBounds(83, 61, 235, 20);
        setLayout(null);
        add(b);
        add(t);
        
        JLabel lblNewLabel = new JLabel("ID:");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setBounds(10, 61, 74, 20);
        add(lblNewLabel);
        
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNombre.setBounds(10, 92, 74, 20);
        add(lblNombre);
        
        JLabel lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblApellidos.setBounds(10, 123, 74, 20);
        add(lblApellidos);
        
        JLabel lblDireccin = new JLabel("Dirección:");
        lblDireccin.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblDireccin.setBounds(10, 154, 74, 20);
        add(lblDireccin);
        
        JLabel lblDni = new JLabel("DNI:");
        lblDni.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblDni.setBounds(10, 185, 74, 20);
        add(lblDni);
        
        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblFecha.setBounds(10, 216, 74, 20);
        add(lblFecha);
        
        textField = new JTextField("");
        textField.setBounds(83, 92, 235, 20);
        add(textField);
        
        textField_1 = new JTextField("");
        textField_1.setBounds(83, 123, 235, 20);
        add(textField_1);
        
        textField_2 = new JTextField("");
        textField_2.setBounds(83, 154, 235, 20);
        add(textField_2);
        
        textField_3 = new JTextField("");
        textField_3.setBounds(83, 185, 235, 20);
        add(textField_3);
        
        textField_4 = new JTextField("");
        textField_4.setBounds(83, 216, 235, 20);
        add(textField_4);
        
        JLabel lblNewLabel_1 = new JLabel("Nuevo Cliente");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1.setBounds(10, 11, 178, 39);
        add(lblNewLabel_1);
        setVisible(true);
    }
}
