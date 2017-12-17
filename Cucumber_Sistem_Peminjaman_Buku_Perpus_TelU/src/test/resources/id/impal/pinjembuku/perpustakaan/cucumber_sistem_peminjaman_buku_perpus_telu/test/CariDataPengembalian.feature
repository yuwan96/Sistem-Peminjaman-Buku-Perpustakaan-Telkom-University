# language: id

Fitur: Cari Data Pengembalian

        @Berhasil
        Skenario: Petugas berhasil mencari data Pengembalian
          Dengan Petugas mengetik nomor Pengembalian "K1265"
          Ketika Petugas mengeklik tombol Cari
          Maka respon cari data Pengembalian yang berhasil dengan "Menampilkan Detail Data Pengembalian"
        
        @Gagal
        Skenario: Petugas gagal mencari data Pengembalian
          Dengan Petugas mengetik nomor Pengembalian yang salah ""
          Ketika Petugas mengeklik tombol Cari
          Maka respon cari data Pengembalian yang gagal dengan "Memberi tahu bahwa keyword pencarian salah"

