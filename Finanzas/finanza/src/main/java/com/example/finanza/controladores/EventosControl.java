package com.example.finanza.controladores;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.finanza.modelos.Eventos;
import com.example.finanza.servicios.EventosDB;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class EventosControl {
    
    
    @GetMapping("/Eventos/all")
    public List <Eventos> ObtenerEventos(){
        return new EventosDB().ObtenerEventos();
    }

}
