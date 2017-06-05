package com.grupo3.reservaPasajes.vuelo;

import java.util.Date;

import com.grupo3.reservaPasajes.avion.Avion;

public class Vuelo {

	private long id;
	private Date fechaHora;
	private Avion avion;
	private Ciudad ciudad;
	
	
	public Vuelo(long id, Date fechaHora, Avion avion, Ciudad ciudad) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
		this.avion = avion;
		this.ciudad = ciudad;
	}

	public Vuelo(){
		
	}

	public long getId() {
		return id;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Vuelo(long id, Date fechaHora, Avion avion) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
		this.avion = avion;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
