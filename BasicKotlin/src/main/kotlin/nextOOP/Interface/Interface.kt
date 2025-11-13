package nextOOP.Interface

interface Vehicle {
    fun accelerate()
    fun stop()
}

class Motor : Vehicle {
    override fun accelerate() {
        println("accelerator")
    }

    override fun stop() {
        println("stop")
    }

}

fun main() {
    val motor = Motor()
    motor.accelerate()
    motor.stop()
}