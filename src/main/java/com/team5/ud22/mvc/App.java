package com.team5.ud22.mvc;

import javax.swing.JOptionPane;

import com.team5.ud22.mvc.controlador.ClienteControlador;
import com.team5.ud22.mvc.controlador.Ex3Controlador;
import com.team5.ud22.mvc.controlador.VideoControlador;

public class App {
	
    public static void main(String[] args) {
    	// De moment treballo amb l'ex 3, despres descomentar linia 16
    	String n = "3";
    	do {
    		System.out.println("ERROR");
    		//n = JOptionPane.showInputDialog("Ejercicio [1,2,3] ?");
    	} while(!n.equals("3"));
    	System.out.println("ok");
    	switch(n) {
    	case "1":
    		new ClienteControlador();
    		break;
    	case "2":
    		new ClienteControlador();
    		new VideoControlador();
    		break;
    	case "3":
    		new Ex3Controlador().display();;
    		break;
    	}
    }

}