package com.neosuniversity.ui;

import com.neosuniversity.data.dao.ProveedorDao;
import com.neosuniversity.data.dao.ProveedorDaoImpl;
import com.neosuniversity.dominio.Proveedor;

public class DemoDAO {

    public static void main(String[] args) throws  Exception {

        ProveedorDao dao = new ProveedorDaoImpl();

        Proveedor prov = new Proveedor(6, "Mi Proveedor");
        prov.setDireccion("XYZ direccion");
        prov.setEmail("miprov@dest.com");
        prov.setTelefono("345-34");

        dao.save(prov);


    }
}
