import java.util.*

fun getMax(a: Int, b: Int) = if (a>b) a else b
fun temp(a: Int, b: Int) : Int {
    if (a>b) return a
    else return b
}
fun getGrade(score: Int) = when(score) {
    in 0..49 -> "Grade F"
    in 50..59 -> "Grade D"
    in 60..69 -> "Grade C"
    in 70..79 -> "Grade B"
    in 80..100 -> "Grade A"
    else -> " "
}

fun main() {
    val sc = Scanner(System.`in`)
    var score = sc.nextInt()

    if (score in 0..100) {
        println("Valid")

        var grade = if (score in 0 until 50) {
            "Grade F"
        } else if (score in 50..59) {
            println("Orarorarara Doraemon")
            "Grade D"
        } else if (score in 60 until 70) {
            "Grade C"
        } else if (score in 70..79) {
            "Grade B"
        } else if (score in 80..100) {
            "Grade A"
        } else {
            " "
        }

        println(grade)
        println(getGrade(55))
    } else {
        println("Invalid")
    }

    var isPassed = if (score >= 50) true else false

    println(getMax(50, 70))
}