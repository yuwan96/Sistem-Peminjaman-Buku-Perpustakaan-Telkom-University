/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu;

import id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu.Petugas;

/**
 *
 * @author ndaru
 */
public class Main {
    public static void main(String []args){
        Petugas petugas = new Petugas();
        petugas.petugasLogin("56789", "98765");
    }
}
