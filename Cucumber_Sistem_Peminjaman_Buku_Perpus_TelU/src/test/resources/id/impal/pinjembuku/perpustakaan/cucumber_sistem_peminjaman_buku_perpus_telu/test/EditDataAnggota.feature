# language: id

Fitur: Edit Data Anggota

       @Berhasil
       Skenario: Petugas berhasil mengubah data Anggota
          Dengan Petugas mengisi nomor anggota yang baru dengan "12345"
          Dan Petugas mengisi nim anggota yang baru dengan "123456789"
          Dan Petugas mengisi nama anggota yang baru dengan "Prapto"
          Dan Petugas mengisi masa berlaku anggota yang baru dengan "12/03/2018"
          Ketika Petugas mengeklik tombol Edit
          Maka respon edit data Anggota yang berhasil dengan "Petugas berhasil mengubah data Anggota"
       @Gagal
        Skenario: Petugas gagal mengubah data Anggota
          Dengan Petugas mengisi nomor anggota yang lama dengan "123"
          Dan Petugas mengisi nim anggota yang lama dengan "1132124555"
          Dan Petugas mengisi nama anggota yang lama dengan "Jono"
          Dan Petugas mengisi masa berlaku anggota yang lama dengan "11-12-2017"
          Ketika Petugas mengeklik tombol Edit
          Maka respon edit data Anggota yang gagal dengan "Terdapat duplikasi Data Anggota di sini"
