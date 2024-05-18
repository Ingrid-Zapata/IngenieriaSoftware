package com.example.finanza.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection openDB() throws SQLException, ClassNotFoundException {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String conexionUrl = "jdbc:sqlserver://localhost:8080;databaseName=Finanzas;integratedSecurity=true;trustServerCertificate=true";
            con = DriverManager.getConnection(conexionUrl);
        } catch (SQLException e) {
            System.out.println("Error SQL al intentar conectarse a la base de datos: " + e.getMessage());
            throw e;
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo encontrar la clase del controlador JDBC: " + e.getMessage());
            throw e;
        }
        return con;
    }

    public void closeDB(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}

