package Pertemuan4_BasicControlFlow

fun main() {
    val finalExam = 90

    if (finalExam >= 80) {
        val newFinalExam = finalExam + 10

        println(newFinalExam)
    }
// enkasuplation variabel cuma bisa di akses di dalam if nya itu sendiri jadi gabisa di akses diluar makanya error
//    println(newFinalExam)
}