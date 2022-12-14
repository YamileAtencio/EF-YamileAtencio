package com.idat.MicroservicioFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MicroservicioFinal.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer>{

}
 