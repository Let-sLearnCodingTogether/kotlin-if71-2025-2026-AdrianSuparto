package Pertemuan6

fun main() {
    // Null
    var student: String = "Budi"
    println(student)

//    student = null

    var prodiIf: String? = "IF"
    println(prodiIf?.length)
    prodiIf = null
    println(prodiIf?.length)
    println(prodiIf)
}