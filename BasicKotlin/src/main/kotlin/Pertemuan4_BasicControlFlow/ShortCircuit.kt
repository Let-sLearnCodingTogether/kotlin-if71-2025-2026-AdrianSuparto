package Pertemuan4_BasicControlFlow

fun main() {
    val isLoggedIn = true //false

    if (isLoggedIn || (5 / 0 == 0)){
        println("User has access")
    }else{
        println("Access Denied")
    }

// Exception in thread "main" java.lang.ArithmeticException: / by zero
}