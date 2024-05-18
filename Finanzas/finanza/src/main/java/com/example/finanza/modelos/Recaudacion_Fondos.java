package com.example.finanza.modelos;
import java.time.LocalDate;

public class Recaudacion_Fondos {
    private int Id_recaudacion,Monto;
    private LocalDate Fecha;
    private String Tipo;
    public Recaudacion_Fondos() {
    }
    public Recaudacion_Fondos(int id_recaudacion, int monto, LocalDate fecha, String tipo) {
        Id_recaudacion = id_recaudacion;
        Monto = monto;
        Fecha = fecha;
        Tipo = tipo;
    }
    public int getId_recaudacion() {
        return Id_recaudacion;
    }
    public void setId_recaudacion(int id_recaudacion) {
        Id_recaudacion = id_recaudacion;
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
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public static void add(Recaudacion_Fondos recaudacion_Fondons) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    
    
}
