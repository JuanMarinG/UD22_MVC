package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.team5.ud22.mvc.modelo.Cientifico;
import com.team5.ud22.mvc.modelo.CientificoDAO;
import com.team5.ud22.mvc.vista.ProyectosVista;

public class Ex3ControladorProyecto implements ActionListener{

	private ProyectosVista proyectoVista;
	
	public Ex3ControladorProyecto() {		
		proyectoVista = new ProyectosVista();
		proyectoVista.setVisible(true);
		
		afegirListenersBotons();
	}

	private void afegirListenersBotons() {
		proyectoVista.getBtnBuscar().addActionListener(this);
		//proyectoVista.getBtnEliminar().addActionListener(this);
		//proyectoVista.getBtnModificar().addActionListener(this);
		proyectoVista.getBtnNuevo().addActionListener(this);
		proyectoVista.getBtnSalir().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "Nuevo":
			
			break;
		case "Modificar":
			
			break;		
		case "Eliminar":
			ProyectoDAO.eliminarCientifico(proyectoVista.getPnlBuscar().getTxtID());
			JOptionPane.showMessageDialog(null, "Cientifico eliminado!");
			break;
		case "Buscar...":
			Proyecto p = ProyectoDAO.getProyecto(proyectoVista.getPnlBuscar().getTxtID());
			break;
		case "Salir":
			proyectoVista.dispose();
			break;
		default:
			JOptionPane.showMessageDialog(null, "ERROR");
		}
	}
}
