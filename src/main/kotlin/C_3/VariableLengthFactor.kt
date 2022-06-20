package C_3

fun <T> newListOf(vararg values: T): List<T> = listOf(*values)

fun main() {
    println(newListOf(1, 2, 3))
    println(newListOf("a", "b", "c"))
}