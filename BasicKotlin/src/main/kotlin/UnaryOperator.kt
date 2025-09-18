fun main() {
    val a = 5
    val b = -a // hasil: -5
    val c = +a // hasil: 5 (Tidak mengubah nilai hanya menegaskan positif)

    var x = 10
    print(x++) // Post-increment cetak dulu (10), lalu x jadi 11
    print(++x) // Pre-increment cetak dulu (12), lalu x jadi (12)
    print(x--) // Post-decrement cetak dulu (10), lalu x jadi 9
    print(--x) // Pre-decrement cetak dulu (10), lalu x jadi 10
    
    val isTrue = false
    val result = !isTrue // hasil: True
}