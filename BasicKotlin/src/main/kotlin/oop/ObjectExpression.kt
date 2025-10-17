package oop

fun main() {
    val person = object {
        val name =  "Adrian"
        val age = 20
        fun  greet(){
            println("Hai")
        }
    }
    println(person.greet())

}