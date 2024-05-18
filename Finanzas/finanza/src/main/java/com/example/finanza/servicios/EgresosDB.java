package com.example.finanza.servicios;

import com.example.finanza.modelos.Egresos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EgresosDB {
        Connection _cn;

    public EgresosDB(){
        //_cn  = new Conexion().openDB();
    }

    public List<Egresos> ObtenerEgresos(){
        try{
            Statement stnt = _cn.createStatement();
            String query ="SELECT * FROM Egresos";

            List<Egresos> Egreso = new ArrayList<>();
            ResultSet result = stnt.executeQuery(query);
            while(result.next()){
                Egresos Egreson = new Egresos(
                    result.getInt("id_Egreso"),
                    result.getInt("id_Gasto"),
                    result.getInt("id_Proveedor"),
                    result.getInt("monto"),
                    result.getString("origen")

                );

                Egresos.add(Egreson);
            }
            result.close();
            stnt.close();
            return Egreso;
        } catch (Exception E){
            System.out.println("Ocurrio una excepcion");
        }

        return null;
    }
    
}
