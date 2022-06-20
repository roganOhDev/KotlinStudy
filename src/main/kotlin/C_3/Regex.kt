package C_3

fun main() {
    val filePath = "/Users/ohdonggeun/workspace/kotlinStudy.kt"
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(filePath)
    if (matchResult != null) {
        val (directory, filename, extention) = matchResult.destructured
        println("dir : $directory, name : $filename, ext: $extention")
    }

    //
//    val filePath2 = "/Users/ohdonggeun/workspace/kotlinStudy/e/f/g/h/i/j/k/l.kt"
//    val regex2 = """(.+)/(.+)/(.+)/(.+)/(.+)/(.+)/(.+)/(.+)/(.+)/(.+)/(.+)\.(.+)""".toRegex()
//    val matchResult2 = regex2.matchEntire(filePath2)
//    if (matchResult2 != null) {
//        val (a, b, c, d, e, f, g, h, i, j, k, l) = matchResult2.destructured
//        println(a + b + c + d + e + f + g + h + i + j + k + l)

    val (name, zone) = NetworkZone("test", "0.0.0.0/0")
    println("name :  $name,  zone:  $zone")

    val dollor = "DOLLOR"
    val price = """$99.9"""
    val price1 = """${'$'}99.9"""
    val price2 = """$dollor 99.9"""
    val price3 = """${'$'}dollor 99.9"""
    println("price :  $price")
    println("price1 :  $price1")
    println("price2 :  $price2")
    println("price3 :  $price3")
}

class NetworkZone(private vararg val stringList: String){
    operator fun component1(): String = stringList[0]
    operator fun component2(): String = stringList[1]

}
