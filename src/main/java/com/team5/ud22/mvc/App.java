package com.team5.ud22.mvc;

import javax.swing.JOptionPane;

import com.team5.ud22.mvc.controlador.Ex1Controlador;
import com.team5.ud22.mvc.controlador.Ex3Controlador;

public class App {
	
    public static void main(String[] args) {
    	boolean repetir = false;
    	// De moment treballo amb el 3, despres descomentar linia 15
    	String n = "3";
    	do {
	    	//n = JOptionPane.showInputDialog("Ejercicio [1,2,3] ?");
	    	switch(n) {
	    	case "1":
	    		new Ex1Controlador();
	    		break;
	    	case "2":
	    		//new Ex2Controlador();
	    		break;
	    	case "3":
	    		new Ex3Controlador();
	    		break;
	    	default:
	    		repetir = true;
	    	}
    	} while(repetir);
    	
    	
    }

}