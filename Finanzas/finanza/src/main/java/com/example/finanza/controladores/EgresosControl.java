package com.example.finanza.controladores;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.example.finanza.modelos.Egresos;
import com.example.finanza.servicios.EgresosDB;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class EgresosControl {

    @GetMapping("/Egresos/all")
    public List <Egresos> ObtenerEgresos(){
        return new EgresosDB().ObtenerEgresos();
    }
}

