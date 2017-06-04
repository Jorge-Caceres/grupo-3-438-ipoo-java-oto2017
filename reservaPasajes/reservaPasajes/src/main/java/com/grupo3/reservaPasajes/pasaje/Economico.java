package com.grupo3.reservaPasajes.pasaje;

public class Economico extends Pasaje {

	private long id;
	private String descripcion;
	
	public Economico(){
		
		
	}
	
	
	@Override
	Servicio getServicios(Servicio servicio) {
		
		return servicio;
	}


	public long getId() {
		return id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
