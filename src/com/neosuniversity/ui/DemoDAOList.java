package com.neosuniversity.ui;

import com.neosuniversity.data.dao.ProveedorDao;
import com.neosuniversity.data.dao.ProveedorDaoImpl;
import com.neosuniversity.dominio.Proveedor;

import java.util.List;

public class DemoDAOList {

    public static void main(String args[]){

        ProveedorDao dao = new ProveedorDaoImpl();
        List<Proveedor> list=  dao.getAll();

        for (Proveedor prov : list) {
            System.out.println(prov);
        }
    }
}
