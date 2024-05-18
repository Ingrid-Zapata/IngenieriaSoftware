package com.example.finanza.servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.finanza.modelos.Donativos_Padrinos;
public class Donativos_PadrinosDB {
    Connection _cn;

    public Donativos_PadrinosDB(){
        //_cn  = new Conexion().openDB();
    }

    public List<Donativos_Padrinos> ObtenerDonativos_Padri(){
        try{
            Statement stnt = _cn.createStatement();
            String query ="SELECT * FROM Donayivos_Padrinos";

            List<Donativos_Padrinos> Donativos_Padrins = new ArrayList<>();
            ResultSet result = stnt.executeQuery(query);
            while(result.next()){
                Donativos_Padrinos Donativos_Padrin = new Donativos_Padrinos(
                    result.getInt("id_DonativoPadrino"),
                    result.getInt("monto"),
                    result.getDate("nombreColumna").toLocalDate(),
                    result.getString("tipo")

                );

                Donativos_Padrinos.add(Donativos_Padrin);
            }
            result.close();
            stnt.close();
            return Donativos_Padrins;
        } catch (Exception E){
            System.out.println("Ocurrio una excepcion");
        }

        return null;
    }
}
