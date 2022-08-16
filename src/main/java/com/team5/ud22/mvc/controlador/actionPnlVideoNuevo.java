package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import com.team5.ud22.mvc.modelo.Video;
import com.team5.ud22.mvc.modelo.VideoDAO;
import com.team5.ud22.mvc.vista.paneles.VideoNuevo;

public class actionPnlVideoNuevo implements ActionListener{
	
	VideoDAO videoDao = new VideoDAO();
	VideoNuevo videoNuevo;
	
	//le decimos que actue sobre el panel VideoNuevo que se esta mostrando
	public actionPnlVideoNuevo(VideoNuevo videoNuevo) {
		this.videoNuevo = videoNuevo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "GUARDAR") {
			boolean exists = false;
			
			List<Video> vs = videoDao.getVideos();
			//da error al guardar - TxtDirector ???
			Video v = new Video(videoNuevo.getTxtID(),videoNuevo.getTxtTitle(),videoNuevo.getTxtDirector(),Integer.parseInt(videoNuevo.getTxtCliID()));
	
			for(int i=0;i<vs.size();i++) {
				if(vs.get(i).getId().equals(v.getId())) {
					JOptionPane.showMessageDialog(null,"El video ya existe!!");					
					exists = true;
				}
			}
			if(!exists) {
				videoDao.insertarVideo(v);
				JOptionPane.showMessageDialog(null,"Video guardado!!");				
			}
			clear();
		}
	}
		
	private void clear() {
		videoNuevo.setTxtCliID("");
		videoNuevo.setTxtDirector("");
		videoNuevo.setTxtID("");
		videoNuevo.setTxtTitle("");
	}
}
