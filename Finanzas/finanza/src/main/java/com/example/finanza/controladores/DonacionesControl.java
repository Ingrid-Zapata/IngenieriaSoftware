package com.example.finanza.controladores;

import java.util.List;
import com.example.finanza.modelos.Donaciones;
import com.example.finanza.servicios.DonacionesDB;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonacionesControl {
    
    @GetMapping("/Donaciones/all")
    public List <Donaciones> ObtenerDonaciones(){
        return new DonacionesDB().ObtenerDonaciones();
    }
}

