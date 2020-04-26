package basicsyntax

//fun basicsyntax.main() {
//    val items = listOf("apple", "banana", "kiwifruit")
//    for (item in items) {
//        println(item)
//    }
//}

//fun basicsyntax.main() {
//    val items = setOf("apple", "banana", "kiwifruit")
//    when {
//        "orange" in items -> println("juicy")
//        "apple" in items -> println("apple is fine too")
//    }
//}

fun main() {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach{ println(it) }
}