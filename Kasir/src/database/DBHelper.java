package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DBHelper {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DB = "kasir";
    private static final String MYCONN = "jdbc:mysql://localhost/" + DB;
    
    public static Connection getConnection(){
        
        Connection conn = null;
        
//        try {
//            conn = DriverManager.getConnection(MYCONN, USERNAME, PASSWORD);
//            JOptionPane.showMessageDialog(null, "Koneksi Tersambung");
//            return conn;
//        }
//        catch (SQLException ex) {
//            return null;
//        }

        try { 
            conn = DriverManager.getConnection(MYCONN, USERNAME, PASSWORD);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Koneksi Gagal");
        }
        
        return conn;
              
    }
    

    
}
