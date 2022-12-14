package com.idat.YamileAtencioFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.YamileAtencioFinal.client.OpenFeignClient;
import com.idat.YamileAtencioFinal.dto.TuristaDTO;
import com.idat.YamileAtencioFinal.model.DetalleReserva;
import com.idat.YamileAtencioFinal.model.Reserva;
import com.idat.YamileAtencioFinal.model.TuristaReservaFK;
import com.idat.YamileAtencioFinal.repository.DetalleReservaRepository;
import com.idat.YamileAtencioFinal.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {
	
	@Autowired
	private ReservaRepository reserRepo;
	
	@Autowired
	private DetalleReservaRepository detalleRepo;  
	
	@Autowired
	private OpenFeignClient client;
	
	@Override
	public void guardarReserva(Reserva reserva) {
		reserRepo.save(reserva);

	}

	@Override
	public void asignarTuristaReserva() {
		
		List<TuristaDTO> listado = client.listarTurista();
		TuristaReservaFK fk = null;
		DetalleReserva detalle = null;

		
		for (TuristaDTO turistaDTO : listado) {
			
			fk = new TuristaReservaFK();
			fk.setIdReserva(turistaDTO.getCod());
			fk.setIdTurista(1);
			
			detalle = new DetalleReserva();
			detalle.setFk(fk);	
			
			detalleRepo.save(detalle);
		}

	}

	}

