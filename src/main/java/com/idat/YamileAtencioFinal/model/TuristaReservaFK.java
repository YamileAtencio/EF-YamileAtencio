package com.idat.YamileAtencioFinal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TuristaReservaFK implements Serializable {
	
	private static final long serialVersionUID = 4417214286334278899L;

	@Column(name="id_turista", nullable = false)
	private Integer idTurista;
	
	@Column(name="id_reserva", nullable = false)
	private Integer idReserva;

	public Integer getIdTurista() {
		return idTurista;
	}

	public void setIdTurista(Integer idTurista) {
		this.idTurista = idTurista;
	}

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}
	
	

}
