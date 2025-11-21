package Exception

data class Barang(val nama: String, var stok:Int)

class StokHabisException(msg: String) : Exception(msg)

fun beliBarang(barang: Barang, jumlahBeli:Int){
    if (jumlahBeli>barang.stok){
        throw StokHabisException("Gagal beli ${barang.nama}. Stok hanya sisa ${barang.stok}")
    }
    println("Berhasil membeli $jumlahBeli ${barang.nama}")
    barang.stok -= jumlahBeli
}

fun main() {
    try {
        val barang : Barang = Barang("Kipas",10)
        beliBarang(barang, 1)
        beliBarang(barang, 15)
    } catch (error: StokHabisException) {
        println(error.message)
    }


}