fun main() {
    var a: Byte = 3
    var b: Short = 5

    println("a = $a and b = $b")

    var c: Int = 23
    var d: Int = 24
    println("c = $c and d = $d")
    d = c
    println("c = $c and d = $d")
    c = 50
    println("c = $c and d = $d") //Note: just like primitives and not by ref! Page 39 of the book is misleading!


    var e: Int = 33
    var f: Long? = null //can be null
    println("e=$e and f=${f.hashCode()}") //wtf! can de-reference null ?
    f = e.toLong()
    println("e=$e and f=$f")


    //Arrays
    var myarray = arrayOf(1, 2, 3)
    println("myarray = ${myarray}")
    println(" first = ${myarray[0]}")
}