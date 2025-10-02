package Pertemuan6

fun hitungPanjangNama(name: String? = null): Int {
    if (name != null) return name.length else return 0
}

fun main() {
    println(hitungPanjangNama())
    println(hitungPanjangNama("Adrian")) // Output: 6
}
