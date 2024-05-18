package com.example.finanza.servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.finanza.modelos.Donaciones;

public class DonacionesDB {
        Connection _cn;

    public DonacionesDB(){
        //_cn  = new Conexion().openDB();
    }

    public List<Donaciones> ObtenerDonaciones(){
        try{
            Statement stnt = _cn.createStatement();
            String query ="SELECT * FROM Donaciones";

            List<Donaciones> Donacion = new ArrayList<>();
            ResultSet result = stnt.executeQuery(query);
            while(result.next()){
                Donaciones Donacions = new Donaciones(
                    result.getInt("id_Donacion"),
                    result.getInt("monto"),
                    result.getDate("nombreColumna").toLocalDate(),
                    result.getString("origen"),
                    result.getString("destino")

                );

                Donaciones.add(Donacions);
            }
            result.close();
            stnt.close();
            return Donacion;
        } catch (Exception E){
            System.out.println("Ocurrio una excepcion");
        }

        return null;
    }
}
