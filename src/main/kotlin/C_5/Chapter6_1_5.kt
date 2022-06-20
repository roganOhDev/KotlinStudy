package C_5_4

class Person(val firstName: String, val lastName: String) {
    override fun equals(o: Any?) : Boolean {
        val otherPerson = o as? Person ?: return false

        return otherPerson.firstName == firstName && otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val p1 = Person("Rogan", "Oh")
    val p2 = Person("Rogan", "Oh")

    println(p1 == p2)

    println(p1.equals(42))
    println(p1.equals(null))
    println(p1.equals("StringTest"))

}