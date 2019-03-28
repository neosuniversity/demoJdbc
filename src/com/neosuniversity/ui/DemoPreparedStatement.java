package com.neosuniversity.ui;

import com.neosuniversity.data.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoPreparedStatement {

    public static void main(String[] args) {

        Connection conn = ConnectionFactory.getConnection();

        try {


            //PreparedStatement stm = conn.prepareStatement("select id, nombre, direccion " +
            //        " from proveedor  where  nombre = ?");

            //stm.setString(1, "LG Providre");

            PreparedStatement stm = conn.prepareStatement("select id, nombre, direccion " +
                    " from proveedor ");


            ResultSet rs = stm.executeQuery();

            while (rs.next()){

                Integer id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");

                System.out.println("ID: " + id + ", Nombre: " + nombre + ", direccion" + direccion
                );
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


    }
}
