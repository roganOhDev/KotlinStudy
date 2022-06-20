package C_6

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Fill Blank")
    } else {
        println("Next")
    }
}

fun main() {
    verifyUserInput(null)
    verifyUserInput("")
    verifyUserInput("a")
}

