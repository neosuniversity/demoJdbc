package com.neosuniversity.ui;

import com.neosuniversity.data.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoInsertSQL {

    public static void main(String[] args) {

        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement stm = con.prepareStatement("insert into proveedor  " +
                    "values ( ? ,? ,?, ? ,?)");


            stm.setInt(1,  5);
            stm.setString(2,"Samsung");
            stm.setString(3, "Mi direccion");
            stm.setString(4, "45-5-4");
            stm.setString(5, "prov@mimail.com");

           int res = stm.executeUpdate();

            System.out.println("Regs insertados " + res);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
