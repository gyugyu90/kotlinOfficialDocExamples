package basicsyntax

fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("인덱스 $index 번에 있는 항목은 ${items[index]} 입니다.")
    }
}