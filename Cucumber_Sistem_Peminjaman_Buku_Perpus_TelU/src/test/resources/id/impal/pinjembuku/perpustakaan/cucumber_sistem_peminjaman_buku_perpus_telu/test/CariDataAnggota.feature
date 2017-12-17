# language: id

Fitur: Cari Data Anggota

        @Berhasil
        Skenario: Petugas berhasil mencari data Anggota
          Dengan Petugas mengetik nomor Anggota "123" pada kolom cari berdasarkan id Petugas
          Dan Petugas mengetik nim Anggota "1132124555" pada kolom cari berdasarkan nama Petugas
          Dan Petugas mengetik nama Anggota "Jono" pada kolom cari berdasarkan telepon Petugas
          Dan Petugas mengetik masa berlaku Anggota "11-12-2017" pada kolom cari berdasarkan password Petugas
          Ketika Petugas mengeklik tombol Cari
          Maka respon cari data Anggota yang berhasil dengan "Menampilkan Data Anggota"
        
        @Gagal
        Skenario: Petugas gagal mencari data Anggota
          Dengan Petugas mengetik nomor Anggota yang salah "125" pada kolom cari berdasarkan id Petugas
          Dan Petugas mengetik nim Anggota yang salah "Butet" pada kolom cari berdasarkan nama Petugas
          Dan Petugas mengetik nama Anggota yang salah "123987" pada kolom cari berdasarkan telepon Petugas
          Dan Petugas mengetik masa berlaku Anggota yang salah "10-10-2010" pada kolom cari berdasarkan password Petugas
          Ketika Petugas mengeklik tombol Cari
          Maka respon cari data Anggota yang gagal dengan "Memberi tahu bahwa keyword pencarian salah"