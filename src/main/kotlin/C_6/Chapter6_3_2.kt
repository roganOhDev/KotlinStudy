package C_6

fun <T> copyElements(
    source: Collection<T>,
    target: MutableCollection<T>
): MutableCollection<T> {
    for (item in source) {
        target.add(item)
    }

    return target
}

fun main() {
    val a = listOf<Int>(1, 2, 3, 4, 5)
    val c = a.toMutableList()
    var b :MutableCollection<Int> = arrayListOf(1)
    b = copyElements(a,b)

    c.add(6)

    println(a)
    println(b)
}
