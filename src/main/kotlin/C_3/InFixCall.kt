package C_3

fun main() {
    val (number, name) = 1 to "one"

    println(number)
    println(name)

    val (a, b) = Pair(1, "a")
    val collection = listOf("a")
    for ((index, value) in collection.withIndex()) {

    }
}