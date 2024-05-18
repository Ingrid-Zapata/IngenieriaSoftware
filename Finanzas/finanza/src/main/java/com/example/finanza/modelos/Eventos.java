package com.example.finanza.modelos;
import java.time.LocalDate;


public class Eventos {
    private int Id_Evento, Monto;
    private LocalDate Fceha;
    private String Descripcion;
   
   
    public Eventos() {
    }


    public Eventos(int id_Evento, int monto, LocalDate fceha, String descripcion) {
        Id_Evento = id_Evento;
        Monto = monto;
        Fceha = fceha;
        Descripcion = descripcion;
    }


    public int getId_Evento() {
        return Id_Evento;
    }


    public void setId_Evento(int id_Evento) {
        Id_Evento = id_Evento;
    }


    public int getMonto() {
        return Monto;
    }


    public void setMonto(int monto) {
        Monto = monto;
    }


    public LocalDate getFceha() {
        return Fceha;
    }


    public void setFceha(LocalDate fceha) {
        Fceha = fceha;
    }


    public String getDescripcion() {
        return Descripcion;
    }


    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }


    public static void add(Eventos eventons) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    
}
