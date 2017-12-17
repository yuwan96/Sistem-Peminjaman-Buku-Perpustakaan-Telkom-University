/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ndaru
 */
public class Anggota {
    private String no,nim,nama; 
    private Date masaBerlaku = new Date();

    public Anggota() {
        this.no = "123";
        this.nim = "1132124555";
        this.nama = "Jono";
        this.masaBerlaku = StringToDate("11/12/2017");
    }

    public Anggota(String no, String nim, String nama, Date masaBerlaku) {
        this.no = no;
        this.nim = nim;
        this.nama = nama;
        this.masaBerlaku = masaBerlaku;
    }

    public void setMasaBerlaku(Date masaBerlaku) {
        this.masaBerlaku = masaBerlaku;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getMasaBerlaku() {
        return masaBerlaku;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNo() {
        return no;
    }
    
    public Date StringToDate(String s){
    Date result = null;
    try{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        result  = dateFormat.parse(s);
    }
    catch(ParseException e){
        e.printStackTrace();
    }
    return result ;
    }
}
