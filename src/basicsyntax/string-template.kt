package basicsyntax

//fun basicsyntax.main() {
//    var a = 1
//    val s1 = "a is $a"
//
//    a = 2
//
//    val s2 = "${s1.replace("is", "was")}, but now is $a"
//    println(s2)
//
//
//    println(maxOf(1, 4))
//}
//
//
//fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {

    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using 'x + y' yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x + y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }

}

fun main() {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")
}