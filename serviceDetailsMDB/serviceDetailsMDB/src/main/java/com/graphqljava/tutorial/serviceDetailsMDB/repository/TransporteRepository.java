package com.graphqljava.tutorial.serviceDetailsMDB.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Transporte;

@Repository
public interface TransporteRepository extends ServicioRepository<Transporte>{
    List<Transporte> findByNombre(String nombre);
}
