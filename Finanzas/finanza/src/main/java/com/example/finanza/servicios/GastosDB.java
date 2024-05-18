package com.example.finanza.servicios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.finanza.modelos.Gastos;

public class GastosDB {
    Connection _cn;

    public GastosDB(){
        //_cn  = new Conexion().openDB();
    }

    public List<Gastos> ObtenerGastos(){
        try{
            Statement stnt = _cn.createStatement();
            String query ="SELECT * FROM Gastos";

            List<Gastos> Gasto = new ArrayList<>();
            ResultSet result = stnt.executeQuery(query);
            while(result.next()){
                Gastos Gastons = new Gastos(
                    result.getInt("id_Gasto"),
                    result.getInt("monto"),
                    result.getDate("fecha").toLocalDate(),
                    result.getString("Concepto")

                );

                Gastos.add(Gastons);
            }
            result.close();
            stnt.close();
            return Gasto;
        } catch (Exception E){
            System.out.println("Ocurrio una excepcion");
        }

        return null;
    }
}
