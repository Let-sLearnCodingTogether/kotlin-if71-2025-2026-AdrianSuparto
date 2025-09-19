package Pertemuan4_BasicControlFlow

fun main() {
    val user: Array<String> = arrayOf("User 1", "User 2", "User 3")
    println(user[0])
    println(user.get(1))

    //cara update value di index tertentu
    user.set(2,"User 3 Update")
    println(user[2])

    //cara update value di index tertentu
    user[2] = "User 3 Update User"
    println(user[2])

    println("Size: ${user.size}")
}