
package com.dlgluna.reto_5_ciclo2.model.DAO;

import com.dlgluna.reto_5_ciclo2.model.VO.Compra;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class TerceraConsulta {

    public void tercerConsulta(DefaultTableModel modelo) {
        Compra compra = new Compra();

        String sql = "select c.ID_Compra, p.Constructora, p.Banco_vinculado "
                + "from Compra c "
                + "join Proyecto p on(c.ID_Proyecto = p.ID_Proyecto) "
                + "where c.Proveedor = 'Homecenter' "
                + "and p.Ciudad = 'Salento';";

        try {
            Conexion myConexion = new Conexion();
            Connection conex = myConexion.conectar();

            Statement st = conex.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                compra.setId_compra(rs.getInt(1));
                compra.setConstructora(rs.getString(2));
                compra.setBanco_vinculado(rs.getString(3));

                modelo.addRow(new Object[]{compra.getId_compra(), compra.getConstructora(), compra.getBanco_vinculado()});

            }

            rs.close();
            conex.close();

        } catch (SQLException e) {
             System.out.println( e.getMessage());
        }
    }

}
