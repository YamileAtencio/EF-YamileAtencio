package com.idat.YamileAtencioFinal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalle_reserva")
public class DetalleReserva {
	
	@Id
	private TuristaReservaFK fk =new TuristaReservaFK();

	public TuristaReservaFK getFk() {
		return fk;
	}

	public void setFk(TuristaReservaFK fk) {
		this.fk = fk;
	}


}
