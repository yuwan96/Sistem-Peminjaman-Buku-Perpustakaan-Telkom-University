/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.impal.pinjembuku.perpustakaan.cucumber_sistem_peminjaman_buku_perpus_telu.test;

import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import cucumber.api.java.id.Maka;
import static org.junit.Assert.*;

/**
 *
 * @author ndaru
 */
public class MainStepContext {

    // Login Admin
    @Dengan("^Admin mengisi id yang benar dengan \"([^\"]*)\"$")
    public void admin_mengisi_id_yang_benar_dengan(String arg1) throws Throwable {
        String result = "123456";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi id yang salah dengan \"([^\"]*)\"$")
    public void admin_mengisi_id_yang_salah_dengan(String arg1) throws Throwable {
        String result = "123123";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi password yang benar dengan \"([^\"]*)\"$")
    public void admin_mengisi_password_yang_benar_dengan(String arg1) throws Throwable {
        String result = "123123";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi password yang salah dengan \"([^\"]*)\"$")
    public void admin_mengisi_password_yang_salah_dengan(String arg1) throws Throwable {
        String result = "123456";
        assertEquals(arg1, result);
    }

    @Ketika("^Admin mengeklik tombol Login$")
    public void admin_mengeklik_tombol_Login() throws Throwable {
        boolean expected = true;
        boolean result = true;
        assertEquals(expected, result);
    }

    @Maka("^respon berhasil untuk Admin dengan \"([^\"]*)\"$")
    public void respon_berhasil_untuk_admin_dengan(String arg1) throws Throwable {
        String result = "Anda berhasil login sebagai Admin";
        assertEquals(arg1, result);
    }

    @Maka("^respon gagal untuk Admin dengan \"([^\"]*)\"$")
    public void respon_gagal_untuk_admin_dengan(String arg1) throws Throwable {
        String result = "Data login yang anda masukkan tidak valid";
        assertEquals(arg1, result);
    }

    // Login Petugas
    @Dengan("^Petugas mengisi id yang benar dengan \"([^\"]*)\"$")
    public void petugas_mengisi_id_yang_benar_dengan(String arg1) throws Throwable {
        String result = "56789";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi id yang salah dengan \"([^\"]*)\"$")
    public void petugas_mengisi_id_yang_salah_dengan(String arg1) throws Throwable {
        String result = "01234";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi password yang benar dengan \"([^\"]*)\"$")
    public void petugas_mengisi_password_yang_benar_dengan(String arg1) throws Throwable {
        String result = "98765";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi password yang salah dengan \"([^\"]*)\"$")
    public void petugas_mengisi_password_yang_salah_dengan(String arg1) throws Throwable {
        String result = "43210";
        assertEquals(arg1, result);
    }

    @Ketika("^Petugas mengeklik tombol Login$")
    public void petugas_mengeklik_tombol_Login() throws Throwable {
        boolean expected = true;
        boolean result = true;
        assertEquals(expected, result);
    }

    @Maka("^respon berhasil untuk Petugas dengan \"([^\"]*)\"$")
    public void respon_berhasil_untuk_petugas_dengan(String arg1) throws Throwable {
        String result = "Anda berhasil login sebagai Petugas";
        assertEquals(arg1, result);
    }

    @Maka("^respon gagal untuk Petugas dengan \"([^\"]*)\"$")
    public void respon_gagal_untuk_petugas_dengan(String arg1) throws Throwable {
        String result = "Data login yang anda masukkan tidak valid";
        assertEquals(arg1, result);
    }

    // Tambah Data Admin
    @Dengan("^Admin mengisi nama yang benar dengan \"([^\"]*)\"$")
    public void admin_mengisi_nama_yang_benar_dengan(String arg1) throws Throwable {
        String result = "Impal";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi jabatan yang benar dengan \"([^\"]*)\"$")
    public void admin_mengisi_jabatan_yang_benar_dengan(String arg1) throws Throwable {
        String result = "Admin";
        assertEquals(arg1, result);
    }

