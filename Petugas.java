/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu;

/**
 *
 * @author ndaru
 */
public class Petugas {
    private String id, nama, telp, pass;
    
    public Petugas() {
        this.id = "56789";
        this.nama = "Impal";
        this.telp = "0811333444";
        this.pass = "98765";
    }

    public Petugas(String id, String nama, String telp, String pass) {
        this.id = id;
        this.nama = nama;
        this.telp = telp;
        this.pass = pass;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public boolean petugasLogin(String id, String pass) {
        if (id.equals(this.getId()) && pass.equals(this.getPass())) {
            System.out.println("Login berhasil");
            return true;
        } else {
            System.out.println("Login gagal");
            return false;
        }
    }
}
