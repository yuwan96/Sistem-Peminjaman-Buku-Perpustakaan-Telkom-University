# language: id

Fitur: Tambah Data Pengembalian

       @Berhasil
       Skenario: Petugas berhasil menambah data Pengembalian
          Dengan Petugas mengisi nomor Pengembalian yang benar dengan "K1265"
          Dan Petugas mengisi total denda yang benar dengan "0"
          Ketika Petugas mengeklik tombol Tambah
          Maka respon tambah data Pengembalian yang berhasil dengan "Petugas berhasil menambah data Pengembalian"
       @Gagal
       Skenario: Petugas gagal menambah data Pengembalian
          Dengan Petugas mengisi nomor Pengembalian yang salah dengan ""
          Dan Petugas mengisi total denda yang salah dengan ""
          Ketika Petugas mengeklik tombol Tambah
          Maka respon tambah data Pengembalian yang gagal dengan "Petugas gagal menambah data Pengembalian"