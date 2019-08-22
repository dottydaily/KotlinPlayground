fun main() {
    var normalStr = "Computer Science\nKasetsart University\nBangkhen"
    var rawString = """
        Computer Science
        Kasetsart University
        Bangkhen
    """.trimIndent()
    println(normalStr)
    println(rawString)

    var rawStr2 = """
        >>>Computer Science
          >>>Kasetsart University
  >>>Bangkhen
    """.trimMargin(">>>")

    println(rawStr2)
}