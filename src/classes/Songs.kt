package classes

class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}

fun main() {
    val song1 = Song("Last christmas", "Wham!")
    val song2 = Song("Sant claus is coming to town", "Anon")

    song1.play()
    song1.stop()
    song2.play()
    song2.stop()
}