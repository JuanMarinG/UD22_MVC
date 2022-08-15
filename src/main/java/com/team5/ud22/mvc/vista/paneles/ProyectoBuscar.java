package com.team5.ud22.mvc.vista.paneles;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.team5.ud22.mvc.controlador.actionBtnsProyectoBuscar;


public class ProyectoBuscar extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre, txtID, txtHoras;

	private JButton btnOK, btnModificar, btnEliminar;
	
    public ProyectoBuscar(){
    	

    	setLayout(null);
    	setBackground(new Color(51, 153, 204));
    	setBounds(173, 11, 501, 359);
    	
    	JLabel lblTitle = new JLabel("Busca un proyecto");
    	lblTitle.setBounds(176, 24, 111, 14);
    	add(lblTitle);
    	
    	txtNombre = new JTextField();
    	txtNombre.setEnabled(false);
    	txtNombre.setBounds(29, 158, 361, 20);
    	add(txtNombre);
    	txtNombre.setColumns(10);
    	
    	JLabel lblPorNombre = new JLabel("Nombre del proyecto");
    	lblPorNombre.setBounds(29, 127, 146, 20);
    	add(lblPorNombre);
    	
    	JLabel lblPorID = new JLabel("ID del proyecto");
    	lblPorID.setBounds(29, 43, 146, 20);
    	add(lblPorID);
    	

    	txtID = new JTextField();    	
    	txtID.setDisabledTextColor(Color.LIGHT_GRAY);
    	txtID.setText("Introduce valor y dale ENTER");
    	txtID.setColumns(10);
    	txtID.setBounds(29, 73, 247, 20);
    	add(txtID);
    	//añadimos el keyPressed a este campo de texto
    	txtID.addKeyListener(new actionBtnsProyectoBuscar(this));    

    	
    	btnOK = new JButton("OK");
    	btnOK.setBounds(79, 296, 89, 23);
    	add(btnOK);

    	btnOK.addActionListener(new actionBtnsProyectoBuscar(this));

    	
    	JLabel lblHoras = new JLabel("Horas de trabajo");
    	lblHoras.setBounds(29, 210, 99, 20);
    	add(lblHoras);
    	
    	txtHoras = new JTextField();
    	txtHoras.setEnabled(false);
    	txtHoras.setBounds(29, 241, 96, 20);
    	add(txtHoras);
    	txtHoras.setColumns(10);
    	

    	btnModificar = new JButton("Modificar");
    	btnModificar.setEnabled(false);
    	btnModificar.setBounds(207, 296, 89, 23);
    	add(btnModificar);
    	btnModificar.addActionListener(new actionBtnsProyectoBuscar(this));
    	
    	btnEliminar = new JButton("Eliminar");
    	btnEliminar.setEnabled(false);
    	btnEliminar.setBounds(346, 296, 89, 23);
    	add(btnEliminar);
    	btnEliminar.addActionListener(new actionBtnsProyectoBuscar(this));

    	    	
    }
    
    public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(String nombre) {
		this.txtNombre.setText(nombre); 
	}

	
	public JTextField getTxtID() {
		return txtID;
	}

	public void setTxtID(String txtID) {
		this.txtID.setText(txtID);

	}

	public JButton getBtnOK() {
		return btnOK;
	}

	public JTextField getTxtHoras() {
		return txtHoras;
	}	

	public void setTxtHoras(String txtHoras) {
		this.txtHoras.setText(txtHoras);
	}
	
	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}
	

}