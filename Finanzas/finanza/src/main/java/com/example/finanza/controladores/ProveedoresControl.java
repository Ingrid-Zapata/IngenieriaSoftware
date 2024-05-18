package com.example.finanza.controladores;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.example.finanza.modelos.Proveedores;
import com.example.finanza.servicios.ProveedorDB;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ProveedoresControl {
    
    @GetMapping("/Proveedores/all")
    public List <Proveedores> ObtenerProveedores(){
        return new ProveedorDB().ObtenerProveedores();
    }

}
