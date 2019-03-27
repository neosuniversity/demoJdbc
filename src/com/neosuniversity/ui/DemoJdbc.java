package com.neosuniversity.ui;

import com.neosuniversity.data.ConnectionFactory;

import java.sql.Connection;

public class DemoJdbc {

    public static void main(String[] args) {
       Connection  connection=  ConnectionFactory.getConnection();
        System.out.println(connection);
    }
}
