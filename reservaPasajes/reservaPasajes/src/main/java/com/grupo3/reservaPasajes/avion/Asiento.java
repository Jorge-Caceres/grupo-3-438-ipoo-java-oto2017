package com.grupo3.reservaPasajes.avion;

public class Asiento {
	//Clase hecha por Josías Noguera
		private int nro;
		private String tipo;
		
		//constructor vacio
		public Asiento(){
			
			
		}


		public int getNro() {
			return nro;
		}

		public void setNro(int nro) {
			this.nro = nro;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		public Asiento(int nro, String tipo) {
			super();
			this.nro = nro;
			this.tipo = tipo;
		}
		
		
		
}
