package com.graphqljava.tutorial.serviceDetailsMDB.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.EstadoServicio;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.TipoTransporte;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.Transporte;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.TransporteRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final TransporteRepository transporteRepository;

    public DataInitializer(TransporteRepository transporteRepository) {
        this.transporteRepository = transporteRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Crear transportes de prueba
        transporteRepository.deleteAll();

        
        Transporte transporte1 = new Transporte(
            "Transporte Aéreo 1", 
            "Vuelo a Bogotá",
            EstadoServicio.DISPONIBLE,
            TipoTransporte.AEREO,
            "2024-12-01T10:00:00", // Fechas en formato adecuado
            "2024-12-01T14:00:00", 
            150, 
            300.0,
            4.6097, 
            -74.0817,
            4.7110, 
            -74.0721
        );
        
        Transporte transporte2 = new Transporte(
            "Transporte Aéreo 2", 
            "Vuelo a Medellín",
            EstadoServicio.DISPONIBLE,
            TipoTransporte.AEREO,
            "2024-12-05T12:00:00", 
            "2024-12-05T16:00:00",
            180, 
            350.0,
            4.6097, 
            -74.0817,
            6.2518, 
            -75.5636
        );
        
        Transporte transporte3 = new Transporte(
            "Transporte Terrestre 1", 
            "Autobús a Cali",
            EstadoServicio.DISPONIBLE,
            TipoTransporte.TERRESTRE,
            "2024-12-10T08:00:00", 
            "2024-12-10T18:00:00",
            50, 
            100.0,
            3.4516, 
            -76.5312,
            3.4516, 
            -76.5312
        );

        // Guardar los transportes en la base de datos
        transporteRepository.save(transporte1);
        transporteRepository.save(transporte2);
        transporteRepository.save(transporte3);
    }
}


