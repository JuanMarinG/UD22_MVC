package com.team5.ud22.mvc.modelo;

public class Cientifico {
	private String dni;
	private String nomApels;
	
	public Cientifico(String dni, String nomApels) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNomApels() {
		return nomApels;
	}
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nomApels=" + nomApels + "]";
	}
}
