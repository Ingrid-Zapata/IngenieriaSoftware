package com.example.finanza.controladores;

import java.util.List;
import com.example.finanza.modelos.Apoyo_Organizaciones;
import com.example.finanza.servicios.Apoyo_OrganizacionesDB;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apoyo_OrganizacionesControl {
    
    @GetMapping("/Apoyo_Organizaciones/all")
    public List<Apoyo_Organizaciones> ObtenerApoyo_Organizaciones(){
        return new Apoyo_OrganizacionesDB().ObtenerApoyo_Organizaciones();
    }
}
