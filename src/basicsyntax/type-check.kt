package basicsyntax

//fun basicsyntax.getStringLength(obj: Any): Int? {
//
//    if (obj is String) {
//        // 블록에 접근하게 되면 String 타입으로 안전하게 형변환됨
//        return obj.length
//    }
//
//    // 형변환되는 블록 밖에서는 Any 타입을 그대로 사용
//    return null
//}

fun main() {
    fun printLength(obj: Any) {
        println("'$obj' String의 길이는 ${getStringLength(obj) ?: "... 에러입니다. 스트링이 아니네요..;;"} ")
    }

    printLength("아무스트링")
    printLength(1000)
    printLength(listOf(Any()))
}

//fun basicsyntax.getStringLength(obj: Any): Int? {
//    if (obj !is String) return null
//
//    // obj는 자동으로 String으로 형변환됩니다.
//    return obj.length
//}

fun getStringLength(obj: Any): Int? {
    // obj는 && 오른쪽 구문부터 String으로 형변환됩니다.
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}