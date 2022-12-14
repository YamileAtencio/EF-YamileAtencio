package com.idat.YamileAtencioFinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hospedajes")
public class Hospedaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHospedaje;
	private String nombre;
	public Integer getIdHospedaje() {
		return idHospedaje;
	}
	public void setIdHospedaje(Integer idHospedaje) {
		this.idHospedaje = idHospedaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
