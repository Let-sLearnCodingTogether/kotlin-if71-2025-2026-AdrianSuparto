package LatihanUas.Soal2

import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    launch {
        layaniPelanggan("Budi")
    }
    launch {
        layaniPelanggan("Susi")
    }
    launch {
        layaniPelanggan("Anton")
    }

}

suspend fun layaniPelanggan(nama: String) {
    println("$nama sedang memesan...")
    delay(5000L)
    println("$nama selesai dilayani.")
}