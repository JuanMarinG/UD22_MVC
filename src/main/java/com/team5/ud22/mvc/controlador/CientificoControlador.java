package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.team5.ud22.mvc.modelo.Cientifico;
import com.team5.ud22.mvc.modelo.CientificoDAO;
import com.team5.ud22.mvc.vista.CientificoVista;
import com.team5.ud22.mvc.vista.paneles.cientifico.CientificoBuscar;
import com.team5.ud22.mvc.vista.paneles.cientifico.CientificoModificar;

public class CientificoControlador implements ActionListener, KeyListener {
	
	private CientificoVista v;
	private CientificoBuscar panelBuscar;
	private CientificoModificar panelModificar;
	
	public CientificoControlador() {
		// VISTA
		v = new CientificoVista();
		
		// PANELES
		panelBuscar = (CientificoBuscar) v.getPanelBuscar();
		panelModificar = (CientificoModificar) v.getPanelModificar();
		
		setListeners();
		
	}
	
	private void setListeners() {
		v.getBtnBuscar().addActionListener(this);
		v.getBtnEliminar().addActionListener(this);
		v.getBtnModificar().addActionListener(this);
		v.getBtnNuevo().addActionListener(this);
		v.getBtnSalir().addActionListener(this);
		panelBuscar.getTxtDni().addKeyListener(this);
		panelModificar.getBtnAdd().addActionListener(this);
		panelModificar.getBtnGuardar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String dni,nomApels;
		switch (e.getActionCommand()) {
		case "cientificoBtnBuscar": // boton menu izquierda
			panelBuscar.getTxtDni().setEditable(true);
			changePanelForm(panelBuscar);
			break;
		case "cientificoBtnNuevo": // boton menu izquierda
			limpiar();
			changePanelForm(panelModificar);
			panelModificar.getLblTitle().setText("Add cientifico");
			panelModificar.getTxtDni().setEditable(true);
			panelModificar.getBtnAdd().setVisible(true);
			break;
		case "cientificoBtnEliminar": // boton menu izquierda
			CientificoDAO.eliminarCientifico(panelBuscar.getTxtDni().getText());
			JOptionPane.showMessageDialog(null, "Cientifico eliminado!");
			v.getBtnEliminar().setEnabled(false);
			// Despues de eliminar
			limpiar();
			break;
		case "cientificoBtnModificar": // boton menu izquierda
			changePanelForm(panelModificar);
			dni = panelBuscar.getTxtDni().getText();
			panelModificar.getTxtDni().setText(dni);
			panelModificar.getTxtDni().setEditable(false);
			panelModificar.getLblTitle().setText("Modificar cientifico "+dni);
			panelModificar.getBtnGuardar().setVisible(true);
			break;
		case "guardarCientifico": // boton guardar panel modificar cientifico
			dni = panelModificar.getTxtDni().getText();
			nomApels = panelModificar.getTxtNomApels().getText();
			if(!nomApels.trim().equals("")) {
				CientificoDAO.actualizarCientifico(
						new Cientifico(dni,nomApels)
					);
				JOptionPane.showMessageDialog(null, "Cientifico actualizado con exito");
				// Despues de modificar
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Rellena los campos");
			}
			break;
		case "addCientifico": // boton guardar panel modificar cientifico
			dni = panelModificar.getTxtDni().getText();
			nomApels = panelModificar.getTxtNomApels().getText();
			if(dni.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "Falta dni");
				break;
			}
			if(nomApels.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "Falta nombre y apellidos");
			}
			int codigo = CientificoDAO.insertarCientifico(new Cientifico(dni,nomApels));
			if(codigo == 0) {
				JOptionPane.showMessageDialog(null, "Cientifico anadido con exito");
				// Despues de anadir
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Ha habido algun problema");
				panelModificar.getTxtDni().setText("");
				panelModificar.getTxtNomApels().setText("");
			}
			break;
		case "cientificoBtnSalir": // boton menu izquierda
			v.dispose();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Boton no definido");
		}
	}
	
	private void limpiar() {
		v.getBtnEliminar().setEnabled(false);
		v.getBtnModificar().setEnabled(false);
		changePanelForm(panelBuscar);
		panelBuscar.getTxtDni().setText("");
		panelBuscar.getTxtNomApels().setText("");
		panelBuscar.getTxtDni().setEditable(true);
		panelModificar.getTxtDni().setText("");
		panelModificar.getTxtNomApels().setText("");
		panelModificar.getBtnGuardar().setVisible(false);
	}

	public void changePanelForm(JPanel panel) {		
		v.getPanelRaiz().removeAll();
		v.getPanelRaiz().repaint();
		v.getPanelRaiz().revalidate();
		
		v.getPanelRaiz().add(panel);		
		v.getPanelRaiz().repaint();
		v.getPanelRaiz().revalidate();		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			String dni = panelBuscar.getTxtDni().getText();
			Cientifico c = CientificoDAO.getCientifico(dni);
			
			if(c != null) {
				v.getBtnModificar().setEnabled(true);
				v.getBtnEliminar().setEnabled(true);
				panelBuscar.getTxtDni().setEditable(false);
				panelBuscar.getTxtNomApels().setText(c.getNomApels());
			} else {
				JOptionPane.showMessageDialog(null,"No se ha encontrado el cientifico");
				panelBuscar.getTxtDni().setText("");
			}
		}
	}

	public void display() {
		v.setVisible(true);
	}
	
}
