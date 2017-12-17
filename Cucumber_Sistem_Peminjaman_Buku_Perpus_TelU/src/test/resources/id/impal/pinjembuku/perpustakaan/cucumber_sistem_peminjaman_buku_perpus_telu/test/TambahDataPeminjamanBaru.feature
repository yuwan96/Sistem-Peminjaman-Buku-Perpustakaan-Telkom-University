# language: id

Fitur: Tambah Data Peminjaman Baru

       @Berhasil
       Skenario: Petugas berhasil menambah data Peminjaman Baru
          Dengan Petugas mengisi nomor Peminjaman yang benar dengan "J1265"
          Dan Petugas mengisi tanggal Peminjaman yang benar dengan "12-01-2018"
          Dan Petugas mengisi status Peminjaman yang benar dengan "sedang dipinjam"
          Dan Petugas mengisi jumlah buku dipinjam yang benar dengan "2"
          Ketika Petugas mengeklik tombol Tambah
          Maka respon tambah data Peminjaman yang berhasil dengan "Petugas berhasil menambah data Peminjaman"
       @Gagal
       Skenario: Petugas gagal menambah data Peminjaman Baru
          Dengan Petugas mengisi nomor Peminjaman yang salah dengan ""
          Dan Petugas mengisi tanggal Peminjaman yang salah dengan ""
          Dan Petugas mengisi status Peminjaman yang salah dengan ""
          Dan Petugas mengisi jumlah buku dipinjam yang salah dengan ""
          Ketika Petugas mengeklik tombol Tambah
          Maka respon tambah data Peminjaman yang gagal dengan "Petugas gagal menambah data Peminjaman"

