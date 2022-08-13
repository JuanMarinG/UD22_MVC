package com.team5.ud22.mvc.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;

public class CientificoBuscar extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField txtDNI;
	private JButton btnBuscarCientifico;

	public CientificoBuscar(){
    	setBackground(Color.GRAY);
    	setLayout(null);
    	
    	txtDNI = new JTextField();
    	txtDNI.setBounds(42, 78, 126, 20);
    	add(txtDNI);
    	txtDNI.setColumns(10);
    	
    	JLabel lblNewLabel = new JLabel("BUSCAR CIENTÍFICO");
    	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
    	lblNewLabel.setBounds(10, 11, 158, 26);
    	add(lblNewLabel);
    	
    	JLabel lblId = new JLabel("DNI:");
    	lblId.setBounds(10, 75, 22, 26);
    	add(lblId);
    	
    	btnBuscarCientifico = new JButton("BUSCAR");
    	btnBuscarCientifico.setBounds(178, 77, 89, 23);
    	btnBuscarCientifico.setActionCommand("cientificoBtnBuscar");
    	add(btnBuscarCientifico);
    	
    	JTextPane txtpnIntroduceElDni = new JTextPane();
    	txtpnIntroduceElDni.setBorder(null);
    	txtpnIntroduceElDni.setBackground(new Color(255, 255, 255));
    	txtpnIntroduceElDni.setText("Introduce el DNI del cientifico del que quieres hacer la consulta.");
    	txtpnIntroduceElDni.setBounds(10, 44, 369, 20);
    	add(txtpnIntroduceElDni);

    }
	
    public JButton getBtnBuscarCientifico() {
		return btnBuscarCientifico;
	}
    
    public String getDni() {
		return txtDNI.getText();
	}
}
