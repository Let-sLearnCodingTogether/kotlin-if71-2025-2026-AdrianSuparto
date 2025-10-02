package pertemuan6

fun main() {
    println("Sum result : ${sum(1,2)}")

    val result = sum(10,5)
    println(result)
}

fun sum(firstNumber: Int, secondNumber : Int) : Int{
    return firstNumber+secondNumber
}

