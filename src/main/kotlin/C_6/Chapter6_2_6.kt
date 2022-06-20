package C_6

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

//fun nonFail(message: String): Nothing {
//    println(message)
//    return null
//}

fun nonFail2(message: String): Nothing? {
    println(message)
    return null
}

//fun method(message: String): Any {
//    println("Hello World!")
//}

fun method2(message: String): Any? {
    println("Hello World!")
    return null
}
