
package com.dlgluna.reto_5_ciclo2.model.DAO;

import com.dlgluna.reto_5_ciclo2.model.VO.Proyecto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class SegundaConsulta {

    public void segundaConsulta(DefaultTableModel modelo) {
        Proyecto proyecto = new Proyecto();

        String sql = "select Id_Proyecto, Constructora, Numero_Habitaciones, Ciudad "
                + "from Proyecto "
                + "where Clasificacion = 'Casa Campestre' "
                + "and Ciudad in('Santa Marta', 'Cartagena', 'Barranquilla');";

        try {
            Conexion myConexion = new Conexion();
            Connection conex = myConexion.conectar();

            Statement st = conex.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                proyecto.setId_proyecto(rs.getInt(1));
                proyecto.setConstructora(rs.getString(2));
                proyecto.setNumero_habitaciones(rs.getInt(3));
                proyecto.setCiudad(rs.getString(4));

                modelo.addRow(new Object[]{proyecto.getId_proyecto(), proyecto.getConstructora(), proyecto.getNumero_habitaciones(), proyecto.getCiudad()});

            }

            rs.close();
            conex.close();

        } catch (SQLException e) {
             System.out.println( e.getMessage());
        }
    }

}
