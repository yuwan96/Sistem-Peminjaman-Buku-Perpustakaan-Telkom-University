# language: id

Fitur: Cari Data Petugas

        @Berhasil
        Skenario: Admin berhasil mencari data Petugas
          Dengan Admin mengetik id Petugas "56789" pada kolom cari berdasarkan id Petugas
          Dan Admin mengetik nama Petugas "Impal" pada kolom cari berdasarkan nama Petugas
          Dan Admin mengetik telepon Petugas "0811333444" pada kolom cari berdasarkan telepon Petugas
          Dan Admin mengetik password Petugas "98765" pada kolom cari berdasarkan password Petugas
          Ketika Admin mengeklik tombol Cari
          Maka respon cari data Petugas yang berhasil dengan "Menampilkan Data Petugas"
        
        @Gagal
        Skenario: Admin gagal mencari data Petugas
          Dengan Admin mengetik id Petugas yang salah "123" pada kolom cari berdasarkan id Petugas
          Dan Admin mengetik nama Petugas yang salah "Butet" pada kolom cari berdasarkan nama Petugas
          Dan Admin mengetik telepon Petugas yang salah "082134" pada kolom cari berdasarkan telepon Petugas
          Dan Admin mengetik password Petugas yang salah "12345678" pada kolom cari berdasarkan password Petugas
          Ketika Admin mengeklik tombol Cari
          Maka respon cari data Petugas yang gagal dengan "Memberi tahu bahwa keyword pencarian salah"