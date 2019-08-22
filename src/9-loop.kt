fun main() {
    var arrInt = arrayListOf(1,5,3,8,43)

    println(arrInt)
    var arrIntx2 = arrInt.onEach { it*2 }

    println(arrIntx2)
}