package com.idat.YamileAtencioFinal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.YamileAtencioFinal.dto.HospedajeDTO;
import com.idat.YamileAtencioFinal.model.Hospedaje;
import com.idat.YamileAtencioFinal.repository.HospedajeRepository;

@Service
public class HospedajeServiceImpl implements HospedajeService {
	
	@Autowired
	private HospedajeRepository repository;

	@Override
	public List<HospedajeDTO> listar() {
		List<HospedajeDTO> listadto = new ArrayList<>();
		HospedajeDTO dto = null;
		
		for ( Hospedaje hospedaje : repository.findAll()) {
			dto = new HospedajeDTO();
			dto.setNom(hospedaje.getNombre());
			dto.setCod(hospedaje.getIdHospedaje());
			listadto.add(dto);
			
		}
		return listadto;
	}

	@Override
	public HospedajeDTO obtenerId(Integer id) {
		
		Hospedaje hospedaje = repository.findById(id).orElse(null);
		HospedajeDTO dto = new HospedajeDTO();
		
		dto.setNom(hospedaje.getNombre());
		dto.setCod(hospedaje.getIdHospedaje());
		
		return dto;

	}

	@Override
	public void guardar(HospedajeDTO hospedaje) {
		Hospedaje hos = new Hospedaje();
		hos.setNombre(hospedaje.getNom());
		hos.setIdHospedaje(hospedaje.getCod());
			
		repository.save(hos);

	}

}
