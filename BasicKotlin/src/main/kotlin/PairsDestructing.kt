fun main() {
//    val firstUser : Pair<String, Byte> = Pair("User 1", 20)
//
//    //destructuring
//    val (username, age) = firstUser
//
//    println(username)
//    println(age)

    val firstUser: Triple<String, Byte, Boolean> = Triple("User 1", 20, true)

    //destructuring
    val (username, age, fact) = firstUser
    println(username)
    println(age)
    println(fact)

}