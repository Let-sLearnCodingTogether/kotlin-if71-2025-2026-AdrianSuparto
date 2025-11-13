package nextOOP.Interface

interface SpaceVehicle {
    fun accelerate()

    fun stop(){
        println("Stop")
    }
}

class LightSpace : SpaceVehicle {
    override fun accelerate() {
        println("Accelerate")
    }

//    override fun stop() {
//        println("Stop override")
//    }
}

fun main() {
    val lightSpaceOne = LightSpace()
}