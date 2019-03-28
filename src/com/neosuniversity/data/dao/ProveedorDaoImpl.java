package com.neosuniversity.data.dao;

import com.neosuniversity.data.ConnectionFactory;
import com.neosuniversity.dominio.Proveedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDaoImpl implements  ProveedorDao {


    @Override
    public void save(Proveedor proveedor) throws Exception {


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

            throw new Exception(e);
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

    @Override
    public List<Proveedor> getAll() {
        Connection conn = ConnectionFactory.getConnection();
        List<Proveedor> list = new ArrayList<>();

        try {
            PreparedStatement stm = conn.prepareStatement("select id, nombre, direccion " +
                    " from proveedor ");

            ResultSet rs = stm.executeQuery();
            while (rs.next()){
                Proveedor proveedor = new Proveedor();

                Integer id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");

                proveedor.setId(id);
                proveedor.setNombre(nombre);
                proveedor.setDireccion(direccion);

                list.add(proveedor);


            }

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
        return list;

    }
}
