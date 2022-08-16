package com.team5.ud22.mvc.controlador;

import com.team5.ud22.mvc.vista.VideoVista;

public class VideoControlador {
	
	private VideoVista videoVista;
	
	public VideoControlador() {
		videoVista = new VideoVista();
	}
	
	public void display() {
		videoVista.setVisible(true);
	}

}
