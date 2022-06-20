package C_6

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun <T: Any> printHashCodeUpperBound(t: T) {
    println(t?.hashCode())
}

fun <T: Any?> printHashCodeUpperBoundEvis(t: T) {
    println(t?.hashCode())
}

fun main() {
    printHashCode(null)
//    printHashCodeUpperBound(null)
    printHashCodeUpperBoundEvis(null)
}
