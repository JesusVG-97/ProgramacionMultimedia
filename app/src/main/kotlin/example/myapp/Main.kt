package example.myapp

import example.myapp.decor.Color
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
    //makeFish()
    //makeDecorations()
    println(Color.RED)
    println(Color.BLUE)
    println(Color.GREEN)
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}