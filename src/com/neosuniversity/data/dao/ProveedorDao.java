package com.neosuniversity.data.dao;

import com.neosuniversity.dominio.Proveedor;

import java.util.List;

public interface ProveedorDao {

    void save(Proveedor proveedor) throws Exception;

    List<Proveedor> getAll();

}
