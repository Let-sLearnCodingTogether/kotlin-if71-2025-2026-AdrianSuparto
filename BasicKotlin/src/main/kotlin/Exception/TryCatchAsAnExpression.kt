package Exception

import java.text.NumberFormat

fun parseStringToInt(input: String): Int {
    val hasil = try {
        input.toInt()
    } catch (error: NumberFormatException) {
        0
    }

    return hasil
}

fun main() {
    println(parseStringToInt("1"))
    println(parseStringToInt("TEST"))
}