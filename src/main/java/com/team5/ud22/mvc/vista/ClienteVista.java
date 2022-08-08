package com.team5.ud22.mvc.vista;
import java.awt.*;
public class ClienteVista extends JFrame{
	
//ATTRIBUTES
	
	private JPanel contentPane;
	private JTextField textFieldIdCliente;
	
//CONSTRUCTOR VISTA
	
	public ClienteVista() {
	
	/* Definition of the window */
	setTitle("Cliente"); // PopUp window title
	setBounds(700, 200, 800, 530); // X Y coordinates of the application and its height and length
	setDefaultCloseOperation(EXIT_ON_CLOSE); // Close the window  when the operation is close
	setVisible(true); // It allows the window to be visible
	}
}
