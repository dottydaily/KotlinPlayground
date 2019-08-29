package classPractice

fun main() {
    var ani1 = Animal("Ong", 21, 8, 150)
    var ani2 = Bird("Nob", 1
        , 1, "Black")
    var ani3 = Animal("Isoon")

    println(ani1)
    println(ani2)

    ani1.move()
    ani2.move()

    println(ani1)
    println(ani2)

}