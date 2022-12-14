package com.team5.ud22.mvc.vista;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import com.team5.ud22.mvc.vista.paneles.VideoBuscar;
import com.team5.ud22.mvc.vista.paneles.VideoNuevo;


public class VideoVista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;	
	private JButton btnNuevo,btnBuscar,btnSalir,btnListarVs;
	private JPanel pnlForms;
	private VideoNuevo pnlNuevo;
	private VideoBuscar pnlBuscar;
	private JTextArea txtListar;
	

	/**
	 * Create the frame.
	 */
	public VideoVista() {
		
		setTitle("Videos");	
		setBounds(300, 200, 700, 420);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		contentPane = new JPanel();		
		contentPane.setBackground(new Color(51, 153, 204));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblTitulo = new JLabel("VIDEOS");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(34, 11, 115, 23);
		contentPane.add(lblTitulo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 155, 2);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 115, 155, 2);
		contentPane.add(separator_1);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 333, 155, 2);
		contentPane.add(separator_1_1);
		
		pnlForms = new JPanel();

		pnlForms.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlForms.setBounds(173, 11, 501, 359);
		pnlForms.setLayout(new CardLayout(0, 0));
		pnlForms.setBackground(new Color(51, 153, 204));
		contentPane.add(pnlForms);
						
		txtListar = new JTextArea();
		txtListar.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtListar.setEditable(false);
		txtListar.setBackground(new Color(51, 153, 204));
		
		pnlNuevo = new VideoNuevo();		
		pnlBuscar = new VideoBuscar();
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 11));

		btnNuevo.setBounds(28, 151, 89, 23);
		contentPane.add(btnNuevo);
		
		btnBuscar = new JButton("Buscar...");
		btnBuscar.setBounds(28, 210, 89, 23);

		contentPane.add(btnBuscar);
				
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(28, 347, 89, 23);
		contentPane.add(btnSalir);

		
		btnListarVs = new JButton("Mostrar todos");
		btnListarVs.setBounds(28, 75, 121, 23);
		contentPane.add(btnListarVs);

	}

	public JButton getBtnNuevo() {
		return btnNuevo;
	}	

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JPanel getPnlForms() {
		return pnlForms;
	}


	public VideoNuevo getPnlNuevo() {
		return pnlNuevo;
	}

	public VideoBuscar getPnlBuscar() {
		return pnlBuscar;
	}
	
	public JButton getBtnListarVs() {
		return btnListarVs;
	}
	
	public JTextArea getTxtListar() {
		return txtListar;
	}

	public void setTxtListar(String txtListar) {
		this.txtListar.setText(txtListar);
	}

}
