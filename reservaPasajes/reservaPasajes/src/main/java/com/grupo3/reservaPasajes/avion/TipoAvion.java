package com.grupo3.reservaPasajes.avion;

import java.util.ArrayList;
import java.util.List;

public class TipoAvion {
	//Clase hecha por Jos�as Noguera
		private double importeMinimoRentable;
		private List<Asiento> asiento;
		private String nombre;
		private String descripcion;
		private int autonomia;
		private int cantidadAsientosEconomico;
		private int cantidadAsientosEjecutivo;
		private int cantidadAsientosEstandar;
		
		
		
		
		public TipoAvion(){
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


		public TipoAvion(double importeMinimoRentable, List<Asiento> asiento) {
			super();
			this.importeMinimoRentable = importeMinimoRentable;
			this.asiento = asiento;
		}


		public String getNombre() {
			return nombre;
		}


		public String getDescripcion() {
			return descripcion;
		}


		public int getAutonomia() {
			return autonomia;
		}


		public int getCantidadAsientosEconomico() {
			return cantidadAsientosEconomico;
		}


		public int getCantidadAsientosEjecutivo() {
			return cantidadAsientosEjecutivo;
		}


		public int getCantidadAsientosEstandar() {
			return cantidadAsientosEstandar;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}


		public void setAutonomia(int autonomia) {
			this.autonomia = autonomia;
		}


		public void setCantidadAsientosEconomico(int cantidadAsientosEconomico) {
			this.cantidadAsientosEconomico = cantidadAsientosEconomico;
		}


		public void setCantidadAsientosEjecutivo(int cantidadAsientosEjecutivo) {
			this.cantidadAsientosEjecutivo = cantidadAsientosEjecutivo;
		}


		public void setCantidadAsientosEstandar(int cantidadAsientosEstandar) {
			this.cantidadAsientosEstandar = cantidadAsientosEstandar;
		}

		
		
		
		
		
	
}
