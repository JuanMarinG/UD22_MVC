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
	ProyectoDAO proyectoDao;
	ProyectosVista proyectoVista;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "Modificar":
			JOptionPane.showMessageDialog(proyectoBuscar, "modificado");
			break;		
		case "Eliminar":
			//ProyectoDAO.eliminarCientifico(proyectoVista.getPnlBuscar().getTxtID());
			JOptionPane.showMessageDialog(proyectoBuscar, "Cientifico eliminado!");
			break;
		case "OK":
			JOptionPane.showMessageDialog(proyectoBuscar, "ok !!");
//			if(proyectoBuscar.getTxtID().getText() !=null) {
//				String id = proyectoBuscar.getTxtID().getText();			
//				Proyecto p = proyectoDao.getProyecto(id);
//				
//				if(p != null) {
//					proyectoBuscar.setTxtNombre(p.getNombre());
//					proyectoBuscar.setTxtHoras(Integer.toString(p.getHoras()));
//				} else {
//					JOptionPane.showMessageDialog(null,"No se ha encontrado el proyecto");
//				}				
//			}
			//controlProyecto.changePanelForm(proyectosVista.getPnlBuscar());
			//Proyecto p = ProyectoDAO.getProyecto(proyectoVista.getPnlBuscar().getTxtID());
			break;		
		}		
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {  // falla en la linea 59, dice que proyectoBuscar es null 
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			String id = proyectoBuscar.getTxtID().getText();			
			Proyecto p = proyectoDao.getProyecto(id);
			
			if(p != null) {
				proyectoBuscar.setTxtNombre(p.getNombre());
				proyectoBuscar.setTxtHoras(Integer.toString(p.getHoras()));
			} else {
				JOptionPane.showMessageDialog(null,"No se ha encontrado el proyecto");
			}
		}
	}

}
