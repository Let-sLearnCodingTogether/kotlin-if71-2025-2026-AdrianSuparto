package LatihanKuis

class AgeValidator {
    fun check(age: Int) {
        if (age < 18) {
            throw IllegalArgumentException("Umur tidak valid")
        }
    }
}
