import kotlin.collections.component1
import kotlin.collections.component2

fun main() {
    val daftarJudulBuku: List<String> = listOf(
        "Laskar Pelangi",
        "Bumi Manusia",
        "Filosofi Teras",
        "Laskar Pelangi"
    )
    val koleksiGenre: MutableSet<String> = mutableSetOf("Novel", "Filsafat", "Sejarah", "Novel")

    val inventarisBuku: MutableMap<String, String> = mutableMapOf(
        "978-602-03-8591-6" to "Laskar Pelangi",
        "978-979-3062-79-2" to "Bumi Manusia",
        "978-602-06-3534-7" to "Filosofi Teras",
        "978-602-03-8591-6" to "Laskar Pelangi"
    )


    println("--- 1. Inisialisasi Data ---")
    println("List judul buku berhasil dibuat (mengandung duplikat) ${daftarJudulBuku}")
    println("Set genre berhasil dibuat (hanya berisi nilai unik) ${koleksiGenre}")
    println("Map inventaris buku berhasil dibuat (key unik) ${inventarisBuku.keys}")


    println("\n--- 2. Manipulasi dan Analisis Data ---")
    println("Judul buku dengan ISBN 978-979-3062-79-2 adalah: ${inventarisBuku.get("978-979-3062-79-2")}")
    inventarisBuku["978-623-91289-8-2"] = "Atomic Habits"


    println("isi inventaris sekaerang: ${inventarisBuku.entries}")
    println("Jumlah genre unik yang ada di toko: ${koleksiGenre.size}")

    println("Daftar semua judul buku yang tercatat:")
    daftarJudulBuku.forEach {
        println("- $it")
    }
}


// Aksi	Sintaks	Keterangan
//Tambah / update data	map[key] = value	jika key baru → tambah; jika key lama → ganti value
//Tambah data baru saja	map.putIfAbsent(key, value)	tidak ganti kalau sudah ada
//Tambah data	map.put(key, value)	sama seperti map[key] = value
//Hapus data	map.remove(key)	hapus berdasarkan key
//Loop isi map	map.forEach { (k, v) -> ... }	menelusuri seluruh isi map