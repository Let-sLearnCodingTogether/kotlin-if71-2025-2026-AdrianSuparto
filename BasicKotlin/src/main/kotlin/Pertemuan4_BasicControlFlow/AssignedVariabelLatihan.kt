package Pertemuan4_BasicControlFlow

fun main() {
    var uangTabungan = 0

//    when {
//        uangTabungan == 0 -> uangTabungan += 25000
//        else -> uangTabungan += 10000
//    }

//    println("Uang Tabungan : $uangTabungan")

    when {
        uangTabungan == 0 -> {
            uangTabungan += 25000
            println(uangTabungan)
        }

        else -> uangTabungan += 10000
    }



}