package Pertemuan4_BasicControlFlow

fun main() {
    val hari: Array<String> = arrayOf("Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu","Minggu")
    println("======================================")
    println("Jumlah Hari : ${hari.size}")

    println("Hari pertama : ${hari.first()}")
    println("Hari terakhir : ${hari.last()}")

    //Ubah Nilai
    hari[5-1] = "Jum'at barokah"
    println(hari[5-1])
    println("======================================")
}