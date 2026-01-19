package LatihanKuis


fun main() {
    try {
        Validator.checkAge(15)
    } catch (e: IllegalArgumentException) {
        println("Error dari Java: ${e.message}")
    }
}
