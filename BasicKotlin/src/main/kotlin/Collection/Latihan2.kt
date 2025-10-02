package Collection

fun main() {
    val mataKuliahWajib : List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "Algoritma dan Struktur data"
    )

    println("List mata kuliah wajib : $mataKuliahWajib")
    println("Size list matakuliah wajib : ${mataKuliahWajib.size}")

    println("Index pertama mata kuliah wajib : ${mataKuliahWajib[0]}")

    val mataKuliahUppercase = mataKuliahWajib.map {
        it.uppercase()
    }

    println(mataKuliahUppercase)

    val mataKuliahLebihDariNKarakter = mataKuliahWajib.filter {
        it.length>10
    }

    println("Matakuliah lebih dari 10 karakter : $mataKuliahLebihDariNKarakter")
}