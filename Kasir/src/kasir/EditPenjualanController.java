/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package kasir;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ACER
 */
public class EditPenjualanController implements Initializable {

    @FXML
    private Button btnEditPenjualankeDataPenjualan;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    void showProduk(){
        
    }
    
    @FXML
    void EditPenjualanKembaliDataPenjualan(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Penjualan.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnEditPenjualankeDataPenjualan.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Edit Penjualan");
    }
    
}
