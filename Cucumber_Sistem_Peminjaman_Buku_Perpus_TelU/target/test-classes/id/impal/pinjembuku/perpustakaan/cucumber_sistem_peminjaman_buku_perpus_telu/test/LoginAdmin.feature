# language: id

Fitur: Login Admin

        @Berhasil
        Skenario: Admin berhasil login
           Dengan Admin mengisi id yang benar dengan "123456"
           Dan Admin mengisi password yang benar dengan "123123"
           Ketika Admin mengeklik tombol Login
           Maka respon berhasil untuk Admin dengan "Anda berhasil login sebagai Admin"

        @Gagal
        Skenario: Admin gagal login
           Dengan Admin mengisi id yang salah dengan "123123"
           Dan Admin mengisi password yang salah dengan "123456"
           Ketika Admin mengeklik tombol Login
           Maka respon gagal untuk Admin dengan "Data login yang anda masukkan tidak valid"