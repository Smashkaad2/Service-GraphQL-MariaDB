package com.graphqljava.tutorial.serviceDetailsMDB.service;

import java.util.List;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.EstadoServicio;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Servicio;

public interface IServicioService <T extends Servicio>{
    T crearServicio(T servicio);
    T actualizarServicio(Long id, T servicio);
    void eliminarServicio(Long idServicio);
    T obtenerServiciosPorId(Long idServicio);
    List<T> obtenerServiciosPorEstado(EstadoServicio estado);
    List<T> obtenerServiciosPorNombre(String nombre);
}
