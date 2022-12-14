package com.idat.MicroservicioFinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "turistas")
public class Turista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTurista;
	private String nombreT;
	private String celular;
	private String direccion;
	public Integer getIdTurista() {
		return idTurista;
	}
	public void setIdTurista(Integer idTurista) {
		this.idTurista = idTurista;
	}
	public String getNombreT() {
		return nombreT;
	}
	public void setNombreT(String nombreT) {
		this.nombreT = nombreT;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
