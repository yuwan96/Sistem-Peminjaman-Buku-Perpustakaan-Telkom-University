# language: id

Fitur: Edit Data Petugas

       @Berhasil
       Skenario: Admin berhasil mengubah data Petugas
          Dengan Admin mengisi id Petugas yang baru dengan "224248"
          Dan Admin mengisi nama Petugas yang baru dengan "Joni"
          Dan Admin mengisi telepon Petugas yang baru dengan "0812234234"
          Dan Admin mengisi password Petugas yang baru dengan "111112"
          Ketika Admin mengeklik tombol Edit
          Maka respon edit data Petugas yang berhasil dengan "Admin berhasil mengubah data Petugas"
       @Gagal
        Skenario: Admin gagal mengubah data Petugas
          Dengan Admin mengisi id Petugas yang lama dengan "56789"
          Dan Admin mengisi nama Petugas yang lama dengan "Impal"
          Dan Admin mengisi telepon Petugas yang lama dengan "0811333444"
          Dan Admin mengisi password Petugasyang lama dengan "98765"
          Ketika Admin mengeklik tombol Edit
          Maka respon edit data Petugas yang gagal dengan "Terdapat duplikasi Data Petugas di sini"