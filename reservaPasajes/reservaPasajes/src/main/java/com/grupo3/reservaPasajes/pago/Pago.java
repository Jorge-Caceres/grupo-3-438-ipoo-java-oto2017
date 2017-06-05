package com.grupo3.reservaPasajes.pago;

import java.util.Date;

public class Pago {

	private long id;
	private String nombreTarjeta;
	private String nroTarjeta;
	private String titularTarjeta;
	private Date fechaVencimiento;
	private int codigo;
	
	public Pago(){
		
	}

	public Pago(long id, String nombreTarjeta, String nroTarjeta, String titularTarjeta, Date fechaVencimiento,
			int codigo) {
		super();
		this.id = id;
		this.nombreTarjeta = nombreTarjeta;
		this.nroTarjeta = nroTarjeta;
		this.titularTarjeta = titularTarjeta;
		this.fechaVencimiento = fechaVencimiento;
		this.codigo = codigo;
	}

	public long getId() {
		return id;
	}

	public String getNombreTarjeta() {
		return nombreTarjeta;
	}

	public String getNroTarjeta() {
		return nroTarjeta;
	}

	public String getTitularTarjeta() {
		return titularTarjeta;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNombreTarjeta(String nombreTarjeta) {
		this.nombreTarjeta = nombreTarjeta;
	}

	public void setNroTarjeta(String nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}

	public void setTitularTarjeta(String titularTarjeta) {
		this.titularTarjeta = titularTarjeta;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
