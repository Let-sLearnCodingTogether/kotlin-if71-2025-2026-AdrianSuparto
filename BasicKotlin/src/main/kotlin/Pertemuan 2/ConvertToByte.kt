fun main() {
    var myInt : Int =120
    val myByte : Byte = myInt.toByte()

    println(myInt)

    var myInt2 : Int =130
    val myByte2 : Byte = myInt.toByte()

    println(myInt2)

    println()

    // Byte : 8bit
    // 100000010
    // Kalau bit pertama 0 -> Positif
    // Kalau bit pertama 1 -> Negatif

    // Invert biner (0 -> 1, 1->0)
    // 011111101 ( 125 + 1 = -126)
}