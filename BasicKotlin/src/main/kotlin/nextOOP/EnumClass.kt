package nextOOP

import java.time.DayOfWeek

enum class dayOfTheWeek {
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu,
    Minggu
}

fun main() {
    val days = dayOfTheWeek.values()

    days.forEach {
        println("Hari: ${it.ordinal}. ${it.name}")
    }

    println(dayOfTheWeek.valueOf("Senin"))
//    println(dayOfTheWeek.valueOf("senin")) case sensitif

    val today = dayOfTheWeek.valueOf("Senin")
    when(today) {
        dayOfTheWeek.Senin -> println("Yah, senin lagi")
        dayOfTheWeek.Selasa -> println("Hari selasa lagi")
        dayOfTheWeek.Sabtu, dayOfTheWeek.Minggu -> println("Hari Leborr")
        else -> println("Hari lain")
    }
}