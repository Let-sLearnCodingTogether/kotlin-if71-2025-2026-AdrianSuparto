package FunctionalProgramming

// Contoh Pure Function
fun addPureFunction(a : Int, b : Int) : Int = a+b


// Contoh impure function
var count = 0 // anggap saja ini global varible
fun addPureFunctionImpureFunction(a : Int) : Int {
    count += 1
    return a + count
}

fun main() {
    addPureFunction(1,2) //3
    addPureFunction(1,2) //3
    addPureFunction(1,2) //3

    println(addPureFunctionImpureFunction(1)) //2
    println(addPureFunctionImpureFunction(1)) //3
}