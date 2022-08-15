package com.team5.ud22.mvc.controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JPanel;

import com.team5.ud22.mvc.modelo.Proyecto;
import com.team5.ud22.mvc.modelo.ProyectoDAO;
import com.team5.ud22.mvc.vista.ProyectosVista;

public class ProyectoControlador implements ActionListener{

	private ProyectosVista proyectoVista;
	private ProyectoDAO proyectoDao = new ProyectoDAO();
	
	
	public ProyectoControlador() {		
		proyectoVista = new ProyectosVista();		
				
		afegirListenersBotons();
	}
	
	public void display() {
		proyectoVista.setVisible(true);
	}

	private void afegirListenersBotons() {
		proyectoVista.getBtnBuscar().addActionListener(this);
		proyectoVista.getBtnNuevo().addActionListener(this);
		proyectoVista.getBtnSalir().addActionListener(this);	
		proyectoVista.getBtnListarPs().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		switch(e.getActionCommand()) {
		case "Mostrar todos":		
			
			proyectoVista.getPnlForms().removeAll();			
			proyectoVista.getPnlForms().add(proyectoVista.getTxtListar());
			
			List<Proyecto> ps = proyectoDao.getProyectos();
			String txt = "";
			
			for(int i=0;i<ps.size();i++) {
				txt += ps.get(i).toString();
				proyectoVista.setTxtListar(txt);
			}
			break;
		case "Nuevo":
			changePanelForm(proyectoVista.getPnlNuevo());		
			break;		
		case "Buscar...":
			changePanelForm(proyectoVista.getPnlBuscar());
			break;
		case "Salir":
			proyectoVista.dispose();
			break;		
		}
	}
	
	public void changePanelForm(JPanel panel) {		
		proyectoVista.getPnlForms().removeAll();
		proyectoVista.getPnlForms().repaint();
		proyectoVista.getPnlForms().revalidate();
		
		proyectoVista.getPnlForms().add(panel);		
		proyectoVista.getPnlForms().repaint();
		proyectoVista.getPnlForms().revalidate();		
	}

}

