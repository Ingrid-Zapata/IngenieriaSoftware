package com.example.finanza.modelos;

public class Egresos {
    private int Id_Egreso, Id_Gato, Id_Proveedor, Monto;
    private String Origen;
    
    
    public Egresos() {
    }


    public Egresos(int id_Egreso, int id_Gato, int id_Proveedor, int monto, String origen) {
        Id_Egreso = id_Egreso;
        Id_Gato = id_Gato;
        Id_Proveedor = id_Proveedor;
        Monto = monto;
        Origen = origen;
    }


    public int getId_Egreso() {
        return Id_Egreso;
    }


    public void setId_Egreso(int id_Egreso) {
        Id_Egreso = id_Egreso;
    }


    public int getId_Gato() {
        return Id_Gato;
    }


    public void setId_Gato(int id_Gato) {
        Id_Gato = id_Gato;
    }


    public int getId_Proveedor() {
        return Id_Proveedor;
    }


    public void setId_Proveedor(int id_Proveedor) {
        Id_Proveedor = id_Proveedor;
    }


    public int getMonto() {
        return Monto;
    }


    public void setMonto(int monto) {
        Monto = monto;
    }


    public String getOrigen() {
        return Origen;
    }


    public void setOrigen(String origen) {
        Origen = origen;
    }


    public static void add(Egresos egreson) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    
    
    
}
