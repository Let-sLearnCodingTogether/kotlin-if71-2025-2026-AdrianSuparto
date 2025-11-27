package FunctionalProgramming

fun operateOnNumber(a: Int, b: Int, operation: (Int, Int) -> Unit) {
    return operation(a, b)
}

fun main() {
    operateOnNumber(1, 3) { x, y -> println(x + y) }
    operateOnNumber(1, 3) { x, y -> println(x * y) }
    operateOnNumber(1, 3) { x, y -> println(x - y) }
}