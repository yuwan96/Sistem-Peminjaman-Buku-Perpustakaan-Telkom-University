# language: id

Fitur: Tambah Data Anggota

       @Berhasil
       Skenario: Petugas berhasil menambah data Anggota
          Dengan Petugas mengisi nomor anggota yang benar dengan "123"
          Dan Petugas mengisi nim anggota yang benar dengan "1132124555"
          Dan Petugas mengisi nama anggota yang benar dengan "Jono"
          Dan Petugas mengisi masa berlaku anggota yang benar dengan "11-12-2017"
          Ketika Petugas mengeklik tombol Tambah
          Maka respon tambah data Anggota yang berhasil dengan "Petugas berhasil menambah data anggota"
       @Gagal
          Skenario: Petugas gagal menambah data Anggota
          Dengan Petugas mengisi nomor anggota yang salah dengan "124"
          Dan Petugas mengisi nim anggota yang salah dengan "1132124556"
          Dan Petugas mengisi nama anggota yang salah dengan "Joni"
          Dan Petugas mengisi masa berlaku anggota yang salah dengan "11-12-2018"
          Ketika Petugas mengeklik tombol Tambah
          Maka respon tambah data Anggota yang gagal dengan "Petugas gagal menambah data anggota"