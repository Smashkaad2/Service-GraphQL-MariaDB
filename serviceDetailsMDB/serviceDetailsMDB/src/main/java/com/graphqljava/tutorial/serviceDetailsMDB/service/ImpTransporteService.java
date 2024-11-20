package com.graphqljava.tutorial.serviceDetailsMDB.service;

import org.springframework.stereotype.Service;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Transporte;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.TransporteRepository;



@Service
public class ImpTransporteService extends ImpServicioService<Transporte> implements ITransporteService{
    
    public ImpTransporteService(TransporteRepository transporteRepository) {
        super(transporteRepository);
    }
    
}