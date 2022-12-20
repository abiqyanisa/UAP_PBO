package kasir;

import database.DBHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProdukModel {
    private final Connection CONN;

    public ProdukModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    
    public ObservableList<Produk> getProduk() {
        ObservableList<Produk> produk = FXCollections.observableArrayList();
        
        try { 
            String selectProduk = "SELECT * FROM produk";
            ResultSet rs = CONN.createStatement().executeQuery(selectProduk);
            while(rs.next()){
                Produk p = new Produk(rs.getString(1),rs.getString(2), rs.getString(3), rs.getDouble(4));
                produk.add(p);
            }
        } 
        catch (SQLException ex) {
            
        }
        return produk;
    }
    
}
