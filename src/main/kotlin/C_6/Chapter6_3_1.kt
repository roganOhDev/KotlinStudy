package C_6

import java.io.BufferedReader

fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)
        }

        catch (e: java.lang.NumberFormatException) {
            result.add(null)
        }
    }

    return result
}

fun main() {
    val list : ArrayList<Int?>? = null
    val list2 : ArrayList<Int?> = ArrayList<Int?>()

    list2.add(null)
    list2.add(1)
    list2.add(1, null)
    println(list2)

}