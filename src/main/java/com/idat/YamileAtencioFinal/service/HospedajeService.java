package com.idat.YamileAtencioFinal.service;

import java.util.List;

import com.idat.YamileAtencioFinal.dto.HospedajeDTO;

public interface HospedajeService {
	
	List<HospedajeDTO> listar();
	HospedajeDTO obtenerId(Integer id);
	void guardar(HospedajeDTO hospedaje);

}
