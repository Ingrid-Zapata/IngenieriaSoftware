package com.example.finanza.servicios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.finanza.modelos.Recaudacion_Fondos;
public class Recaudacion_FondosDB {
    Connection _cn;

    public Recaudacion_FondosDB(){
        //_cn  = new Conexion().openDB();
    }

    public List<Recaudacion_Fondos> ObtenerRecaudacionFondos(){
        try{
            Statement stnt = _cn.createStatement();
            String query ="SELECT * FROM Recaudacion_Fondos";

            List<Recaudacion_Fondos> Recaudacion_Fondo = new ArrayList<>();
            ResultSet result = stnt.executeQuery(query);
            while(result.next()){
                Recaudacion_Fondos Recaudacion_Fondons = new Recaudacion_Fondos(
                    result.getInt("id_recaudacion"),
                    result.getInt("monto"),
                    result.getDate("fecha").toLocalDate(),
                    result.getString("tipo")

                );

                Recaudacion_Fondos.add(Recaudacion_Fondons);
            }
            result.close();
            stnt.close();
            return Recaudacion_Fondo;
        } catch (Exception E){
            System.out.println("Ocurrio una excepcion");
        }

        return null;
    }
}
