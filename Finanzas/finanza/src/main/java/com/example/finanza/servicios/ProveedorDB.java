package com.example.finanza.servicios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.finanza.modelos.Proveedores;
public class ProveedorDB {
    Connection _cn;

    public ProveedorDB(){
        //_cn  = new Conexion().openDB();
    }

    public List<Proveedores> ObtenerProveedores(){
        try{
            Statement stnt = _cn.createStatement();
            String query ="SELECT * FROM Proveedores";

            List<Proveedores> Proveedore = new ArrayList<>();
            ResultSet result = stnt.executeQuery(query);
            while(result.next()){
                Proveedores Provedorens = new Proveedores(
                    result.getInt("id_Proveedor"),
                    result.getInt("monto"),
                    result.getDate("fecha").toLocalDate(),
                    result.getString("nombre"),
                    result.getString("contacto"),
                    result.getString("tipo")

                );

                Proveedores.add(Provedorens);
            }
            result.close();
            stnt.close();
            return Proveedore;
        } catch (Exception E){
            System.out.println("Ocurrio una excepcion");
        }

        return null;
    }
}
