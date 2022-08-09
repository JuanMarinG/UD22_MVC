package com.team5.ud22.mvc.modelo.util;

import javax.swing.JPanel;

import com.team5.ud22.mvc.vista.ClienteVista;

public class Data {
	
	ClienteVista cVista;
	
	public void changePanelForm(JPanel panel) {		
		cVista.getPanel().removeAll();
		cVista.getPanel().repaint();
		cVista.getPanel().revalidate();
		
		cVista.getPanel().add(panel);
		cVista.getPanel().repaint();
		cVista.getPanel().revalidate();		
	}

}
