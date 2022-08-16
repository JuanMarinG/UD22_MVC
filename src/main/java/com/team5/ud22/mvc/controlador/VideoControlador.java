package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JPanel;

import com.team5.ud22.mvc.modelo.Video;
import com.team5.ud22.mvc.modelo.VideoDAO;
import com.team5.ud22.mvc.vista.VideoVista;

public class VideoControlador implements ActionListener{
	
	private VideoVista videoVista;
	private VideoDAO videoDao = new VideoDAO();
	
	public VideoControlador() {
		videoVista = new VideoVista();
		ListenersBotons();
	}
	
	public void display() {
		videoVista.setVisible(true);
	}

	private void ListenersBotons() {
		videoVista.getBtnBuscar().addActionListener(this);
		videoVista.getBtnNuevo().addActionListener(this);
		videoVista.getBtnSalir().addActionListener(this);
		videoVista.getBtnListarVs().addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent e) {		
		switch(e.getActionCommand()) {
		case "Mostrar todos":			
			videoVista.getPnlForms().removeAll();			
			videoVista.getPnlForms().add(videoVista.getTxtListar());
			videoVista.getPnlForms().repaint();
			
			List<Video> vs = videoDao.getVideos();
			String txt = "";
			
			for(int i=0;i<vs.size();i++) {
				txt += vs.get(i).toString();
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
