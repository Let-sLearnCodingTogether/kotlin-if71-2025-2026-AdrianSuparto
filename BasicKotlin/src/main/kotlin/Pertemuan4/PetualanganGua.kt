package Pertemuan4

fun main() {
    // Bagian 1 : Pengaturan Awal (Tipe Data & Variabel)
    println("Nama Kamu ? ")
    val namaPemain: String = readln()
    var kesehatanPemain = 100
    var punyaKunciEmas = false
    var jumlahPotion = 2
    var sedangBermain = true

// Bagian 2 : Permainan
    while (sedangBermain == true && kesehatanPemain>0) {
        println("Nama : $namaPemain")
        println("Kesehatan : $kesehatanPemain")
        println("Sisa Potion : $jumlahPotion")

        // Pintu masuk
        println("Didepan kamu terdapat 2 buah jalur (1, 2) :")
        println("1). Jalur gelap dan seram")
        println("2). Jalur tenang dan sunyi")
        val jalurPintuMasuk: String = readln()

        if (jalurPintuMasuk == "1" ) {
            println("Kamu berada disebuah ruangan dengan tiga patung : naga, griffin, dan ular")

            println("Pilih patung di depan anda")
            val patungPilihan: String = readln()

            when (patungPilihan) {
                "naga" -> {
                    println("Naga Mengeluarkan api dan kesehatan pemain berkurang 35 poin")
                    kesehatanPemain -= 35
                    println("Kesehatan : $kesehatanPemain")
                    println("mau menggunakan poition atau tidak (y/n)")
                    val pakaiPotion = readln()
                    if (pakaiPotion == "y"){
                        kesehatanPemain += 10
                        jumlahPotion -= 1
                        println("Kesehatan : $kesehatanPemain")
                        println("Sisa Potion : $jumlahPotion")

                    }else{
                        println("Melanjutkan Perjalanan")
                        println("Pintu terkunci dan membutuhkan kunci emas")
                        println("Game Over")
                        sedangBermain=false
                    }
                }
                "griffin" -> {
                    println("Mendapatkan kunci emas")
                    punyaKunciEmas = true
                    println("Terus berlajan...")
                    println("Kamu menggunakan kunci emas dan menemukan artefak kuno!")
                }
                "ular" -> {
                    println("Menggigit pemain dan kesehatan pemain berkurang 15")
                    kesehatanPemain -= 15
                    println("Kesehatan : $kesehatanPemain")
                    val pakaiPotion = readln()
                    if (pakaiPotion == "y"){
                        kesehatanPemain += 10
                        jumlahPotion -= 1
                        println("Kesehatan : $kesehatanPemain")
                        println("Sisa Potion : $jumlahPotion")
                    }else{
                        println("Melanjutkan Perjalanan")
                        println("Pintu terkunci dan membutuhkan kunci emas")
                        println("Game Over")
                        sedangBermain=false
                    }
                }
                else -> {
                    println("Anda memilih diluar pilihan")
                }
            }

        } else {
            println("Anda menginjak perangkap dan kesehatan pemain berkurang 25 poin")
            kesehatanPemain -= 25
            println("Kesehatan : $kesehatanPemain")
        }

    }
}