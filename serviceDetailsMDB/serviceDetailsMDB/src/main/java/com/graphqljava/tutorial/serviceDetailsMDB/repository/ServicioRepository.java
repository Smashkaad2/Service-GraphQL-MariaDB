package com.graphqljava.tutorial.serviceDetailsMDB.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.EstadoServicio;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Servicio;

@NoRepositoryBean
public interface ServicioRepository<T extends Servicio> extends JpaRepository<T, Long> {
    List<T> findByEstado(EstadoServicio estado);
    List<T> findByNombre(String nombre);
}