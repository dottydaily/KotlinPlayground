import java.util.*

fun main() {
    var name = "Pornpat"
    var nameCharArray = name.toCharArray()

//    for (char in nameCharArray) {
//        println(char)
//    }

    // it = iterator
    nameCharArray.forEach { println(it) }

    var arrInt = arrayOf(1,2,3,5,9)
    var arrayListInt = arrayListOf<Int>(1,2,3,5,9)
    var listInt = listOf<Int>(1,2,3,5,9)
    var nullArray = arrayOfNulls<Int>(10)

    arrInt.forEach { println(it) }

    println("================")
    println(Arrays.toString(arrInt))
    println(arrInt.toList())
    println(arrayListInt)
    println(listInt)
    println(Arrays.toString(nullArray))

}