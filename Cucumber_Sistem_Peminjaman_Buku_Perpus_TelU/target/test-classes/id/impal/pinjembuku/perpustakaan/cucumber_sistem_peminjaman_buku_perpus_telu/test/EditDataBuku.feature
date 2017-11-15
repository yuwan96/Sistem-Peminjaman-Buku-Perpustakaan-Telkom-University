# language: id

Fitur: Edit Data Buku

       @Berhasil
       Skenario: Petugas berhasil mengubah data Buku
          Dengan Petugas mengisi kode Buku yang baru dengan "FJ123"
          Dan Petugas mengisi judul Buku yang baru dengan "Lord of The Ring"
          Dan Petugas mengisi pengarang Buku yang baru dengan "Genjik"
          Dan Petugas mengisi penerbit Buku yang baru dengan "Tempo"
          Ketika Petugas mengeklik tombol Edit
          Maka respon edit data Buku yang berhasil dengan "Petugas berhasil mengubah data Buku"
       @Gagal
        Skenario: Petugas gagal mengubah data Buku
          Dengan Petugas mengisi kode Buku yang lama dengan "123FJ"
          Dan Petugas mengisi judul Buku yang lama dengan "Mengejar Gerhana"
          Dan Petugas mengisi pengarang Buku yang lama dengan "JD Simatupang"
          Dan Petugas mengisi penerbit Buku yang lama dengan "Gramedia"
          Ketika Petugas mengeklik tombol Edit
          Maka respon edit data Buku yang gagal dengan "Terdapat duplikasi Data Buku di sini"
