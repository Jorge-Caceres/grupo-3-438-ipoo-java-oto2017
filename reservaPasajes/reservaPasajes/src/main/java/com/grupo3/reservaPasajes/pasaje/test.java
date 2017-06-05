package com.grupo3.reservaPasajes.pasaje;

import java.util.Date;

import com.grupo3.reservaPasajes.reserva.Reserva;

public class test {

	
	public static void main(String args[]){
		Reserva r = new Reserva();
		
		System.out.println(""+r.setfechaHoraExpiracion(new Date()));
	}
	
}
