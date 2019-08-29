import java.lang.Exception
import java.lang.IllegalArgumentException

// normal function
fun sum(a: Int, b: Int) : Int {
    return a+b
}

// single expression function
fun multiply(a: Double, b: Double) = a*b

// single expression function
// with if
fun divide(a: Double, b: Double) = if (b == 0.0) {
    IllegalArgumentException("Can't divide by $b\n")
} else {
    a/b
}

fun main() {
    val result = divide(40.0,0.0)

    if (result is Exception) {
        System.err.println(result)
    } else {
        println("result is $result")
    }
    print("Hello")
}