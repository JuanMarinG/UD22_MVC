package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import com.team5.ud22.mvc.modelo.Proyecto;
import com.team5.ud22.mvc.modelo.ProyectoDAO;
import com.team5.ud22.mvc.vista.ProyectosVista;
import com.team5.ud22.mvc.vista.paneles.ProyectoBuscar;

public class actionBtnsProyectoBuscar implements ActionListener, KeyListener{
	
	ProyectoBuscar proyectoBuscar;
	ProyectoDAO proyectoDao = new ProyectoDAO();
	
	public actionBtnsProyectoBuscar(ProyectoBuscar proyectoBuscar) {
		this.proyectoBuscar = proyectoBuscar;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "Modificar":
			Proyecto p = proyectoDao.getProyecto(proyectoBuscar.getTxtID().getText());		
			Proyecto p2 = new Proyecto(p.getId(),proyectoBuscar.getTxtNombre().getText(),Integer.valueOf(proyectoBuscar.getTxtHoras().getText()));
			proyectoDao.actualizarProyecto(p2);
			JOptionPane.showMessageDialog(proyectoBuscar, "Proyecto modificado!");
			break;		
		case "Eliminar":
			proyectoDao.eliminarProyecto(proyectoBuscar.getTxtID().getText());
			JOptionPane.showMessageDialog(proyectoBuscar, "Proyecto eliminado!");
			clear();
			break;
		case "OK":
			clear();
			break;		
		}		
	}

	
	@Override
	public void keyPressed(KeyEvent e) {  
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			String id = proyectoBuscar.getTxtID().getText();			
			Proyecto p = proyectoDao.getProyecto(id);
			if(p != null) {
				proyectoBuscar.getTxtHoras().setEnabled(true);
				proyectoBuscar.getTxtNombre().setEnabled(true);
				proyectoBuscar.setTxtNombre(p.getNombre());
				proyectoBuscar.setTxtHoras(Integer.toString(p.getHoras()));	
				proyectoBuscar.getBtnModificar().setEnabled(true);
				proyectoBuscar.getBtnEliminar().setEnabled(true);
				
			} else {
				JOptionPane.showMessageDialog(null,"No se ha encontrado el proyecto");
				clear();
			}
		}
	}

	private void clear() {
		proyectoBuscar.setTxtHoras("");
		proyectoBuscar.setTxtNombre("");
		proyectoBuscar.setTxtID("");
		proyectoBuscar.getTxtHoras().setEnabled(false);
		proyectoBuscar.getTxtNombre().setEnabled(false);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

}
