package com.example.finanza.modelos;

import java.time.LocalDate;


public class Proveedores {
    private int Id_Proveedor, Monto;
    private LocalDate Fceha;
    private String Nombre, Contacto, Tipo;
    public Proveedores() {
    }
    public Proveedores(int id_Proveedor, int monto, LocalDate fceha, String nombre, String contacto, String tipo) {
        Id_Proveedor = id_Proveedor;
        Monto = monto;
        Fceha = fceha;
        Nombre = nombre;
        Contacto = contacto;
        Tipo = tipo;
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
    public LocalDate getFceha() {
        return Fceha;
    }
    public void setFceha(LocalDate fceha) {
        Fceha = fceha;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getContacto() {
        return Contacto;
    }
    public void setContacto(String contacto) {
        Contacto = contacto;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public static void add(Proveedores provedorens) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    
}
