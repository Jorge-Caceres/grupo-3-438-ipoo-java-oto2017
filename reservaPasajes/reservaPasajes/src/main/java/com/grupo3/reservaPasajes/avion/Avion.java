package com.grupo3.reservaPasajes.avion;

public class Avion {
	//Clase hecha por Josías Noguera
		private TipoAvion tipodeavion;
		private long id;
		private String nombreAvion;
		private String descripcion;
		private String motor;
		
		//constructor vacio
		public Avion (){
			
		}

		public TipoAvion getTipodeavion() {
			return tipodeavion;
		}

		public void setTipodeavion(TipoAvion tipodeavion) {
			this.tipodeavion = tipodeavion;
		}

		public Avion(TipoAvion tipodeavion) {
			super();
			this.tipodeavion = tipodeavion;
		}

		public long getId() {
			return id;
		}

		public String getNombreAvion() {
			return nombreAvion;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public String getMotor() {
			return motor;
		}

		public void setId(long id) {
			this.id = id;
		}

		public void setNombreAvion(String nombreAvion) {
			this.nombreAvion = nombreAvion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public void setMotor(String motor) {
			this.motor = motor;
		}
		
		
		
		
}
