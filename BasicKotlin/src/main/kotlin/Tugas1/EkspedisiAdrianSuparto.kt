package Tugas1

fun main() {
    val NAMA_PETUALANG = "Adrian Suparto"
    val KAPASITAS_TAS = 20
    var totalBeratBawaan: Double = 0.0
    var sisaKapasitas: Double = 0.0
    var nomorBarang = 1

    println("Kalkulator Logistik untuk Ekspedisi Adrian Suparto dimulai... \n")

    while (sisaKapasitas >= 0) {
        println("--- Memasukkan Barang ---")
        print("Masukkan nama barang: ")
        val namaBarang: String = readln()

        print("Masukkan berat untuk '${namaBarang}' (kg): ")
        val beratBarang = readln().toDoubleOrNull() ?: 0.0

        totalBeratBawaan += beratBarang

        sisaKapasitas = KAPASITAS_TAS - totalBeratBawaan

        if (totalBeratBawaan > 20) {
            println(
                "\nBahaya, Kelebihan Muatan! Berat saat ini: ${totalBeratBawaan} kg. Kapasitas hanya ${KAPASITAS_TAS} kg."
            )
            println("Proses kalkulasi logistik selesai.")
        } else if (totalBeratBawaan == 20.0) {
            println("\nOptimal! Tas milik ${NAMA_PETUALANG} sekarang penuh dengan sempurna.")
            println("Proses kalkulasi logistik selesai.")
            break
        } else {
            println("Barang berhasil dimasukkan. Sisa kapasitas tas: ${sisaKapasitas}  kg. \n")

            nomorBarang++
        }
    }


}