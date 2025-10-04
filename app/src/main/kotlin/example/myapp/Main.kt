package example.myapp

/*import example.myapp.decor.Color
import example.myapp.decor.Direction
import example.myapp.decor.makeDecorations

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}
fun main () {
    /*makeFish()
    makeDecorations()
    println(Color.RED)
    println(Color.BLUE)
    println(Color.GREEN)
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
    */
}
*/
fun main() {
    // Step 1: Make some pairs and triples

    // Create a pair
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

    // Create a triple
    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())

    // Pair where the first part is itself a pair
    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}")
    println("${equipment2.first.second}")

    // Step 2: Destructure some pairs and triples

    val equipment3 = "fish net" to "catching fish"
    val (tool, use) = equipment3
    println("$tool is used for $use")

    val numbers2 = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers2
    println("$n1 $n2 $n3")
}
