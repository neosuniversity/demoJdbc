package com.neosuniversity.ui;

import com.neosuniversity.dominio.Proveedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtMail;

    @FXML
    public void guardarAction(ActionEvent evt) {
        System.out.println("guardar");

        Integer id = Integer.parseInt(this.txtId.getText()); //try -cath validar
        Proveedor proveedor = new Proveedor(id, this.txtNombre.getText());
        proveedor.setDireccion(this.txtDireccion.getText());
        proveedor.setTelefono(this.txtTelefono.getText());
        proveedor.setEmail(this.txtMail.getText());

        System.out.println(proveedor);

        // DAOProveer dao = new DAOProveedor();
        // dao.guarda(id, nombre, telefono, direccion); ->NOO


    }

}
