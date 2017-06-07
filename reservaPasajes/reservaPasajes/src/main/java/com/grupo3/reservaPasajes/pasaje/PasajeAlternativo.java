package com.grupo3.reservaPasajes.pasaje;

public class PasajeAlternativo {

	private long id;
	private Pasaje pasaje;
	
	public PasajeAlternativo(){
		
	}
	
	public Pasaje getPasaje() {
		return pasaje;
	}
	
	private void getid() {
		// TODO Auto-generated method stub

	}
	
	
	public void setPasaje(Pasaje pasaje) {
		this.pasaje = pasaje;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public PasajeAlternativo(long id, Pasaje pasaje){
		this.id = id;
		this.pasaje = pasaje;
	}
	
}
