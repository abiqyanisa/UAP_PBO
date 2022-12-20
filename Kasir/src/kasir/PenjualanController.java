package kasir;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class PenjualanController {
    
    PenjualanModel modelpenjualan = new PenjualanModel(); 
    
    @FXML
    private Button btnDataPenjualankeHalamanUtama;
    @FXML
    private Button btnEditPenjualan;

    @FXML
    private TableColumn<Penjualan, DoubleProperty> kolomDiskonPenjualan;
    @FXML
    private TableColumn<Penjualan, IntegerProperty> kolomHargaPenjualan;
    @FXML
    private TableColumn<Penjualan, StringProperty> kolomIdPenjualan;
    @FXML
    private TableColumn<Penjualan, IntegerProperty> kolomKuantitasPenjualan;
    @FXML
    private TableColumn<Penjualan, IntegerProperty> kolomTotalPenjualan;

    @FXML
    private TableView<Penjualan> tabelPenjualan;
    
    void ShowPenjualan(){
        ObservableList<Penjualan> penjualan = modelpenjualan.getPenjualan();
        
        kolomIdPenjualan.setCellValueFactory(new PropertyValueFactory<>("id_penjualan"));
        kolomKuantitasPenjualan.setCellValueFactory(new PropertyValueFactory<>("kuantitas"));
        kolomHargaPenjualan.setCellValueFactory(new PropertyValueFactory<>("harga"));
        kolomDiskonPenjualan.setCellValueFactory(new PropertyValueFactory<>("diskon"));
        kolomTotalPenjualan.setCellValueFactory(new PropertyValueFactory<>("total"));
        
        tabelPenjualan.setItems(null);
        tabelPenjualan.setItems(penjualan);
    }
    
    @FXML
    void DataPenjualanKembaliHalamanUtama(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HalamanUtama.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnDataPenjualankeHalamanUtama.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir");
    }

    @FXML
    void bukaEditDataPenjualan(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditPenjualan.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnEditPenjualan.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir PBO");
    }

    /**
     *
     * @param url
     * @param rb
     */
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        modelpenjualan = new PenjualanModel();
//        ShowPenjualan();
//    }
    
}
