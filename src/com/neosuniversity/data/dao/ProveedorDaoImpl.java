package com.neosuniversity.data.dao;

import com.neosuniversity.data.ConnectionFactory;
import com.neosuniversity.dominio.Proveedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProveedorDaoImpl implements  ProveedorDao {


    @Override
    public void save(Proveedor proveedor) {


        Connection conn = ConnectionFactory.getConnection();

        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement("insert into proveedor  " +
                    "values ( ? ,? ,?, ? ,?)");

            stm.setInt(1,  proveedor.getId());
            stm.setString(2,proveedor.getNombre());
            stm.setString(3, proveedor.getDireccion());
            stm.setString(4, proveedor.getTelefono());
            stm.setString(5, proveedor.getEmail());

            stm.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }






    }
}
