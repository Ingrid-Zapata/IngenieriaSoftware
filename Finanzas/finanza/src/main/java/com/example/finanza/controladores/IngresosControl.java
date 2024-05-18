package com.example.finanza.controladores;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.example.finanza.modelos.Ingresos;
import com.example.finanza.servicios.IngresosDB;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class IngresosControl {
    
    @GetMapping("/Ingresos/all")
    public List <Ingresos> ObtenerIngresos(){
        return new IngresosDB().ObtenerIngresos();
    }

}
