package com.grupo3.reservaPasajes.vuelo;

public class Ciudad {

	private long id;
	private String nombre;
	private Pais pais;
	
	public Ciudad(){
		
	}

	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
