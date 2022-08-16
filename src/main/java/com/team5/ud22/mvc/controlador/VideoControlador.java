package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JPanel;

import com.team5.ud22.mvc.modelo.Video;
import com.team5.ud22.mvc.modelo.VideoDAO;
import com.team5.ud22.mvc.vista.VideoVista;

public class VideoControlador {
	
	private VideoVista videoVista;
	
	public VideoControlador() {
		videoVista = new VideoVista();
	}
	
	public void display() {
		videoVista.setVisible(true);
	}

	private void ListenersBotons() {
		videoVista.getBtnBuscar().addActionListener(null);
		videoVista.getBtnNuevo().addActionListener(null);
		videoVista.getBtnSalir().addActionListener(null);
		videoVista.getBtnListarPs().addActionListener(null);	
	}
	
	public void actionPerformed(ActionEvent e) {		
		switch(e.getActionCommand()) {
		case "Mostrar videos":		
			
			videoVista.getPnlForms().removeAll();			
			videoVista.getPnlForms().add(videoVista.getTxtListar());
			
			List<Video> ps = VideoDAO.getVideo();
			String txt = "";
			
			for(int i=0;i<ps.size();i++) {
				txt += ps.get(i).toString();
				videoVista.setTxtListar(txt);
			}
			break;
		case "Nuevo":
			changePanelForm(videoVista.getPnlNuevo());		
			break;		
		case "Buscar...":
			changePanelForm(videoVista.getPnlBuscar());
			break;
		case "Salir":
			videoVista.dispose();
			break;		
		}
	}
	
	public void changePanelForm(JPanel panel) {		
		videoVista.getPnlForms().removeAll();
		videoVista.getPnlForms().repaint();
		videoVista.getPnlForms().revalidate();
		
		videoVista.getPnlForms().add(panel);		
		videoVista.getPnlForms().repaint();
		videoVista.getPnlForms().revalidate();		
	}
}
