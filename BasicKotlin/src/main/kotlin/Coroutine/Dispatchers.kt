package Coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch(Dispatchers.IO) {
        println("Dispacthers.IO")
    }

    launch(Dispatchers.Default) {
        println("Dispacthers.Defauly=t")
    }
    println("Selesai")
}