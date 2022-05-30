class Human(val id: Int, val name: String, val address: String)

fun Human.validateBefore() {
    fun validate(value: String, filedName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save User ${id}: empty $filedName"
            )
        }
    }
    validate(name, "Name")
    validate(address, "Name")
}
fun saveHuman(human: Human) {
    human.validateBefore()
}

fun main() {
    saveHuman(Human(1, "",""))
}