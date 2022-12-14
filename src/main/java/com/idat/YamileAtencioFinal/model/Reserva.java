package com.idat.YamileAtencioFinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservas")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReserva;
	private String costo;
	public Integer getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	
	

}