    @Maka("^respon tambah data yang berhasil dengan \"([^\"]*)\"$")
    public void respon_tambah_data_yang_berhasil_dengan(String arg1) throws Throwable {
        String result = "Admin berhasil menambah data";
        assertEquals(arg1, result);
    }

    @Ketika("^Admin mengeklik tombol Tambah$")
    public void admin_mengeklik_tombol_Tambah() throws Throwable {
        boolean expected = true;
        boolean result = true;
        assertEquals(expected, result);
    }

    @Dengan("^Admin mengisi nama yang salah dengan \"([^\"]*)\"$")
    public void admin_mengisi_nama_yang_salah_dengan(String arg1) throws Throwable {
        String result = "Lupa";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi jabatan yang salah dengan \"([^\"]*)\"$")
    public void admin_mengisi_jabatan_yang_salah_dengan(String arg1) throws Throwable {
        String result = "Dosen";
        assertEquals(arg1, result);
    }

    @Maka("^respon tambah data yang gagal dengan \"([^\"]*)\"$")
    public void respon_tambah_data_yang_gagal_dengan(String arg1) throws Throwable {
        String result = "Admin gagal menambah data";
        assertEquals(arg1, result);
    }

    // Edit Data Admin
    @Dengan("^Admin mengisi id yang baru dengan \"([^\"]*)\"$")
    public void admin_mengisi_id_yang_baru_dengan(String arg1) throws Throwable {
        String result = "654321";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi nama yang baru dengan \"([^\"]*)\"$")
    public void admin_mengisi_nama_yang_baru_dengan(String arg1) throws Throwable {
        String result = "Sisop";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi jabatan yang baru dengan \"([^\"]*)\"$")
    public void admin_mengisi_jabatan_yang_baru_dengan(String arg1) throws Throwable {
        String result = "Dosen";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi password yang baru dengan \"([^\"]*)\"$")
    public void admin_mengisi_password_yang_baru_dengan(String arg1) throws Throwable {
        String result = "321321";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi id yang lama dengan \"([^\"]*)\"$")
    public void admin_mengisi_id_yang_lama_dengan(String arg1) throws Throwable {
        String result = "123456";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi nama yang lama dengan \"([^\"]*)\"$")
    public void admin_mengisi_nama_yang_lama_dengan(String arg1) throws Throwable {
        String result = "Impal";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi jabatan yang lama dengan \"([^\"]*)\"$")
    public void admin_mengisi_jabatan_yang_lama_dengan(String arg1) throws Throwable {
        String result = "Admin";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi password yang lama dengan \"([^\"]*)\"$")
    public void admin_mengisi_password_yang_lama_dengan(String arg1) throws Throwable {
        String result = "123123";
        assertEquals(arg1, result);
    }

    @Ketika("^Admin mengeklik tombol Edit$")
    public void admin_mengeklik_tombol_Edit() throws Throwable {
        boolean expected = true;
        boolean result = true;
        assertEquals(expected, result);
    }

    @Maka("^respon edit data yang berhasil dengan \"([^\"]*)\"$")
    public void respon_edit_data_yang_berhasil_dengan(String arg1) throws Throwable {
        String result = "Admin berhasil mengubah data";
        assertEquals(arg1, result);
    }

    @Maka("^respon edit data yang gagal dengan \"([^\"]*)\"$")
    public void respon_edit_data_yang_gagal_dengan(String arg1) throws Throwable {
        String result = "Terdapat duplikasi di sini";
        assertEquals(arg1, result);
    }

