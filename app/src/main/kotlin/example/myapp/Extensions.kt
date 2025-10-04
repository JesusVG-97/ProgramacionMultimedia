package example.myapp
fun String.hasSpaces() = indexOf(" ") != -1
fun AquariumPlant.isRed() = color == "red"
val AquariumPlant.isGreen: Boolean
    get() = color == "green"
fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}