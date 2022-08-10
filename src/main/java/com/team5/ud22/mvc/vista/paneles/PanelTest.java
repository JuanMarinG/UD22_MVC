package com.team5.ud22.mvc.vista.paneles;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;

public class PanelTest extends JPanel {
	private static final long serialVersionUID = 1L;
    private JButton b;
    private JTextField t;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

    public PanelTest(){
    	setBounds(173, 11, 501, 359);
        b = new JButton("GUARDAR");
        b.setFont(new Font("Tahoma", Font.BOLD, 11));
        b.setBounds(392, 325, 99, 23);
        t = new JTextField("id");
        t.setBounds(139, 84, 235, 20);
        setLayout(null);
        add(b);
        add(t);
        
        JLabel lblNewLabel = new JLabel("ID:");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setBounds(55, 84, 74, 20);
        add(lblNewLabel);
        
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNombre.setBounds(55, 112, 74, 20);
        add(lblNombre);
        
        JLabel lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblApellidos.setBounds(55, 143, 74, 20);
        add(lblApellidos);
        
        JLabel lblDireccin = new JLabel("Dirección:");
        lblDireccin.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblDireccin.setBounds(55, 174, 74, 20);
        add(lblDireccin);
        
        JLabel lblDni = new JLabel("DNI:");
        lblDni.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblDni.setBounds(55, 205, 74, 20);
        add(lblDni);
        
        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblFecha.setBounds(55, 236, 74, 20);
        add(lblFecha);
        
        textField = new JTextField("");
        textField.setBounds(139, 112, 235, 20);
        add(textField);
        
        textField_1 = new JTextField("");
        textField_1.setBounds(139, 143, 235, 20);
        add(textField_1);
        
        textField_2 = new JTextField("");
        textField_2.setBounds(139, 174, 235, 20);
        add(textField_2);
        
        textField_3 = new JTextField("");
        textField_3.setBounds(139, 205, 235, 20);
        add(textField_3);
        
        textField_4 = new JTextField("");
        textField_4.setBounds(139, 236, 235, 20);
        add(textField_4);
        
        JLabel lblNewLabel_1 = new JLabel("Nuevo Cliente");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_1.setBounds(55, 21, 178, 39);
        add(lblNewLabel_1);
        setVisible(true);
    }
}
