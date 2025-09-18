fun main() {
    var totalBelanja = 0.0
    val itemA = 25000
    val itemB = 15000
    val diskon = 10000

    // Menghitung biaya layanan sebagai persentase dari total belanja
    var biayaLayanan = totalBelanja / 100

    println("Status Awal -> Total Belanja: $totalBelanja")

    // Menambahkan harga item A ke total belanja
    totalBelanja += itemA
    totalBelanja += itemA
    totalBelanja += itemA
    println("Setelah Item A -> Total Belanja: $totalBelanja")

    // Menambahkan harga item B ke total belanja
    totalBelanja += itemB
    totalBelanja += itemB
    println("Setelah Item B -> Total Belanja: $totalBelanja")

    // Menghitung biaya layanan berdasarkan total belanja terbaru

    // Menghitung total belanja setelah diskon dan biaya layanan
    val totalSetelahDiskon = totalBelanja - diskon
    println("Setelah Diskon -> Total Belanja: $totalBelanja")
    biayaLayanan = totalSetelahDiskon / 100

    // Menghitung biaya layanan berdasarkan total belanja terbaru
    val totalAkhir = totalSetelahDiskon + biayaLayanan
    println("Ditambah Biaya Layanan: $totalSetelahDiskon")
    println("==================================================")
    println("Total Akhir yang harus dibayar ($biayaLayanan): $totalAkhir")
    println("==================================================")
}
