package com.grupo3.reservaPasajes.avion;

import java.util.ArrayList;
import java.util.List;

public class TipoDeAvion {
	//Clase hecha por Josías Noguera
		private double importeMinimoRentable;
		private List<Asiento> asiento;
		
		
		public TipoDeAvion(){
				asiento=new ArrayList<Asiento>();
			
		}


		public double getImporteMinimoRentable() {
			return importeMinimoRentable;
		}


		public void setImporteMinimoRentable(double importeMinimoRentable) {
			this.importeMinimoRentable = importeMinimoRentable;
		}


		public List<Asiento> getAsiento() {
			return asiento;
		}


		public void setAsiento(List<Asiento> asiento) {
			this.asiento = asiento;
		}


		public TipoDeAvion(double importeMinimoRentable, List<Asiento> asiento) {
			super();
			this.importeMinimoRentable = importeMinimoRentable;
			this.asiento = asiento;
		}

		
		
		
		
		
	
}
