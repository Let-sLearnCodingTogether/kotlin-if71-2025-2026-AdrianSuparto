package Pertemuan6

fun printUser(firstName: String,vararg users: String) {
    println(firstName)
    for (name in users) {
        println(name)
    }
}

fun main() {
  printUser("Test","Adrian","Chandra")  // panggil fungsi untuk dapatkan array


}
