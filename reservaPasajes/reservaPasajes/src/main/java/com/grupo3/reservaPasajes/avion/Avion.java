package com.grupo3.reservaPasajes.avion;

public class Avion {
	//Clase hecha por Jos�as Noguera
		private TipoDeAvion tipodeavion;
		
		//constructor vacio
		public Avion (){
			
		}

		public TipoDeAvion getTipodeavion() {
			return tipodeavion;
		}

		public void setTipodeavion(TipoDeAvion tipodeavion) {
			this.tipodeavion = tipodeavion;
		}

		public Avion(TipoDeAvion tipodeavion) {
			super();
			this.tipodeavion = tipodeavion;
		}
		
		
		
		
}
