package C_5_2

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.uppercase()
    println(allCaps)
}

class Address(
    val StrretAddress: String, val zipCode: Int,
    val city: String, val country: String?
)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName(): String = this.company?.address?.country ?: "Unknown"

fun main() {
    printAllCaps("abc")
    printAllCaps(null)

    println(Person("Rogan", null).countryName())
    println(Person("DongGeun", Company("Chequer", null)).countryName())
    println(Person("DongGeunOh", Company("Chequer", Address("Magok", 7541, "Seoul", null))).countryName())
    println(Person("Dong_Geun_Oh", Company("Chequer", Address("Magok", 7541, "Seoul", "Korea"))).countryName())

}
