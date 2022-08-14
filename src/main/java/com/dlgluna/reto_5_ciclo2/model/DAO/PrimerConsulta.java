
package com.dlgluna.reto_5_ciclo2.model.DAO;

import com.dlgluna.reto_5_ciclo2.model.VO.Lider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class PrimerConsulta {

    public void primerConsulta(DefaultTableModel modelo) {
        Lider lider = new Lider();

        String sql = "select ID_lider, Nombre, Primer_Apellido, Ciudad_Residencia "
                + "from Lider "
                + "order by Ciudad_Residencia";

        try {
            Conexion myConexion = new Conexion();
            Connection conex = myConexion.conectar();

            Statement st = conex.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                lider.setId_lider(rs.getInt(1));
                lider.setNombre(rs.getString(2));
                lider.setPrimer_apellido(rs.getString(3));
                lider.setCiudad_residencia(rs.getString(4));

                modelo.addRow(new Object[]{lider.getId_lider(), lider.getNombre(), lider.getPrimer_apellido(), lider.getCiudad_residencia()});

            }

            rs.close();
            conex.close();

        } catch (SQLException e) {
            System.out.println( e.getMessage());
        }
    }

}
