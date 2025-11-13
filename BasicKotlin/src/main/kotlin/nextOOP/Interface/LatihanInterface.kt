package nextOOP.Interface

interface Elektronic {
    val brand : String

    fun turnOn()
    fun turnOff()

    fun cleanDrive() {
        println("Membersihkan debu dari perangkat $brand")
    }
}

class Fan(override val brand: String) : Elektronic {

    override fun turnOn() {
        println("Kipas angin merek $brand berputar")
    }

    override fun turnOff() {
        println("Kipas angin merek $brand berhenti")
    }

}

class SmartLight(override val brand: String) : Elektronic {
    override fun turnOn() {
        println("Lampu $brand hidup")
    }

    override fun turnOff() {
        println("Lampu $brand mati")
    }

}
fun main() {
    val kipas = Fan("Mitociba")
    kipas.turnOn()
    kipas.turnOff()

    println()
    val lampu = SmartLight("Philip")
    lampu.turnOn()
    lampu.turnOff()
    lampu.cleanDrive()
}