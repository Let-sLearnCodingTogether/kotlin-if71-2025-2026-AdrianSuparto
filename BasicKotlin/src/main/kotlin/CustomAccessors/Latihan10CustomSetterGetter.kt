package CustomAccessors

class Mahasiswa(nilaiIpk : Double) {
    var  nilaiIpk : Double = nilaiIpk
        get() = field
        set(value) {
            if (value< 0.0){
                field = 0.0
            }else if (value>4.0){
                field = 4.0
            }else field

        }
}

fun main() {
    val nilaiMhs = Mahasiswa(0.0)

    nilaiMhs.nilaiIpk = 5.0
    println(nilaiMhs.nilaiIpk)
}