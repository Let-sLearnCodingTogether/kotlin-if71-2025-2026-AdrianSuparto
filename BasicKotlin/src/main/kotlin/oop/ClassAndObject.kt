package oop

class MahasiswaConstructor(
    val npm : String,
    val nama : String,
    var ipk: Float)

fun main() {
    val mahasiswaPertama = MahasiswaConstructor(
        npm = "2226250027",
        nama = "mahasiswa 1",
        ipk = 1.3f
    )

    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

//    mahasiswaPertama.npm = "ABC"

    mahasiswaPertama.ipk = 1.2f
    println(mahasiswaPertama.ipk)
}