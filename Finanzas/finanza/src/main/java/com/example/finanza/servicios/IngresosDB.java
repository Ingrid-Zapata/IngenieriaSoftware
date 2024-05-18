package com.example.finanza.servicios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.finanza.modelos.Ingresos;
public class IngresosDB {
    Connection _cn;

    public IngresosDB(){
        //_cn  = new Conexion().openDB();
    }

    public List<Ingresos> ObtenerIngresos(){
        try{
            Statement stnt = _cn.createStatement();
            String query ="SELECT * FROM Ingresos";

            List<Ingresos> Ingreso = new ArrayList<>();
            ResultSet result = stnt.executeQuery(query);
            while(result.next()){
                Ingresos Ingresons = new Ingresos(
                    result.getInt("id_Ingreso"),
                    result.getInt("id_Apoyo"),
                    result.getInt("id_Donacion"),
                    result.getInt("id_DonativoPadrino"),
                    result.getInt("id_Evento"),
                    result.getInt("id_recaudacion"),
                    result.getInt("monto"),
                    result.getString("origen")

                );

                Ingresos.add(Ingresons);
            }
            result.close();
            stnt.close();
            return Ingreso;
        } catch (Exception E){
            System.out.println("Ocurrio una excepcion");
        }

        return null;
    }
}
