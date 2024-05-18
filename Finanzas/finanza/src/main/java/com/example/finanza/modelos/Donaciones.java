package com.example.finanza.modelos;
import java.time.LocalDate;

public class Donaciones {
    private int Id_Donacion, Monto;
    private LocalDate Fecha;
    private String Origen, Destino;
    
    public Donaciones() {
    }

    public Donaciones(int id_Donacion, int monto, LocalDate fecha, String origen, String destino) {
        Id_Donacion = id_Donacion;
        Monto = monto;
        Fecha = fecha;
        Origen = origen;
        Destino = destino;
    }

    public int getId_Donacion() {
        return Id_Donacion;
    }

    public void setId_Donacion(int id_Donacion) {
        Id_Donacion = id_Donacion;
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
        Fecha = fecha;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public static void add(Donaciones donacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }


    
}

