# language: id

Fitur: Tambah Data Admin

       @Berhasil
       Skenario: Admin berhasil menambah data diri
          Dengan Admin mengisi id yang benar dengan "123456"
          Dan Admin mengisi nama yang benar dengan "Impal"
          Dan Admin mengisi jabatan yang benar dengan "Admin"
          Dan Admin mengisi password yang benar dengan "123123"
          Ketika Admin mengeklik tombol Tambah
          Maka respon tambah data yang berhasil dengan "Admin berhasil menambah data"
       @Gagal
          Skenario: Admin gagal menambah data diri
          Dengan Admin mengisi id yang salah dengan "123123"
          Dan Admin mengisi nama yang salah dengan "Lupa"
          Dan Admin mengisi jabatan yang salah dengan "Dosen"
          Dan Admin mengisi password yang salah dengan "123456"
          Ketika Admin mengeklik tombol Tambah
          Maka respon tambah data yang gagal dengan "Admin gagal menambah data"