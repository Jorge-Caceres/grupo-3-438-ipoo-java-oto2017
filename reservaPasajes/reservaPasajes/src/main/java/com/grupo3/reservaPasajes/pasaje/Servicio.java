package com.grupo3.reservaPasajes.pasaje;

public class Servicio {
	
	private Long id;
	private String nombre;
	private String descripci�n;
	private Double costo;
	
	public Servicio(){
		
	}
	
	

	public Servicio(Long id, String nombre, String descripci�n, Double costo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripci�n = descripci�n;
		this.costo = costo;
	}



	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripci�n() {
		return descripci�n;
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

	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}
	

}
