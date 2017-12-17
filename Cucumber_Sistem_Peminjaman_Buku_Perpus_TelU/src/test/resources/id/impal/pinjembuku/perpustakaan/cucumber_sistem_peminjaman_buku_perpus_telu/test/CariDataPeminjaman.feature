# language: id

Fitur: Cari Data Peminjaman

        @Berhasil
        Skenario: Petugas berhasil mencari data Peminjaman
          Dengan Petugas mengetik nomor Peminjaman "J1265"
          Ketika Petugas mengeklik tombol Cari
          Maka respon cari data Peminjaman yang berhasil dengan "Menampilkan Detail Data Peminjaman"
        
        @Gagal
        Skenario: Petugas gagal mencari data Peminjaman
          Dengan Petugas mengetik nomor Peminjaman yang salah ""
          Ketika Petugas mengeklik tombol Cari
          Maka respon cari data Peminjaman yang gagal dengan "Memberi tahu bahwa keyword pencarian salah"
