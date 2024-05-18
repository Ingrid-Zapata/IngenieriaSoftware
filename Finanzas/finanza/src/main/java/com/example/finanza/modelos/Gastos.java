package com.example.finanza.modelos;
import java.time.LocalDate;

public class Gastos {
    private int Id_Gasto, Monto;
    private LocalDate Fecha;
    private String Concepto;
    
    
    public Gastos() {
    }


    public Gastos(int id_Gasto, int monto, LocalDate fecha, String concepto) {
        Id_Gasto = id_Gasto;
        Monto = monto;
        Fecha = fecha;
        Concepto = concepto;
    }


    public int getId_Gasto() {
        return Id_Gasto;
    }


    public void setId_Gasto(int id_Gasto) {
        Id_Gasto = id_Gasto;
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


    public String getConcepto() {
        return Concepto;
    }


    public void setConcepto(String concepto) {
        Concepto = concepto;
    }


    public static void add(Gastos gastons) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    
}
