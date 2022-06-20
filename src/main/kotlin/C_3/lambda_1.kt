package C_3

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Rogan", 29), Person("David", 30))
    val strings = listOf("abc","def")
    println(strings.flatMap { it.toList() })
}