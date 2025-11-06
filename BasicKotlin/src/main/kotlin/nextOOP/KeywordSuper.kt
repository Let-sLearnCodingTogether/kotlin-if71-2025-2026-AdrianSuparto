package nextOOP

open class HewanBaru {
    open fun suara() {
        println("Suara hewan")
    }
}

class Bebek() : HewanBaru() {
    override fun suara() {
        super.suara()
        println("Suara bebek : Kwek Kwek")
    }
}

fun main() {
    val bebek1 = Bebek()
    bebek1.suara()
}
