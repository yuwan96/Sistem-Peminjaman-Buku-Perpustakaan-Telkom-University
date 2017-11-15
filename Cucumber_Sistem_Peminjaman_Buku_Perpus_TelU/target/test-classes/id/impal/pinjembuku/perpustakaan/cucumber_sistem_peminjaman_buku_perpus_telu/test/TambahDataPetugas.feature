# language: id

Fitur: Tambah Data Petugas

       @Berhasil
       Skenario: Admin berhasil menambah data Petugas
          Dengan Admin mengisi id petugas yang benar dengan "56789"
          Dan Admin mengisi nama Petugas yang benar dengan "Impal"
          Dan Admin mengisi telepon Petugas yang benar dengan "0811333444"
          Dan Admin mengisi password Petugas yang benar dengan "98765"
          Ketika Admin mengeklik tombol Tambah
          Maka respon tambah data Petugas yang berhasil dengan "Admin berhasil menambah data Petugas"
       @Gagal
       Skenario: Admin gagal menambah data Petugas
          Dengan Admin mengisi id Petugas yang salah dengan ""
          Dan Admin mengisi nama Petugas yang salah dengan ""
          Dan Admin mengisi telepon Petugas yang salah dengan ""
          Dan Admin mengisi password Petugas yang salah dengan ""
          Ketika Admin mengeklik tombol Tambah
          Maka respon tambah data Petugas yang gagal dengan "Admin gagal menambah data Petugas"
