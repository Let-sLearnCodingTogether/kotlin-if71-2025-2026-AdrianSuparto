package LatihanUas.Soal1

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Mulai")
    val job: Job = launch {
        println("Download data")
        delay(3_000)
    }
    job.join()
    println("Aplikasi Selesai")
}