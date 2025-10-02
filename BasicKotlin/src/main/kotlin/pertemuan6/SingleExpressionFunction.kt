package pertemuan6

fun main() {
    println("Print Hasil Perkalian : ${perkalian(5,2)}")

    val result = perkalian(5,10)
    println("Hasil Perkalian: $result")
}

fun perkalian(
    firstNumber: Int,
    secondNumber : Int) : Int = firstNumber*secondNumber

