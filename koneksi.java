/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class koneksi {
    static Connection kon;  
    
    public static Connection connection() {
        if (kon == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("toko");
            data.setUser("root");
            data.setPassword("");
            try {
                kon = data.getConnection();
                System.out.println("Sudah Terkoneksi");
            }catch (Exception e) {
                System.out.println("Belum Terkoneksi");
            }
        }
        return kon;
    }
}
