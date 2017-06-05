package com.grupo3.reservaPasajes.reserva;

import java.util.Calendar;
import java.util.Date;

import com.grupo3.reservaPasajes.cliente.Cliente;
import com.grupo3.reservaPasajes.pago.LugarCobro;
import com.grupo3.reservaPasajes.pago.Pago;
import com.grupo3.reservaPasajes.pasaje.Pasaje;
import com.grupo3.reservaPasajes.pasaje.PrecioPasaje;
import com.grupo3.reservaPasajes.vuelo.Vuelo;

public class Reserva {
	//Clase hecha por Alejandro Villanueva
	private long id;
	private Date fechaReserva;
	private double importe;
	private String origen;
	private String destino;
	private Date fechaPartida;
	private Date fechaRegreso;
	private Cliente cliente;
	private Vuelo vuelo;
	private Pasaje pasaje;
	private PrecioPasaje precioPasaje;
	private Pago pago;
	private LugarCobro lugarCobro;
	
	
	//constructor vacío
	
	public Reserva(){
		
	}


	


	public Reserva(long id, Date fechaReserva, double importe, String origen, String destino, Date fechaPartida,
			Date fechaRegreso, Cliente cliente, Vuelo vuelo, Pasaje pasaje, PrecioPasaje precioPasaje, Pago pago,
			LugarCobro lugarCobro) {
		super();
		this.id = id;
		this.fechaReserva = fechaReserva;
		this.importe = importe;
		this.origen = origen;
		this.destino = destino;
		this.fechaPartida = fechaPartida;
		this.fechaRegreso = fechaRegreso;
		this.cliente = cliente;
		this.vuelo = vuelo;
		this.pasaje = pasaje;
		this.precioPasaje = precioPasaje;
		this.pago = pago;
		this.lugarCobro = lugarCobro;
	}





	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getFechaReserva() {
		return fechaReserva;
	}


	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public Date getFechaPartida() {
		return fechaPartida;
	}


	public void setFechaPartida(Date fechaPartida) {
		this.fechaPartida = fechaPartida;
	}


	public Date getFechaRegreso() {
		return fechaRegreso;
	}


	public void setFechaRegreso(Date fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public Vuelo getVuelo() {
		return vuelo;
	}

	public Pasaje getPasaje() {
		return pasaje;
	}


	public PrecioPasaje getPrecioPasaje() {
		return precioPasaje;
	}


	
	
	public Date getFechaHoraRealizacion(Date fechaHora){
		
		return fechaHora;
		
	}
	
	public Date getFechaHoraPago(Date fechaHora){
		
		return fechaHora;
		
	}

	public Date setfechaHoraExpiracion(Date fechaHExpira){
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(fechaHExpira);
		
		calendar.add(Calendar.DATE, 10);
		
		return calendar.getTime();
	}


	public Pago getPago() {
		return pago;
	}


	public LugarCobro getLugarCobro() {
		return lugarCobro;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}


	public void setPasaje(Pasaje pasaje) {
		this.pasaje = pasaje;
	}


	public void setPrecioPasaje(PrecioPasaje precioPasaje) {
		this.precioPasaje = precioPasaje;
	}


	public void setPago(Pago pago) {
		this.pago = pago;
	}


	public void setLugarCobro(LugarCobro lugarCobro) {
		this.lugarCobro = lugarCobro;
	}
}
