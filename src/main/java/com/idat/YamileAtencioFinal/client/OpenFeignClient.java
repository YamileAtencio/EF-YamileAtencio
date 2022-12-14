package com.idat.YamileAtencioFinal.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.YamileAtencioFinal.dto.TuristaDTO;


@FeignClient(name="turista-microservicio", url="localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/api/turista/v1/listar")
	public List<TuristaDTO> listarTurista();

}
