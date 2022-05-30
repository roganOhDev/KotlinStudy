import java.util.LinkedList

fun main(args: Array<String>) {
    val hashSet = hashSetOf(1, 4, 5, 3)
    println("hashSetOf(1,4,5,3) :  $hashSet")
    val linkedSet = linkedSetOf(1, 4, 5, 3)
    println("linkedSetOf(1,4,5,3) :  $linkedSet")
    val set = setOf(1, 4, 5, 3)
    println("setOf(1,4,5,3) :  $set")
    val mutableSet = mutableSetOf(1, 4, 5, 3)
    println("mutableSetOf(1,4,5,3) :  $mutableSet")
    val sortedSet = sortedSetOf(1, 4, 5, 3)
    println("sortedSetOf(1,4,5,3) :  $sortedSet")


    hashSet.add(8)
    hashSet.add(9)
    println("add 8, 9 into hashSet :  $hashSet")

    linkedSet.add(8)
    linkedSet.add(9)
    println("add 8, 9 into linkedSet :  $linkedSet")

    mutableSet.add(8)
    mutableSet.add(9)
    print("add 8, 9 into mutableSet :  $mutableSet\n")


    sortedSet.add(8)
    sortedSet.add(9)
    sortedSet.add(0)
    sortedSet.add(7)
    print("add 8,9 into sortedSet :  $sortedSet\n")


//    set.add(8)
//    set.add(9)

    val list = List(5) { i -> i }
    val mutableList = MutableList(5, { i -> i })
    val arrayList = ArrayList<Int>()
    val linkedList = LinkedList<Int>()
    val listOf = listOf(0, 1, 2, 3, 4)
    val mutableListOf = mutableListOf(0,1,2,3,4)
    val arrayListOf = arrayListOf(0,1,2,3,4)

    val array = Array<Int>(3, { i -> i })
    val array2 = arrayOf(1,2,3)
    val arrayOfNulls = arrayOfNulls<Int>(3)


    mutableList.add(3)
    arrayList.add(3)
    linkedList.add(0,3)

    arrayOfNulls[0] = 0
    array[0] = 3

//    val map = Map<String, Int>("a" to 1, )
//    val map1 = Map<String, Int>
    val map = mapOf("a" to 1, "b" to 2)
    map.get("a")
    map["a"]
    map.plus(Pair("c",3))
    val afterPlusMap = map.plus(Pair("c",3))

    val hashMap = HashMap<String, Int>()
    val hashMap2 = hashMapOf("a" to 1)
    hashMap2.put("c", 3)
    hashMap2["d"] = 3
    println(hashMap2)

    val mutableMap = mutableMapOf("a" to 1)
    val linkedHashMap = linkedMapOf("a" to 1)
    val sortedMap = sortedMapOf("a" to 1)

    println(afterPlusMap)
    println(hashMap)
    println(hashMap2)
    println(mutableMap)
    println(linkedHashMap)
    println(sortedMap)

}
