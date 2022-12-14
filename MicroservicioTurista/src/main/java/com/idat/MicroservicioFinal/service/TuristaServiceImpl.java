package com.idat.MicroservicioFinal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioFinal.dto.TuristaDTO;
import com.idat.MicroservicioFinal.model.Turista;
import com.idat.MicroservicioFinal.repository.TuristaRepository;


@Service
public class TuristaServiceImpl implements TuristaService {
	
	@Autowired
	private TuristaRepository repository;

	@Override
	public List<TuristaDTO> listar() {
		List<TuristaDTO> listadto = new ArrayList<>();
		TuristaDTO dto = null;
		
		for ( Turista turista : repository.findAll()) {
			dto = new TuristaDTO();
			dto.setDir(turista.getDireccion());;
			dto.setCel(turista.getCelular());
			dto.setNom(turista.getNombreT());
			dto.setCod(turista.getIdTurista());
			listadto.add(dto);
			
		}
		return listadto;
			
	}

	@Override
	public TuristaDTO obtenerId(Integer id) {
		Turista turista = repository.findById(id).orElse(null);
		TuristaDTO dto = new TuristaDTO();
		
		dto.setDir(turista.getDireccion());
		dto.setCel(turista.getCelular());
		dto.setNom(turista.getNombreT());
		dto.setCod(turista.getIdTurista());
		
		return dto;
	}

	@Override
	public void guardar(TuristaDTO turista) {
		Turista turis = new Turista();
		turis.setDireccion(turista.getDir());
		turis.setCelular(turista.getCel());
		turis.setNombreT(turista.getNom());
		turis.setIdTurista(turista.getCod());
			
		repository.save(turis);


	}

}
