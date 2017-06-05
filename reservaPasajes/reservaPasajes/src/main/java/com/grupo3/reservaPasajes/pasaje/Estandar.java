package com.grupo3.reservaPasajes.pasaje;

public class Estandar extends Pasaje {
	//Clase hecha por Jorge Cáceres
	private Long id;
	private String descripcion;
	

	public Estandar(){
		
	}
	
	
	Servicio getServicios(Servicio servicio) {
		
		return servicio;
	}


	public long getId() {
		return id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
