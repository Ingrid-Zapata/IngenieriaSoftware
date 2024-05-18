package com.example.finanza.servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.finanza.modelos.Apoyo_Organizaciones;


public class Apoyo_OrganizacionesDB {
    Connection _cn;

    public Apoyo_OrganizacionesDB(){
        //_cn  = new Conexion().openDB();
    }

    public List<Apoyo_Organizaciones> ObtenerApoyo_Organizaciones(){
        try{
            Statement stnt = _cn.createStatement();
            String query ="SELECT * FROM Apoyo_Organizaciones";

            List<Apoyo_Organizaciones> Apoyo_Organizacion = new ArrayList<>();
            ResultSet result = stnt.executeQuery(query);
            while(result.next()){
                Apoyo_Organizaciones Apoyo_Organizaciones = new Apoyo_Organizaciones(
                    result.getInt("id_Apoyo"),
                    result.getInt("monto"),
                    result.getDate("nombreColumna").toLocalDate(),
                    result.getNString("Organizacion")
                );

                Apoyo_Organizacion.add(Apoyo_Organizaciones);
            }
            result.close();
            stnt.close();
            return Apoyo_Organizacion;
        } catch (Exception E){
            System.out.println("Ocurrio una excepcion");
        }

        return null;
    }

}
