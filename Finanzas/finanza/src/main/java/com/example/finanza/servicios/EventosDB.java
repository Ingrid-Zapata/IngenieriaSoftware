package com.example.finanza.servicios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.finanza.modelos.Eventos;


public class EventosDB {
    Connection _cn;

    public EventosDB(){
        //_cn  = new Conexion().openDB();
    }

    public List<Eventos> ObtenerEventos(){
        try{
            Statement stnt = _cn.createStatement();
            String query ="SELECT * FROM Eventos";

            List<Eventos> Evento = new ArrayList<>();
            ResultSet result = stnt.executeQuery(query);
            while(result.next()){
                Eventos Eventons = new Eventos(
                    result.getInt("id_Evento"),
                    result.getInt("monto"),
                    result.getDate("nombreColumna").toLocalDate(),
                    result.getString("descripcion")

                );

                Eventos.add(Eventons);
            }
            result.close();
            stnt.close();
            return Evento;
        } catch (Exception E){
            System.out.println("Ocurrio una excepcion");
        }

        return null;
    }
}
