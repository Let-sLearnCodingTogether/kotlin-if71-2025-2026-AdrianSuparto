package Pertemuan4_BasicControlFlow

fun main() {
    val finalExam = 'A'
    val nilaiLulus = arrayOf('A', 'B')

    when (finalExam) {
        'A' -> println("Lulus")
        'B' -> println("Lulus Juga")
        'C' -> println("Ya Bisa Lulus")
        else -> println("Tidak Lulus")
    }

    when (finalExam) {
        'A', 'B' -> println("Lulus")
        'C' -> println("Ya Bisa Lulus")
        else -> println("Tidak Lulus")
    }

    when {
        finalExam == 'A' || finalExam == 'B' -> println("Lulus")
        finalExam == 'C' -> println("Ya bisa lulus")
        else -> println("Tidak Lulus")
    }

    val status = when (finalExam) {
        'A', 'B' -> true
        else -> false
    }

    println(status)


    // Untuk cek apakah lulus atau tidak
    when (finalExam) {
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Tidak Lulus")
    }

    //Untuk cek tipe data
    when (finalExam) {
        is Char -> println("ya ini char")
        is String -> println("Ini String")
        !is Char -> println("Bukan Char")
    }
}