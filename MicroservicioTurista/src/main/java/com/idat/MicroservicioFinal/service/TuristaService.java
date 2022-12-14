package com.idat.MicroservicioFinal.service;

import java.util.List;

import com.idat.MicroservicioFinal.dto.TuristaDTO;

public interface TuristaService {
	
	List<TuristaDTO> listar();
	TuristaDTO obtenerId(Integer id);
	void guardar(TuristaDTO turista);

}
