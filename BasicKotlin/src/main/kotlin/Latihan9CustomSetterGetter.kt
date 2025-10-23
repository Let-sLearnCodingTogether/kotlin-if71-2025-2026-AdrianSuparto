class PersegiPanjang(val panjang: Double, val lebar: Double) {
    val luas: Double
        get() = panjang * lebar
}

fun main() {
    val pl = PersegiPanjang(2.0,2.0)

    println(pl.luas)
}

