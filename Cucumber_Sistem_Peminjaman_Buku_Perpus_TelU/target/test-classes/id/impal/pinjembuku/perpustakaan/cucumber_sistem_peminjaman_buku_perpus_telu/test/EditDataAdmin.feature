# language: id

Fitur: Edit Data Admin

       @Berhasil
       Skenario: Admin berhasil mengubah data diri
          Dengan Admin mengisi id yang baru dengan "654321"
          Dan Admin mengisi nama yang baru dengan "Sisop"
          Dan Admin mengisi jabatan yang baru dengan "Dosen"
          Dan Admin mengisi password yang baru dengan "321321"
          Ketika Admin mengeklik tombol Edit
          Maka respon edit data yang berhasil dengan "Admin berhasil mengubah data"
       @Gagal
        Skenario: Admin gagal mengubah data diri
          Dengan Admin mengisi id yang lama dengan "123456"
          Dan Admin mengisi nama yang lama dengan "Impal"
          Dan Admin mengisi jabatan yang lama dengan "Admin"
          Dan Admin mengisi password yang lama dengan "123123"
          Ketika Admin mengeklik tombol Edit
          Maka respon edit data yang gagal dengan "Terdapat duplikasi di sini"