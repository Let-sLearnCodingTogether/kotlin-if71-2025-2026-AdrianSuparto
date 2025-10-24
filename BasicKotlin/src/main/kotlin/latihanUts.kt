fun main() {
    val stokBarang = mapOf(
        "Buku Tulis Sinar Dunia" to 45,
        "Pena Pilot G-2" to 78,
        "Indomie Goreng" to 120,
        "Teh Kotak" to 30,
        "Binder B5" to 12,
        "Kopi kapal api" to 55
    )

    print("Nama Barang:${stokBarang.keys.min()} jumlah barang: ${stokBarang.values.min()}")

    //atau pakai minornull
}
