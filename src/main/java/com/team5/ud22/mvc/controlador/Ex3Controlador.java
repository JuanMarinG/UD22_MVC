package com.team5.ud22.mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import com.team5.ud22.mvc.modelo.Cientifico;
import com.team5.ud22.mvc.modelo.CientificoDAO;
import com.team5.ud22.mvc.vista.CientificoVista;
import com.team5.ud22.mvc.vista.MainVista;
import com.team5.ud22.mvc.vista.ProyectosVista;

public class Ex3Controlador implements ActionListener, KeyListener {

	// VISTAS //
	private CientificoVista cientificoVista;
	private ProyectosVista proyectosVista;
	private MainVista mainVista;

	public Ex3Controlador() {
		mainVista = new MainVista();
		cientificoVista = new CientificoVista();
		proyectosVista = new ProyectosVista();
		mainVista.setVisible(true);
		afegirListenersBotons();
	}

	private void afegirListenersBotons() {
		mainVista.getBtnCientificos().addActionListener(this);
		mainVista.getBtnProyectos().addActionListener(this);
		mainVista.getBtnRelacion().addActionListener(this);
		cientificoVista.getTxtDNI().addKeyListener(this);
		cientificoVista.getBtnBuscar().addActionListener(this);
		cientificoVista.getBtnEliminar().addActionListener(this);
		cientificoVista.getBtnModificar().addActionListener(this);
		cientificoVista.getBtnNuevo().addActionListener(this);
		cientificoVista.getBtnSalir().addActionListener(this);
		cientificoVista.getBtnGuardar().addActionListener(this);
		cientificoVista.getBtnAdd().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		System.out.println(btn.getActionCommand());
		switch (e.getActionCommand()) {
		case "mainBtnProyectos":
			proyectosVista.setVisible(true);
			break;
		case "mainBtnCientificos":
			cientificoVista.setVisible(true);
			break;
		case "mainBtnVer":
			//verVista.setVisible(true);
			JOptionPane.showMessageDialog(null, "No implementado aun");
			break;
		case "cientificoBtnBuscar":
			reset();
			cientificoVista.getTxtDNI().setEditable(true);
			cientificoVista.getTxtDNI().setText("");
			break;
		case "cientificoBtnNuevo":
			reset();
			cientificoVista.getTxtDNI().setEditable(true);
			cientificoVista.getTxtDNI().setText("");
			cientificoVista.getBtnAdd().setVisible(true);
			cientificoVista.getLblNomApels().setVisible(true);
			cientificoVista.getTxtNomApels().setVisible(true);
			cientificoVista.getTxtNomApels().setEditable(true);
			break;
		case "cientificoBtnEliminar":
			CientificoDAO.eliminarCientifico(cientificoVista.getTxtDNI().getText());
			JOptionPane.showMessageDialog(null, "Cientifico eliminado!");
			vaciarCamposTexto();
			break;
		case "cientificoBtnModificar":
			cientificoVista.getBtnGuardar().setVisible(true);
			cientificoVista.getTxtNomApels().setEditable(true);
			break;
		case "cientificoBtnAdd":
			if(cientificoVista.getTxtDNI().getText().trim().equals("") ||
					cientificoVista.getTxtNomApels().getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "Rellena los campos");
				break;
			}
			Cientifico c = CientificoDAO.getCientifico(cientificoVista.getTxtDNI().getText());
			if(c == null) {
				CientificoDAO.insertarCientifico(
					new Cientifico(
						cientificoVista.getTxtDNI().getText(),
						cientificoVista.getTxtNomApels().getText()
					));
				JOptionPane.showMessageDialog(null, "Cientifico anadido correctamente!");
				vaciarCamposTexto();
			} else {
				JOptionPane.showMessageDialog(null, "El cientifico ya existe!");
			}
			break;
		case "cientificoBtnGuardar":
			try {
				CientificoDAO.actualizarCientifico(
					new Cientifico(
						cientificoVista.getTxtDNI().getText(),
						cientificoVista.getTxtNomApels().getText()
					)
				);
				JOptionPane.showMessageDialog(null, "Cientifico actualizado");
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "Ha habido un error");
			}
			break;
		case "cientificoBtnSalir":
			cientificoVista.dispose();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Boton no definido");
		}
	}

	private void vaciarCamposTexto() {
		cientificoVista.getTxtDNI().setText("");
		cientificoVista.getTxtNomApels().setText("");
	}

	private void reset() {
		cientificoVista.getBtnEliminar().setEnabled(false);
		cientificoVista.getBtnModificar().setEnabled(false);
		cientificoVista.getTxtNomApels().setVisible(false);
		cientificoVista.getTxtNomApels().setEditable(false);
		cientificoVista.getLblNomApels().setVisible(false);
		cientificoVista.getTxtDNI().setText("");
		cientificoVista.getTxtNomApels().setText("");
		cientificoVista.getBtnGuardar().setVisible(false);
		cientificoVista.getBtnAdd().setVisible(false);
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
			String dni = cientificoVista.getTxtDNI().getText();
			Cientifico c = CientificoDAO.getCientifico(dni);
			
			if(c != null) {
				cientificoVista.getTxtDNI().setEditable(false);
				cientificoVista.getLblNomApels().setVisible(true);
				cientificoVista.getTxtNomApels().setVisible(true);
				cientificoVista.getTxtNomApels().setText(c.getNomApels());
				cientificoVista.getBtnModificar().setEnabled(true);
				cientificoVista.getBtnEliminar().setEnabled(true);
			} else {
				JOptionPane.showMessageDialog(null,"No se ha encontrado el cientifico");
			}
		}
	}

}
