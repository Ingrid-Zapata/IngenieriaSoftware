package com.example.finanza.modelos;

public class Ingresos {
    private int Id_Ingreso, Id_Apoyo, Id_Donacion, Id_DonativoPadrino, Id_Eventos, Id_recaudacion, monto;
    private String Origen;
    public Ingresos() {
    }
    public Ingresos(int id_Ingreso, int id_Apoyo, int id_Donacion, int id_DonativoPadrino, int id_Eventos,
            int id_recaudacion, int monto, String origen) {
        this.Id_Ingreso = id_Ingreso;
        this.Id_Apoyo = id_Apoyo;
        this.Id_Donacion = id_Donacion;
        this.Id_DonativoPadrino = id_DonativoPadrino;
        this.Id_Eventos = id_Eventos;
        this.Id_recaudacion = id_recaudacion;
        this.monto = monto;
        this.Origen = origen;
    }
    public int getId_Ingreso() {
        return Id_Ingreso;
    }
    public void setId_Ingreso(int id_Ingreso) {
        Id_Ingreso = id_Ingreso;
    }
    public int getId_Apoyo() {
        return Id_Apoyo;
    }
    public void setId_Apoyo(int id_Apoyo) {
        Id_Apoyo = id_Apoyo;
    }
    public int getId_Donacion() {
        return Id_Donacion;
    }
    public void setId_Donacion(int id_Donacion) {
        Id_Donacion = id_Donacion;
    }
    public int getId_DonativoPadrino() {
        return Id_DonativoPadrino;
    }
    public void setId_DonativoPadrino(int id_DonativoPadrino) {
        Id_DonativoPadrino = id_DonativoPadrino;
    }
    public int getId_Eventos() {
        return Id_Eventos;
    }
    public void setId_Eventos(int id_Eventos) {
        Id_Eventos = id_Eventos;
    }
    public int getId_recaudacion() {
        return Id_recaudacion;
    }
    public void setId_recaudacion(int id_recaudacion) {
        Id_recaudacion = id_recaudacion;
    }
    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }
    public String getOrigen() {
        return Origen;
    }
    public void setOrigen(String origen) {
        Origen = origen;
    }
    public static void add(Ingresos ingresons) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    
    
}
