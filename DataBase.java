/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuwantoro
 */
public class DataBase {
    static Connection conn = null;
    static Statement stat = null;
    private String query;
    
    public void connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Database berhasil tersambung");
        } catch (ClassNotFoundException e) {

            System.out.println("Maaf, database gagal tersambung");
            e.printStackTrace();
        return;
        }
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemperpustakaan", "root", "");
            stat = conn.createStatement();
            if (conn != null) {

                System.out.println("Koneksi database berhasil tersambung, silakan buat database");
            } else {

                System.out.println("Gagal tersambung database");
            }
        } catch (SQLException e) {

            System.out.println("MySQL Connection Failed!");
            e.printStackTrace();
            return;
        }

    }
    public boolean cobaInput(String email, String nama, String ktm) {
        try {
            query = "insert into login(email,nama) values"
                    + "('" + email + "', "
                    + "'" + nama+ "')";
            stat.execute(query);

            query = "insert into anggota(email,nama,ktm) values"
                    + "('" + email + "', "
                    + "'" + nama + "', "
                    + "'" + ktm + "')";

            return stat.execute(query);
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage(), "Server Unconnected", JOptionPane.OK_OPTION);
            e.printStackTrace();
        }
        return false;
    }

    public String cariAkun(String email, String pass) {
        query = "select * from login where email= '" + email + "' and password='" + pass + "'";
        String email1 = null, pass1 = null;
        try {
            ResultSet rs = stat.executeQuery(query);
            if (rs.next()) {
                email1 = rs.getString("email");
                pass1 = rs.getString("password");
   }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        if (!email1.equals("") && !pass1.equals("")) {
     }
        return null;
    }
    
public void inputAnggota(String nama, String email, String ktm) {
        try {
            
            query = "INSERT INTO inputAnggota (nama,email,ktm) values"
                                    + "('" + nama + "', "
                                    + "'" + email + "', "
                                    + "'" + ktm + "', ";
                                    
                                  

                            stat.execute(query);
                            } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage(), "Server Unconnected", JOptionPane.OK_OPTION);
            e.printStackTrace();
        }
    }
public int searchAnggota(String nama, String ktm ) {
        query = "select Anggota from member where nama='" + nama + "' && ktm='" + ktm;
        try {
            ResultSet result = stat.executeQuery(query);
            while (result.next()) {
                return result.getInt("Anggota");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
public void inputAdmin(String username, String password) {
        try {
            
            query = "INSERT INTO inputAdmin(username,password) values"
                                    + "(\'" + username+ "', "
                                    + "'" + password+ "', ";
                                    
                                    
                                  

                            stat.execute(query);
                            } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage(), "Server Unconnected", JOptionPane.OK_OPTION);
            e.printStackTrace();
        }
}
  public void inputDataBuku(String judul, String pengarang, String penerbit, String jumlah) {
        try {
            
            query = "INSERT INTO inputDataBuku(judul,pengarang,penerbit,jumlah) values"
                                    + "'" + judul+ "', "
                                    + "'" + pengarang+ "', "
                                       + "'" + penerbit+ "', "  
                                     + "'" + jumlah+ "', ";
                                    stat.execute(query);
                            } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage(), "Server Unconnected", JOptionPane.OK_OPTION);
            e.printStackTrace();
        }
}
public void inputPetugas(String username, String password) {
        try {
            
            query = "INSERT INTO inputPetugas(username, password) values"
                                    + "'" + username+ "', "
                                    + "'" + password+ "', ";
                                stat.execute(query);
                            } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage(), "Server Unconnected", JOptionPane.OK_OPTION);
            e.printStackTrace();
        }
}
public int searchBuku(String judul, String penerbit ) {
        query = "select Buku from DataBuku where judul='" + judul + "' && penerbit='" + penerbit;
        try {
            ResultSet result = stat.executeQuery(query);
            while (result.next()) {
                return result.getInt("Buku");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
}
}

