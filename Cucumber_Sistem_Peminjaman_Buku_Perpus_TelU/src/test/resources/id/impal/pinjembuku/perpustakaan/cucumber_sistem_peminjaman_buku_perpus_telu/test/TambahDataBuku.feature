# language: id

Fitur: Tambah Data Buku

       @Berhasil
       Skenario: Petugas berhasil menambah data Buku
          Dengan Petugas mengisi kode buku yang benar dengan "J5ZFFH"
          Dan Petugas mengisi judul buku yang benar dengan "Orang-Orang di Persimpangan Kiri Jalan"
          Dan Petugas mengisi pengarang buku yang benar dengan "Soe Hok Gie"
          Dan Petugas mengisi penerbit buku yang benar dengan "Lentera Merah"
          Ketika Petugas mengeklik tombol Tambah
          Maka respon tambah data Buku yang berhasil dengan "Petugas berhasil menambah data Buku"
       @Gagal
       Skenario: Petugas gagal menambah data Buku
          Dengan Petugas mengisi kode buku yang salah dengan "123FJ"
          Dan Petugas mengisi judul buku yang salah dengan "Mengejar Gerhana"
          Dan Petugas mengisi pengarang buku yang salah dengan "JD Simatupang"
          Dan Petugas mengisi penerbit buku yang salah dengan "Gramedia"
          Ketika Petugas mengeklik tombol Tambah
          Maka respon tambah data Buku yang gagal dengan "Buku tersebut sudah terdata"

