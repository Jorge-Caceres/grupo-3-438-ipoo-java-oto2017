package com.grupo3.reservaPasajes.pago;

public class LugarCobro {
	
	private long id;
	private String nombre;
	private String direccion;
	private String telefono;
	private String horarioAtencion;
	
	public LugarCobro(){
		
	}
	public long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getHorarioAtencion() {
		return horarioAtencion;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}
	public LugarCobro(long id, String nombre, String direccion, String telefono, String horarioAtencion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.horarioAtencion = horarioAtencion;
	}
	
	

}
