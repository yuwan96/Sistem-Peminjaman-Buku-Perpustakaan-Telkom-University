/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu.test;

import id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu.Admin;
import id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu.Anggota;
import id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu.Buku;
import id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu.GUI;
import id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu.KelolaBuku;
import id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu.Petugas;
import id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu.tambahAnggota;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ndaru
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class MainTest {
    //implementasi JUnit
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testing(){
        System.out.println("Test petugasLogin");
        String id = "56789";
        String nama  = "Impal";
        String telp = "0811333444";
        String pass = "98765";
        Petugas instance = new Petugas();
        boolean result = instance.petugasLogin(id, pass);
        String expResult = "Login berhasil";
        assertEquals(expResult, result);
        
    }
}
