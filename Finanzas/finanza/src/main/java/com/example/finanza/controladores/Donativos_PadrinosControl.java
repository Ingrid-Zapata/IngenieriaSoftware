package com.example.finanza.controladores;
import java.util.List;
import com.example.finanza.modelos.Donativos_Padrinos;
import com.example.finanza.servicios.Donativos_PadrinosDB;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Donativos_PadrinosControl {

    @GetMapping("/Donaciones_Padrinos/all")
    public List <Donativos_Padrinos> ObtenerDonativos_Padri() {
        return new Donativos_PadrinosDB().ObtenerDonativos_Padri();
    }
    
    
}
