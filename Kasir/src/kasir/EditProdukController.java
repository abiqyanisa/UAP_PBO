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

public class EditProdukController implements Initializable {
    
    @FXML
    private Button btnEditProdukkeDataProduk;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    void EditProdukKembaliDataProduk(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Produk.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnEditProdukkeDataProduk.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Data Produk");
    
    }
    
    
    
    
    
}
