fun main() {
    val myInt : Int = 30000
    val myShort : Short = myInt.toShort()

    println(myShort)

    val myInt2 : Int = 40000
    val myShort2 : Short = myInt2.toShort()

    println(myShort2)

    println(Integer.toBinaryString(myInt2).padStart(length = 32, padChar = '8'))
    println()
    // biner dari 40_000 = 1

    //ada di foto caranya tanggal 12 September 2025
}