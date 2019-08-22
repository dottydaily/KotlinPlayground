import java.util.*

fun main() {
    print("Hello ")
    println("Thursday, August 22")
    System.out.printf("Hello %s\n", "CNC X")
    println("Hello %s".format("CNC X"))

    var input = readLine() // return String
    if (input is String) {
        println("Yes")
    }

    val sc = Scanner(System.`in`)
    println(sc.nextInt()+10)


}