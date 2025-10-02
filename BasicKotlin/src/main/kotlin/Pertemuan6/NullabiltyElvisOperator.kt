package Pertemuan6


fun main() {

    var prodiIf: String? = "IF"
    println(prodiIf?.length)

    var prodiSi: String? = null  //"Sistem Informasi"
    println(prodiIf?.length)
    println(prodiSi ?: "Tanpa Prodi")
}