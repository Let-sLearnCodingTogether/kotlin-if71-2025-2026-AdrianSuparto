package FunctionalProgramming

// Faktorial biasa (tidak-tail recursive)
fun factorial(n: Int): Long {
    return if (n == 1) 1 else n * factorial(n - 1)
}

tailrec fun factorial2(n: Int, acc: Long = 1): Long {
    return if (n == 1) acc else factorial2(n - 1, acc * n)
}

tailrec fun fibonnaci(n: Int, a: Long = 0, b: Long = 1): Long {
    return if (n == 0) a else fibonnaci(n - 1, b, a + b)
}

fun main() {
    val factorial2 = factorial(10)
    println(factorial2)
}