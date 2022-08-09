package com.team5.ud22.mvc.vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import com.team5.ud22.mvc.controlador.ClienteControlador;
import com.team5.ud22.mvc.vista.paneles.PanelTest;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.CardLayout;

@SuppressWarnings("serial")
public class ClienteVista extends JFrame {

	// ATTRIBUTES
	private ClienteControlador controlador; 
	protected static final Container content = null;
	public JButton consultar, insertar, eliminar, modificar;
	public JLabel consulta;
	private JPanel contentPane;
	
	private JPanel panelForms,pClienteNuevo,pClienteModif,pClienteElim,pClienteBuscar;

	// CONSTRUCTOR VISTA

	public ClienteVista() {
		setBounds(150, 150, 800, 375);

		/* Definition of the window */
		setTitle("Cliente"); // PopUp window title
		setBounds(700, 200, 700, 420); // X Y coordinates of the application and its height and length
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Close the window when the operation is close
		
		
		// PANELS
		pClienteNuevo = new PanelTest();
		pClienteModif = new JPanel();
		pClienteElim = new JPanel();
		pClienteBuscar = new JPanel();
		
		pClienteNuevo.setBackground(Color.blue);
		pClienteNuevo.setPreferredSize(new Dimension(300, 40));
		
		pClienteModif.setBackground(Color.yellow);
		pClienteModif.setPreferredSize(new Dimension(300, 40));
		
		pClienteElim.setBackground(Color.BLACK);
		pClienteElim.setPreferredSize(new Dimension(300, 40));
		
		pClienteBuscar.setBackground(Color.GREEN);
		pClienteBuscar.setPreferredSize(new Dimension(300, 40));

		/* Creation and added the panel to the window */
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 204));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(28, 128, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(e -> {			
			panelForms.removeAll();
			panelForms.repaint();
			panelForms.revalidate();
			
			panelForms.add(pClienteNuevo);
			panelForms.repaint();
			panelForms.revalidate();
		});
		

		JButton btnNewButton_2 = new JButton("Modificar");
		btnNewButton_2.setBounds(27, 167, 89, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(e -> {
			panelForms.removeAll();
			panelForms.repaint();
			panelForms.revalidate();
			
			panelForms.add(pClienteModif);
			panelForms.repaint();
			panelForms.revalidate();
		});

		
		JButton btnNewButton_3 = new JButton("Eliminar");
		btnNewButton_3.setBounds(28, 201, 89, 23);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(e -> {
			panelForms.removeAll();
			panelForms.repaint();
			panelForms.revalidate();
			
			panelForms.add(pClienteElim);
			panelForms.repaint();
			panelForms.revalidate();
		});
		
		
		JButton btnNewButton_4 = new JButton("Buscar...");
		btnNewButton_4.setBounds(28, 69, 89, 23);
		contentPane.add(btnNewButton_4);
		btnNewButton_4.addActionListener(e -> {
			panelForms.removeAll();
			panelForms.repaint();
			panelForms.revalidate();
			
			panelForms.add(pClienteBuscar);
			panelForms.repaint();
			panelForms.revalidate();
		});
		
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBounds(28, 347, 89, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		

		JLabel lblNewLabel = new JLabel("CLIENTES");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(34, 11, 83, 23);
		contentPane.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 155, 2);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 115, 155, 2);
		contentPane.add(separator_1);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 333, 155, 2);
		contentPane.add(separator_1_1);

		panelForms = new JPanel();
		panelForms.setBounds(173, 11, 501, 359);
		contentPane.add(panelForms);
		panelForms.setLayout(new CardLayout(0, 0));
		

	}
	
	
	//Metodo para settear el controlador 
	public void setControlador(ClienteControlador controlador) {
		this.controlador = controlador;
	}
	
}