package com.neosuniversity.ui;

import com.neosuniversity.data.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc {

    public static void main(String[] args) {

       Connection  connection=  ConnectionFactory.getConnection();

        try {


            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("select id, nombre from proveedor");

            while(rs.next()){

              //  Integer id = rs.getInt(1)
                Integer id = rs.getInt("id");
                String nombre = rs.getString("nombre");

                System.out.println("ID: " + id + ", Nombre: " + nombre
                );

            }



        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(connection);
    }
}
