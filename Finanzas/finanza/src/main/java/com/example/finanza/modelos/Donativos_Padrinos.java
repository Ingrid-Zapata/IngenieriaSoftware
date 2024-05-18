package com.example.finanza.modelos;
import java.time.LocalDate;

public class Donativos_Padrinos {
    private int Id_DonativoPadrino, Monto;
    private LocalDate Fecha;
    private String Tipo;
    
    public Donativos_Padrinos() {
    }

    public Donativos_Padrinos(int id_DonativoPadrino, int monto, LocalDate fecha, String tipo) {
        Id_DonativoPadrino = id_DonativoPadrino;
        Monto = monto;
        Fecha = fecha;
        Tipo = tipo;
    }

    public int getId_DonativoPadrino() {
        return Id_DonativoPadrino;
    }

    public void setId_DonativoPadrino(int id_DonativoPadrino) {
        Id_DonativoPadrino = id_DonativoPadrino;
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

    public static void add(Donativos_Padrinos donativos_Padrin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}
