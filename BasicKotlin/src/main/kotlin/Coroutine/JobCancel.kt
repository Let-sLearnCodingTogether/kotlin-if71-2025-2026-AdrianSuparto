package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi dimulai")

    val job: Job = launch {
        updateVersion3()
    }

    println("Apakah job ini selesai? ${job.isCompleted}")
    println("Apakah job ini berjalan ? ${job.isActive}")
    println("Apakah job ini dibatalkan ? ${job.isCancelled}")

    job.join() // akan menunggu job sampai selesai
    println("Aplikasi sedang digunakan")

    println("Apakah job ini selesai? ${job.isCompleted}")
    println("Apakah job ini berjalan ? ${job.isActive}")
    println("Apakah job ini dibatalkan ? ${job.isCancelled}")
}

suspend fun updateVersion3() {
    delay(5_000)
    println("Update selesai")
}