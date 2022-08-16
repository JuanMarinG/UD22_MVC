package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import com.team5.ud22.mvc.modelo.Video;
import com.team5.ud22.mvc.modelo.VideoDAO;
import com.team5.ud22.mvc.vista.paneles.VideoBuscar;

public class actionPnlVideoBuscar implements ActionListener, KeyListener{

	VideoBuscar videoBuscar;
	VideoDAO videoDao = new VideoDAO();
	
	public actionPnlVideoBuscar(VideoBuscar videoBuscar) {
		this.videoBuscar = videoBuscar;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "Modificar":
			Video v = videoDao.getVideo(videoBuscar.getTxtID().getText());		
			Video v2 = new Video(v.getId(),videoBuscar.getTxtTitle().getText(),videoBuscar.getTxtDirector().getText(),Integer.valueOf(videoBuscar.getTxtCliID().getText()));
			videoDao.actualizarVideo(v2);
			JOptionPane.showMessageDialog(videoBuscar, "Video modificado!");
			break;		
		case "Eliminar":
			videoDao.eliminarVideo(videoBuscar.getTxtID().getText());
			JOptionPane.showMessageDialog(videoBuscar, "Proyecto eliminado!");
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
			String id = videoBuscar.getTxtID().getText();			
			Video v = videoDao.getVideo(id);
			if(v != null) {
				//videoBuscar.getTxtHoras().setEnabled(true);
				//videoBuscar.getTxtNombre().setEnabled(true);
				videoBuscar.setTxtTitle(v.getTitle());
				videoBuscar.setTxtDirector(v.getDirector());
				videoBuscar.setTxtCliID(String.valueOf(v.getCli_id()));	
				videoBuscar.getBtnModificar().setEnabled(true);
				videoBuscar.getBtnEliminar().setEnabled(true);
				
			} else {
				JOptionPane.showMessageDialog(null,"No se ha encontrado el proyecto");
				clear();
			}
		}
	}
	
	private void clear() {
		videoBuscar.setTxtDirector("");
		videoBuscar.setTxtTitle("");
		videoBuscar.setTxtID("");
		videoBuscar.setTxtCliID("");
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

}
