# language: id

Fitur: Login Petugas

        @Berhasil
        Skenario: Petugas berhasil login
           Dengan Petugas mengisi id yang benar dengan "56789"
           Dan Petugas mengisi password yang benar dengan "98765"
           Ketika Petugas mengeklik tombol Login
           Maka respon berhasil untuk Petugas dengan "Anda berhasil login sebagai Petugas"

        @Gagal
        Skenario: Petugas gagal login
           Dengan Petugas mengisi id yang salah dengan "01234"
           Dan Petugas mengisi password yang salah dengan "43210"
           Ketika Petugas mengeklik tombol Login
           Maka respon gagal untuk Petugas dengan "Data login yang anda masukkan tidak valid"
