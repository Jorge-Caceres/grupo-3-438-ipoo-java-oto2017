package com.grupo3.reservaPasajes.pasaje;

public class Servicio {
	
	private Long id;
	private String nombre;
	private String descripción;
	private Double costo;
	
	public Servicio(){
		
	}
	
	

	public Servicio(Long id, String nombre, String descripción, Double costo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripción = descripción;
		this.costo = costo;
	}



	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripción() {
		return descripción;
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

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}
	

}
