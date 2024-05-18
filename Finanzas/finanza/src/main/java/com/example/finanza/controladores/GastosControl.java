package com.example.finanza.controladores;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.example.finanza.modelos.Gastos;
import com.example.finanza.servicios.GastosDB;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class GastosControl {
    

    @GetMapping("/Gastos/all")
    public List <Gastos> ObtenerGastos(){
        return new GastosDB().ObtenerGastos();
    }
    
    

}
