package com.grupo3.reservaPasajes.cliente;

import java.util.Date;

public class Cliente {
	//Clase hecha por Alejandro Villanueva
	private long id;
	private String nombre;
	private String nroDocumento;
	private String tipoDocumento;
	private String nacionalidad;
	private Date fechaNac;
	private String mail;
	private String contraseña;
	
	//constructor vacío
	
	public Cliente(){

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Cliente(long id, String nombre, String nroDocumento, String tipoDocumento, String nacionalidad,
			Date fechaNac, String mail, String contraseña) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nroDocumento = nroDocumento;
		this.tipoDocumento = tipoDocumento;
		this.nacionalidad = nacionalidad;
		this.fechaNac = fechaNac;
		this.mail = mail;
		this.contraseña = contraseña;
	}
	
	

}
