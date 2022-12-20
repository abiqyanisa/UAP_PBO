package kasir;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HalamanUtamaController implements Initializable{

    @FXML
    private Button btnPenjualan;

    @FXML
    private Button btnProduk;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    void openProduk(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Produk.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnProduk.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Data Produk");
    }
    
    @FXML
    void openPenjualan(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Penjualan.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnPenjualan.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Data Penjualan");
    }

    

}
