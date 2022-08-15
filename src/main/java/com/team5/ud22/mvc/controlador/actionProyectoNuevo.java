package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import com.team5.ud22.mvc.modelo.Proyecto;
import com.team5.ud22.mvc.modelo.ProyectoDAO;
import com.team5.ud22.mvc.vista.paneles.ProyectoNuevo;

public class actionProyectoNuevo implements ActionListener{

	ProyectoDAO proyectoDao = new ProyectoDAO();
	ProyectoNuevo proyectoNuevo;
	
	public actionProyectoNuevo(ProyectoNuevo proyectoNuevo) {
		this.proyectoNuevo = proyectoNuevo;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand() == "GUARDAR") {
			boolean exists = false;
			
			List<Proyecto> ps = proyectoDao.getProyectos();
			Proyecto p = new Proyecto(proyectoNuevo.getTxtID(),proyectoNuevo.getTxtNombre(),proyectoNuevo.getTxtHoras());

			for(int i=0;i<ps.size();i++) {
				if(ps.get(i).getId().equals(p.getId())) {
					JOptionPane.showMessageDialog(null,"El proyecto ya existe!!");					
					exists = true;
				}
			}
			if(!exists) {
				proyectoDao.insertarProyecto(p);
				JOptionPane.showMessageDialog(null,"Proyecto guardado!!");				
			}
			clear();
		}
	}
	
	private void clear() {
		proyectoNuevo.setTxtHoras("");
		proyectoNuevo.setTxtNombre("");
		proyectoNuevo.setTxtID("");
	}

}
