import kotlin.random.Random

fun isOneDigit(number : Int) = (number in 0..9)

fun main() {
    val listOfNumber = listOf<Int>().toMutableList()
    for (round in 1..10) {
        listOfNumber.add(Random.nextInt(-100, 101))
    }
    println(listOfNumber)
    println(listOfNumber.filter { it >= 0 })
    println(listOfNumber.filter { number -> number >= 0})

    println(listOfNumber.filter { isOneDigit(it) })
    println(listOfNumber.filter { number -> isOneDigit(number) })

    if (22 in listOfNumber) {
        println("We have 22 in this random list.")
    } else println("We didn't random 22 to this list.")
}