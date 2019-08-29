// High-Order Function
// : function that using other function as param
fun calculate(a: Double, b: Double,
              method: (Double, Double) -> Double) = method(a,b)

fun main() {
    // theses called "Anonymous Class"
    // same as interface callback concept in Java

    val additonal : (Double, Double) -> Double = {
        a, b -> a+b
    }
    val subtract : (Double, Double) -> Double = {
        a, b -> a-b
    }
    val multiply : (Double, Double) -> Double = {
            a, b -> a*b
    }
    val divide : (Double, Double) -> Double = {
            a, b -> a/b
    }

    println(calculate(10.0, 20.0, additonal))
    println(calculate(10.0, 20.0, subtract))
    println(calculate(10.0, 20.0, multiply))
    println(calculate(10.0, 20.0, divide))
}