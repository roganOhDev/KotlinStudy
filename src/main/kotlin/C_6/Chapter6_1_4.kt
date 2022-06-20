package C_5_3

import C_5_2.countryName

class Address(
    val StrretAddress: String, val zipCode: Int,
    val city: String, val country: String?
)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address")
    with( address ) {
        println(StrretAddress)
        println("$zipCode $city, $country")
    }
}

fun Person.runPrint() {
    val address = this.company ?: run {
        println("Error!!")
        throw IllegalArgumentException("No Company")
    }
}

fun main() {
//    printShippingLabel(Person("Rogan", null))
//    printShippingLabel(Person("DongGeun", Company("Chequer", null)))
//    printShippingLabel(Person("DongGeunOh", Company("Chequer", Address("Magok", 7541, "Seoul", null))))
//    printShippingLabel(Person("Dong_Geun_Oh", Company("Chequer", Address("Magok", 7541, "Seoul", "Korea"))))

    Person("Rogan", null).runPrint()
}