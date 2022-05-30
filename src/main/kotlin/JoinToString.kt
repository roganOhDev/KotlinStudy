package stringUtil

val valName: String = "Rogan"
var varName: String = "Rogan Oh"
const val constName: String = "ROGAN_OH"

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list.joinToString(";", "", ""))
    println(list.joinToString(";", postfix = "", prefix = ""))
    println(list.joinToString(";", prefix = "!"))
}

fun <T> Collection<T>.joinToString(
    separator: String,
    prefix: String = "{",
    postfix: String = "}"
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

class A{
    companion object{
        val name = "static"
        fun a() {
            println("name :  $name")
        }
    }
}