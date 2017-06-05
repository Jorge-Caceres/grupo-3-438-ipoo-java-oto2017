package com.grupo3.reservaPasajes.pasaje;

import com.grupo3.reservaPasajes.empresa.Empresa;

public abstract class Pasaje {
//Clase hecha por Jorge Cáceres
	private Long id;
	private String nroBoleto;
	private Servicio servicio;
	private Empresa empresa;
	
	public Pasaje(){
		
	}
	
	
	abstract Servicio getServicios(Servicio servicio);


	public long getId() {
		return id;
	}


	public String getNroBoleto() {
		return nroBoleto;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setNroBoleto(String nroBoleto) {
		this.nroBoleto = nroBoleto;
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}


	
	
	
}


