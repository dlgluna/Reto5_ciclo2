
package com.dlgluna.reto_5_ciclo2.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class Conexion {
    
    Connection conectar = null;
    
    
    public Connection conectar(){
        try {
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:ProyectosConstruccion.db");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return conectar;
    }
    
}
