package com.neosuniversity.ui;

import com.neosuniversity.data.dao.ProveedorDao;
import com.neosuniversity.data.dao.ProveedorDaoImpl;
import com.neosuniversity.dominio.Proveedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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

    private ProveedorDao dao = new ProveedorDaoImpl();

    @FXML
    public void guardarAction(ActionEvent evt) {
        System.out.println("guardar");

        Integer id = Integer.parseInt(this.txtId.getText()); //try -cath validar

        Proveedor proveedor = new Proveedor(id, this.txtNombre.getText());
        proveedor.setDireccion(this.txtDireccion.getText());
        proveedor.setTelefono(this.txtTelefono.getText());
        proveedor.setEmail(this.txtMail.getText());

        try {


            dao.save(proveedor);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Exito");
            alert.setHeaderText("Exito");
            alert.setContentText("Se agrego el proveedor correctamente");
            alert.show();


        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error");
            alert.setContentText(e.getMessage());
            alert.show();

            e.printStackTrace();
        }


    }

}
