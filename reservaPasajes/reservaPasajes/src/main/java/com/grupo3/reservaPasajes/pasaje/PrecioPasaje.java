package com.grupo3.reservaPasajes.pasaje;


import java.util.Date;

public class PrecioPasaje {
//Clase hecha por: Alejandro Villanueva
	private long id;
	private Date fechaPrecio;
	private double precio;
	
	//contructor vacío
	public PrecioPasaje(){
		
	}

	public PrecioPasaje(long id, Date fechaPrecio, double precio) {
		super();
		this.id = id;
		this.fechaPrecio = fechaPrecio;
		this.precio = precio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFechaPrecio() {
		return fechaPrecio;
	}

	public void setFechaPrecio(Date fechaPrecio) {
		this.fechaPrecio = fechaPrecio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	
}
