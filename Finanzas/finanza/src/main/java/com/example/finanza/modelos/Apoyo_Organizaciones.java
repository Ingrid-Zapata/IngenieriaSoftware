package com.example.finanza.modelos;
import java.time.LocalDate;
public class Apoyo_Organizaciones {
    private int Id_Apoyo, Monto;
    private LocalDate Fecha;
    private String Organizacion;
    
    public Apoyo_Organizaciones() {
    }
    public Apoyo_Organizaciones(int id_Apoyo, int monto, LocalDate fecha, String organizacion) {
        this.Id_Apoyo = id_Apoyo;
        this.Monto = monto;
        this.Fecha = LocalDate.now();
        this.Organizacion = organizacion;
    }

    public int getId_Apoyo() {
        return Id_Apoyo;
    }
    public void setId_Apoyo(int id_Apoyo) {
        Id_Apoyo = id_Apoyo;
    }

    public int getMonto() {
        return Monto;
    }
    public void setMonto(int monto) {
        Monto = monto;
    }

    public LocalDate getFecha() {
        return Fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.Fecha = fecha;
    }

    public String getOrganizacion() {
        return Organizacion;
    }
    public void setOrganizacion(String organizacion) {
        Organizacion = organizacion;
    }    
}


