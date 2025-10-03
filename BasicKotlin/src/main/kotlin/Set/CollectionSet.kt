package Set

fun main() {
    //Imutable
    val animals: Set<String> = setOf("Zebra", "Kucing")
    println(animals)

    //Mutable
    val fruits : MutableSet<String> = mutableSetOf("Apel","Jeruk","Nanas")
    println(fruits)


}