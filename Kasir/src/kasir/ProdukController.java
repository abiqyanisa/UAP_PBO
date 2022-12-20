package kasir;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.DoubleProperty;
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

public class ProdukController {
    
    ProdukModel modelproduk = new ProdukModel();

    @FXML
    private Button btnDataProdukkeHalamanUtama;
    @FXML
    private Button btnEditDataProduk;

    @FXML
    private TableColumn<Produk, StringProperty> kolomBarcodeProduk;
    @FXML
    private TableColumn<Produk, DoubleProperty> kolomHargaProduk;
    @FXML
    private TableColumn<Produk, StringProperty> kolomKategoriProduk;
    @FXML
    private TableColumn<Produk, StringProperty> kolomNamaProduk;

    @FXML
    private TableView<Produk> tabelDataProduk;

    /**
     *
     * @param url
     * @param rb
     */
//    public void initialize(URL url, ResourceBundle rb) {
//        modelproduk = new ProdukModel();
//        ShowProduk();
//    }
    
    void ShowProduk(){
        ObservableList<Produk> produk = modelproduk.getProduk();
        
        kolomBarcodeProduk.setCellValueFactory(new PropertyValueFactory<>("barcode"));
        kolomKategoriProduk.setCellValueFactory(new PropertyValueFactory<>("kategori"));
        kolomNamaProduk.setCellValueFactory(new PropertyValueFactory<>("nama_produk"));
        kolomHargaProduk.setCellValueFactory(new PropertyValueFactory<>("harga"));
        
        tabelDataProduk.setItems(null);
        tabelDataProduk.setItems(produk);
    }

     void DataProdukKembaliHalamanUtama(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HalamanUtama.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnDataProdukkeHalamanUtama.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kasir");
    }

    void EditDataProduk(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditProduk.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnEditDataProduk.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Edit Data Produk");
    }
    
}
