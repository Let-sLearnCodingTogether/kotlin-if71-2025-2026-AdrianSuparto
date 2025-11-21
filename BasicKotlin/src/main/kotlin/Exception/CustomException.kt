package Exception

import nextOOP.HasilOperasi

class SaldoKurangException(msg: String) : Exception(msg)

val saldo: Int = 100_000
fun tarikTunai(jumlah: Int) {
    if (jumlah > saldo) {
        throw SaldoKurangException("Sadar diri saldo kurang")
    }
    println("Penarikan berhasil")
}

fun main() {
    try {
        tarikTunai(200_000)
    } catch (error : SaldoKurangException) {
        println("Error saldo kurang ${error.message}")
    }
}