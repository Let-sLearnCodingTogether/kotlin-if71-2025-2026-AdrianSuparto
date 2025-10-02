package ArrayAdvanced

fun main() {
    val ages : Array<Int> = arrayOf(60, 25, 30,40 ,50)

    println("Ages : ${ages.joinToString()}")

    ages.sort()
    println("Age Sort : ${ages.joinToString()}")

    ages.sorted()
    println("Age Sorted : ${ages.joinToString()}")

    ages.reverse()
    println("Ages reverse : ${ages.joinToString()}")

    println("Slice : ${ages.slice(2..4).joinToString()}")
}