package com.example.finanza.controladores;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.example.finanza.modelos.Recaudacion_Fondos;
import com.example.finanza.servicios.Recaudacion_FondosDB;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Recaudacion_FondosControl {
    
    @GetMapping("/RecaudacionFondos/all")
    public List <Recaudacion_Fondos> ObtenerRecaudacionFondos(){
        return new Recaudacion_FondosDB().ObtenerRecaudacionFondos();
    }
  
}
