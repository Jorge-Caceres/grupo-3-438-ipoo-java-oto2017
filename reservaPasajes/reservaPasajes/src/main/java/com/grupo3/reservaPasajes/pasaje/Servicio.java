package com.grupo3.reservaPasajes.pasaje;

public class Servicio {
	
	private Long id;
	private String nombre;
	private String descripcion;
	private Double costo;
	
	public Servicio(){
		
	}
	
	

	public Servicio(Long id, String nombre, String descripcion, Double costo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costo = costo;
	}



	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Double getCosto() {
		return costo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}
	

}
