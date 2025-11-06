package nextOOP

open class Pegawai(val nama: String, val gajiDasar: Double) {
    open fun hitungGaji(): Double {
        return gajiDasar
    }
}

class Manager(nama: String, gajiDasar: Double) : Pegawai(nama, gajiDasar) {
    override
    fun hitungGaji(): Double {
        return gajiDasar * 3.0
    }
}

class Programmer(nama: String, gajiDasar: Double) : Pegawai(nama, gajiDasar) {
    override
    fun hitungGaji(): Double {
        return gajiDasar * 2.0
    }
}

fun main() {
    println("Gaji Manager    : ${Manager("Budi", 1000000.0).hitungGaji()}")
    println("Gaji Programmer : ${Programmer("Adrian", 1000000.0).hitungGaji()}")

    val dataPekerja: List<Pegawai> = listOf(
        Pegawai("Jovansa", 1000000.0),
        Pegawai("Joy", 3000000.0)
    )

    println("=========================================================")
    dataPekerja.forEach {
        println("Karyawan dengan nama ${it.nama} dengan gaji dasar: ${it.hitungGaji()}")
    }
}