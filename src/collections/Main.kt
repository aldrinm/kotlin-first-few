package collections

fun main() {
    var list = mutableListOf("a", "b", "c")
    println("list = ${list}")

    //returns a copy
    var listCopy = list.toList()
    println("listCopy = ${listCopy}")

    list.add("d")
    println("list = ${list} and listCopy = ${listCopy}")

    val reversedList = list.reversed() //returns a NEW reversed list
    println("reversedList = ${reversedList}")
    println("list = ${list}")

    list.reverse() //reverses the list in place
    println("list = ${list}")

    for (item in list) {
        println("item = ${item}")
    }

    //Maps
    val map = mapOf(1 to "one", 2 to "two")
    println("map = ${map}")

    val mapList = map.toList()
    println("mapList = ${mapList}")

    //Note: to create an immutable list
    var unmodifiableList = mutableListOf("Apple", "Banana", "Cherry")
    val modifiableList:List<String> = unmodifiableList

}