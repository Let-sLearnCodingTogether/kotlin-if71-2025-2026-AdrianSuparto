package Set

fun main() {
    //Imutable
    val animals: MutableSet<String> = mutableSetOf()

    animals.add("Zebra")
    animals.add("Kucing")
    println(animals)

    animals.remove("Kucing")
    println(animals)

    animals.addAll(listOf("Ayam","Babi","Anjing","Monyet"))
    println(animals)

    animals.removeAll(listOf("Ayam","Babi","Anjing"))
    println(animals)

    animals.retainAll(listOf("Zebra"))
    println(animals)

    animals.clear()
    println(animals)

}