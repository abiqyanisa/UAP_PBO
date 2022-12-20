package kasir;

import database.DBHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PenjualanModel {
    private final Connection CONN;

    public PenjualanModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    public ObservableList<Penjualan> getPenjualan(){
        ObservableList<Penjualan> penjualan = FXCollections.observableArrayList();
        
        try{
            String selectpenjualan = "SELECT * FROM penjualan;";
            ResultSet rs = CONN.createStatement().executeQuery(selectpenjualan);
            while(rs.next()){
                Penjualan p = new Penjualan(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(3), rs.getInt(4));
                penjualan.add(p);
            }
           
        }catch(SQLException e){
            
        }
        return penjualan;
    }
    
}
