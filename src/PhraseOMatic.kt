fun main() {
    val wordArr1 = arrayOf("24/7", "multi-tier", "B2B", "dynamic", "pervasive")
    val wordArr2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArr3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArr1.size
    val arraySize2 = wordArr2.size
    val arraySize3 = wordArr3.size

    var i = 0
    while (i < 5) {
        val rand1 = (Math.random() * arraySize1).toInt()
        val rand2 = (Math.random() * arraySize2).toInt()
        val rand3 = (Math.random() * arraySize3).toInt()
        println("${wordArr1[rand1]} ${wordArr2[rand2]} ${wordArr3[rand3]}")
        i++
    }
}