package com.team5.ud22.mvc.vista.paneles;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTest extends JPanel {
	private static final long serialVersionUID = 1L;
    private JButton b;
    private JTextField t;

    public PanelTest(){
        b = new JButton("bla");
        t = new JTextField("blaadda");
        add(b);
        add(t);
        setVisible(true);
    }
}
