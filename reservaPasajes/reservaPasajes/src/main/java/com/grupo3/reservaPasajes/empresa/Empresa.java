package com.grupo3.reservaPasajes.empresa;

public class Empresa {
      private long id;
      private String nombre;
      
      //constructor vacío
      public Empresa(){
    	  
      }
      
      //constructor con parámetros
      public Empresa(long id, String nombre) {
  		super();
  		this.id = id;
  		this.nombre = nombre;
  	}

	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
     
      
	
}
