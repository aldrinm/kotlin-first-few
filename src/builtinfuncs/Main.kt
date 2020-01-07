package builtinfuncs

data class Grocery(val name: String, val category: String,
                   val unit: String, val unitPrice: Double,
                   val quantity: Int)

fun main() {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    print("Minimum price: ")
    println(groceries.minBy { it.unitPrice })

    print("Total quantity:")
    println(groceries.sumBy { it.quantity })

    print("Total price:")
    println(groceries.sumByDouble { it.quantity * it.unitPrice})


    groceries.forEach {
        println(it.name)
    }


    val ints = listOf(1, 2, 3, 4)
    val total = ints.fold(0) { rt, item -> rt + item}
    println("total = ${total}")
}