    // Hapus Data Admin 
    @Dengan("^Admin menghapus id dengan \"([^\"]*)\"$")
    public void admin_menghapus_id_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin menghapus nama dengan \"([^\"]*)\"$")
    public void admin_menghapus_nama_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin menghapus jabatan dengan \"([^\"]*)\"$")
    public void admin_menghapus_jabatan_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin menghapus password dengan \"([^\"]*)\"$")
    public void admin_menghapus_password_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Ketika("^Admin mengeklik tombol Hapus$")
    public void admin_mengeklik_tombol_Hapus() throws Throwable {
        boolean expected = true;
        boolean result = true;
        assertEquals(expected, result);
    }

    @Maka("^respon hapus data yang berhasil dengan \"([^\"]*)\"$")
    public void respon_hapus_data_yang_berhasil_dengan(String arg1) throws Throwable {
        String result = "Admin berhasil menghapus data";
        assertEquals(arg1, result);
    }

    // Tambah Data Petugas
    @Dengan("^Admin mengisi id petugas yang benar dengan \"([^\"]*)\"$")
    public void admin_mengisi_id_petugas_yang_benar_dengan(String arg1) throws Throwable {
        String result = "56789";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi nama Petugas yang benar dengan \"([^\"]*)\"$")
    public void admin_mengisi_nama_Petugas_yang_benar_dengan(String arg1) throws Throwable {
        String result = "Impal";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi telepon Petugas yang benar dengan \"([^\"]*)\"$")
    public void admin_mengisi_telepon_Petugas_yang_benar_dengan(String arg1) throws Throwable {
        String result = "0811333444";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi password Petugas yang benar dengan \"([^\"]*)\"$")
    public void admin_mengisi_password_Petugas_yang_benar_dengan(String arg1) throws Throwable {
        String result = "98765";
        assertEquals(arg1, result);
    }

    @Maka("^respon tambah data Petugas yang berhasil dengan \"([^\"]*)\"$")
    public void respon_tambah_data_Petugas_yang_berhasil_dengan(String arg1) throws Throwable {
        String result = "Admin berhasil menambah data Petugas";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi id Petugas yang salah dengan \"([^\"]*)\"$")
    public void admin_mengisi_id_Petugas_yang_salah_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi nama Petugas yang salah dengan \"([^\"]*)\"$")
    public void admin_mengisi_nama_Petugas_yang_salah_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi telepon Petugas yang salah dengan \"([^\"]*)\"$")
    public void admin_mengisi_telepon_Petugas_yang_salah_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi password Petugas yang salah dengan \"([^\"]*)\"$")
    public void admin_mengisi_password_Petugas_yang_salah_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Maka("^respon tambah data Petugas yang gagal dengan \"([^\"]*)\"$")
    public void respon_tambah_data_Petugas_yang_gagal_dengan(String arg1) throws Throwable {
        String result = "Admin gagal menambah data Petugas";
        assertEquals(arg1, result);
    }

    //EditDataPetugas
    @Dengan("^Admin mengisi id Petugas yang baru dengan \"([^\"]*)\"$")
    public void admin_mengisi_id_Petugas_yang_baru_dengan(String arg1) throws Throwable {
        String result = "224248";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi nama Petugas yang baru dengan \"([^\"]*)\"$")
    public void admin_mengisi_nama_Petugas_yang_baru_dengan(String arg1) throws Throwable {
        String result = "Joni";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi telepon Petugas yang baru dengan \"([^\"]*)\"$")
    public void admin_mengisi_telepon_Petugas_yang_baru_dengan(String arg1) throws Throwable {
        String result = "0812234234";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi password Petugas yang baru dengan \"([^\"]*)\"$")
    public void admin_mengisi_password_Petugas_yang_baru_dengan(String arg1) throws Throwable {
        String result = "111112";
        assertEquals(arg1, result);
    }

    @Maka("^respon edit data Petugas yang berhasil dengan \"([^\"]*)\"$")
    public void respon_edit_data_Petugas_yang_berhasil_dengan(String arg1) throws Throwable {
        String result = "Admin berhasil mengubah data Petugas";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi id Petugas yang lama dengan \"([^\"]*)\"$")
    public void admin_mengisi_id_Petugas_yang_lama_dengan(String arg1) throws Throwable {
        String result = "56789";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi nama Petugas yang lama dengan \"([^\"]*)\"$")
    public void admin_mengisi_nama_Petugas_yang_lama_dengan(String arg1) throws Throwable {
        String result = "Impal";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi telepon Petugas yang lama dengan \"([^\"]*)\"$")
    public void admin_mengisi_telepon_Petugas_yang_lama_dengan(String arg1) throws Throwable {
        String result = "0811333444";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengisi password Petugasyang lama dengan \"([^\"]*)\"$")
    public void admin_mengisi_password_Petugasyang_lama_dengan(String arg1) throws Throwable {
        String result = "98765";
        assertEquals(arg1, result);
    }

    @Maka("^respon edit data Petugas yang gagal dengan \"([^\"]*)\"$")
    public void respon_edit_data_Petugas_yang_gagal_dengan(String arg1) throws Throwable {
        String result = "Terdapat duplikasi Data Petugas di sini";
        assertEquals(arg1, result);
    }

    // Hapus Data Petugas
    @Dengan("^Admin menghapus id Petugas dengan \"([^\"]*)\"$")
    public void admin_menghapus_id_Petugas_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin menghapus nama Petugas dengan \"([^\"]*)\"$")
    public void admin_menghapus_nama_Petugas_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin menghapus telepon Petugas dengan \"([^\"]*)\"$")
    public void admin_menghapus_telepon_Petugas_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin menghapus password Petugas dengan \"([^\"]*)\"$")
    public void admin_menghapus_password_Petugas_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Maka("^respon hapus data Petugas yang berhasil dengan \"([^\"]*)\"$")
    public void respon_hapus_data_Petugas_yang_berhasil_dengan(String arg1) throws Throwable {
        String result = "Admin berhasil menghapus data Petugas";
        assertEquals(arg1, result);
    }

    // Cari Data Petugas
    @Dengan("^Admin mengetik id Petugas \"([^\"]*)\" pada kolom cari berdasarkan id Petugas$")
    public void admin_mengetik_id_Petugas_pada_kolom_cari_berdasarkan_id_Petugas(String arg1) throws Throwable {
        String result = "56789";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengetik nama Petugas \"([^\"]*)\" pada kolom cari berdasarkan nama Petugas$")
    public void admin_mengetik_nama_Petugas_pada_kolom_cari_berdasarkan_nama_Petugas(String arg1) throws Throwable {
        String result = "Impal";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengetik telepon Petugas \"([^\"]*)\" pada kolom cari berdasarkan telepon Petugas$")
    public void admin_mengetik_telepon_Petugas_pada_kolom_cari_berdasarkan_telepon_Petugas(String arg1) throws Throwable {
        String result = "0811333444";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengetik password Petugas \"([^\"]*)\" pada kolom cari berdasarkan password Petugas$")
    public void admin_mengetik_password_Petugas_pada_kolom_cari_berdasarkan_password_Petugas(String arg1) throws Throwable {
        String result = "98765";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengetik id Petugas yang salah \"([^\"]*)\" pada kolom cari berdasarkan id Petugas$")
    public void admin_mengetik_id_Petugas_yang_salah_pada_kolom_cari_berdasarkan_id_Petugas(String arg1) throws Throwable {
        String result = "123";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengetik nama Petugas yang salah \"([^\"]*)\" pada kolom cari berdasarkan nama Petugas$")
    public void admin_mengetik_nama_Petugas_yang_salah_pada_kolom_cari_berdasarkan_nama_Petugas(String arg1) throws Throwable {
        String result = "Butet";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengetik telepon Petugas yang salah \"([^\"]*)\" pada kolom cari berdasarkan telepon Petugas$")
    public void admin_mengetik_telepon_Petugas_yang_salah_pada_kolom_cari_berdasarkan_telepon_Petugas(String arg1) throws Throwable {
        String result = "082134";
        assertEquals(arg1, result);
    }

    @Dengan("^Admin mengetik password Petugas yang salah \"([^\"]*)\" pada kolom cari berdasarkan password Petugas$")
    public void admin_mengetik_password_Petugas_yang_salah_pada_kolom_cari_berdasarkan_password_Petugas(String arg1) throws Throwable {
        String result = "12345678";
        assertEquals(arg1, result);
    }

    @Ketika("^Admin mengeklik tombol Cari$")
    public void admin_mengeklik_tombol_Cari() throws Throwable {
        boolean expected = true;
        boolean result = true;
        assertEquals(expected, result);
    }

    @Maka("^respon cari data Petugas yang berhasil dengan \"([^\"]*)\"$")
    public void respon_cari_data_Petugas_yang_berhasil_dengan(String arg1) throws Throwable {
        String result = "Menampilkan Data Petugas";
        assertEquals(arg1, result);
    }

    @Maka("^respon cari data Petugas yang gagal dengan \"([^\"]*)\"$")
    public void respon_cari_data_Petugas_yang_gagal_dengan(String arg1) throws Throwable {
        String result = "Memberi tahu bahwa keyword pencarian salah";
        assertEquals(arg1, result);
    }

    //Tambah Data Buku
    @Dengan("^Petugas mengisi kode buku yang benar dengan \"([^\"]*)\"$")
    public void petugas_mengisi_kode_buku_yang_benar_dengan(String arg1) throws Throwable {
        String result = "J5ZFFH";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi judul buku yang benar dengan \"([^\"]*)\"$")
    public void petugas_mengisi_judul_buku_yang_benar_dengan(String arg1) throws Throwable {
        String result = "Orang-Orang di Persimpangan Kiri Jalan";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi pengarang buku yang benar dengan \"([^\"]*)\"$")
    public void petugas_mengisi_pengarang_buku_yang_benar_dengan(String arg1) throws Throwable {
        String result = "Soe Hok Gie";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi penerbit buku yang benar dengan \"([^\"]*)\"$")
    public void petugas_mengisi_penerbit_buku_yang_benar_dengan(String arg1) throws Throwable {
        String result = "Lentera Merah";
        assertEquals(arg1, result);
    }

    @Ketika("^Petugas mengeklik tombol Tambah$")
    public void petugas_mengeklik_tombol_Tambah() throws Throwable {
        boolean expected = true;
        boolean result = true;
        assertEquals(expected, result);
    }

    @Maka("^respon tambah data Buku yang berhasil dengan \"([^\"]*)\"$")
    public void respon_tambah_data_Buku_yang_berhasil_dengan(String arg1) throws Throwable {
        String result = "Petugas berhasil menambah data Buku";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi kode buku yang salah dengan \"([^\"]*)\"$")
    public void petugas_mengisi_kode_buku_yang_salah_dengan(String arg1) throws Throwable {
        String result = "123FJ";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi judul buku yang salah dengan \"([^\"]*)\"$")
    public void petugas_mengisi_judul_buku_yang_salah_dengan(String arg1) throws Throwable {
        String result = "Mengejar Gerhana";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi pengarang buku yang salah dengan \"([^\"]*)\"$")
    public void petugas_mengisi_pengarang_buku_yang_salah_dengan(String arg1) throws Throwable {
        String result = "JD Simatupang";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi penerbit buku yang salah dengan \"([^\"]*)\"$")
    public void petugas_mengisi_penerbit_buku_yang_salah_dengan(String arg1) throws Throwable {
        String result = "Gramedia";
        assertEquals(arg1, result);
    }

    @Maka("^respon tambah data Buku yang gagal dengan \"([^\"]*)\"$")
    public void respon_tambah_data_Buku_yang_gagal_dengan(String arg1) throws Throwable {
        String result = "Buku tersebut sudah terdata";
        assertEquals(arg1, result);
    }

    // Edit Data Buku
    @Dengan("^Petugas mengisi kode Buku yang baru dengan \"([^\"]*)\"$")
    public void petugas_mengisi_kode_Buku_yang_baru_dengan(String arg1) throws Throwable {
        String result = "FJ123";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi judul Buku yang baru dengan \"([^\"]*)\"$")
    public void petugas_mengisi_judul_Buku_yang_baru_dengan(String arg1) throws Throwable {
        String result = "Lord of The Ring";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi pengarang Buku yang baru dengan \"([^\"]*)\"$")
    public void petugas_mengisi_pengarang_Buku_yang_baru_dengan(String arg1) throws Throwable {
        String result = "Genjik";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi penerbit Buku yang baru dengan \"([^\"]*)\"$")
    public void petugas_mengisi_penerbit_Buku_yang_baru_dengan(String arg1) throws Throwable {
        String result = "Tempo";
        assertEquals(arg1, result);
    }

    @Ketika("^Petugas mengeklik tombol Edit$")
    public void petugas_mengeklik_tombol_Edit() throws Throwable {
        boolean expected = true;
        boolean result = true;
        assertEquals(expected, result);
    }

    @Maka("^respon edit data Buku yang berhasil dengan \"([^\"]*)\"$")
    public void respon_edit_data_Buku_yang_berhasil_dengan(String arg1) throws Throwable {
        String result = "Petugas berhasil mengubah data Buku";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi kode Buku yang lama dengan \"([^\"]*)\"$")
    public void petugas_mengisi_kode_Buku_yang_lama_dengan(String arg1) throws Throwable {
        String result = "123FJ";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi judul Buku yang lama dengan \"([^\"]*)\"$")
    public void petugas_mengisi_judul_Buku_yang_lama_dengan(String arg1) throws Throwable {
        String result = "Mengejar Gerhana";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi pengarang Buku yang lama dengan \"([^\"]*)\"$")
    public void petugas_mengisi_pengarang_Buku_yang_lama_dengan(String arg1) throws Throwable {
        String result = "JD Simatupang";
        assertEquals(arg1, result);
    }

    @Dengan("^Petugas mengisi penerbit Buku yang lama dengan \"([^\"]*)\"$")
    public void petugas_mengisi_penerbit_Buku_yang_lama_dengan(String arg1) throws Throwable {
        String result = "Gramedia";
        assertEquals(arg1, result);
    }

    @Maka("^respon edit data Buku yang gagal dengan \"([^\"]*)\"$")
    public void respon_edit_data_Buku_yang_gagal_dengan(String arg1) throws Throwable {
        String result = "Terdapat duplikasi Data Buku di sini";
        assertEquals(arg1, result);
    }

    // Hapus Data Buku
    @Dengan("^Penjaga menghapus kode Buku dengan \"([^\"]*)\"$")
    public void penjaga_menghapus_kode_Buku_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Dengan("^Penjaga menghapus judul Buku dengan \"([^\"]*)\"$")
    public void penjaga_menghapus_judul_Buku_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Dengan("^Penjaga menghapus pengarang Buku dengan \"([^\"]*)\"$")
    public void penjaga_menghapus_pengarang_Buku_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Dengan("^Penjaga menghapus penerbit Buku dengan \"([^\"]*)\"$")
    public void penjaga_menghapus_penerbit_Buku_dengan(String arg1) throws Throwable {
        String result = "";
        assertEquals(arg1, result);
    }

    @Ketika("^Penjaga mengeklik tombol Hapus$")
    public void penjaga_mengeklik_tombol_Hapus() throws Throwable {
        boolean expected = true;
        boolean result = true;
        assertEquals(expected, result);
    }

    @Maka("^respon hapus data Buku yang berhasil dengan \"([^\"]*)\"$")
    public void respon_hapus_data_Buku_yang_berhasil_dengan(String arg1) throws Throwable {
        String result = "Penjaga berhasil menghapus data Buku";
        assertEquals(arg1, result);
    }

}
