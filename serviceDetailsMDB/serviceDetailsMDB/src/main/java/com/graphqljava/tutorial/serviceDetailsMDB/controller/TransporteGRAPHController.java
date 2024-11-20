package com.graphqljava.tutorial.serviceDetailsMDB.controller;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Transporte;
import com.graphqljava.tutorial.serviceDetailsMDB.service.ITransporteService;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.EstadoServicio;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TransporteGRAPHController {

    private final ITransporteService transporteService;

    public TransporteGRAPHController(ITransporteService transporteService) {
        this.transporteService = transporteService;
    }

    // Consulta: Obtener todos los transportes
    @QueryMapping
    public List<Transporte> obtenerTransportes() {
        return transporteService.obtenerServiciosPorEstado(EstadoServicio.DISPONIBLE); // Puedes ajustarlo según lo que desees filtrar
    }

    // Consulta: Obtener transporte por ID
    @QueryMapping
    public Transporte obtenerTransportePorId(@Argument Long id) {
        return transporteService.obtenerServiciosPorId(id);
    }

    // Consulta: Obtener transportes por nombre
    @QueryMapping
    public List<Transporte> obtenerTransportesPorNombre(@Argument String nombre) {
        return transporteService.obtenerServiciosPorNombre(nombre);
    }

}
