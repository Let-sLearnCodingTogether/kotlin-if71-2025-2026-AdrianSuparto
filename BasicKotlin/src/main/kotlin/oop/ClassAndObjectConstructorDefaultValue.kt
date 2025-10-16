package oop

class MahasiswaConstructorDefaultValue(
    val npm : String,
    val nama : String,
    var ipk : Float = 0.0f
) {
    init {
        println("ini block init")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaConstructorDefaultValue(
        npm = "2226250027",
        nama = "Mahasiswa Pertama"
    )

    println(mahasiswaPertama.ipk)
    val mahasiswaKedua = MahasiswaConstructorDefaultValue(
        npm = "2226250041",
        nama = "Mahasiswa Dua",
        ipk = 3.9f
    )
}