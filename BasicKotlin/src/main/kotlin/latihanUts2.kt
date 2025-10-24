class Karyawan(val nama:String,val id: String, val gajiPokok:Double){

    fun tampilkanProfil(){
        println("Nama Karyawan: $nama")
        println("Id Karyawan  : $id ")
    }

    fun hitungGajiBulanan(jumlahHariMasuk: Int) : Double{

        val gajiBulanan = (jumlahHariMasuk.toDouble()/22)*gajiPokok

        return gajiBulanan
    }
}

fun main() {
    val karyawanA = Karyawan("Michael", "K001", 1000000.0 )
    val karyawanB = Karyawan("Jovan", "K002", 2000000.0 )

    karyawanA.tampilkanProfil()
    println("${karyawanA.hitungGajiBulanan(11)}")
    println("============================================")
    karyawanB.tampilkanProfil()
    println("${karyawanB.hitungGajiBulanan(22)}")

}