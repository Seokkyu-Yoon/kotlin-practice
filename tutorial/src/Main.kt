fun tutorialTitle(title: String) {
    println("************************** $title **************************")
}
fun main() {
    tutorialTitle("Hello World")
    helloWorld()

    tutorialTitle("Functions")
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))

    tutorialTitle("Infix Functions")
//    infix fun Int.times(str: String) = str.repeat(this)
//    println(2 times "Bye ")

    val pair = "Ferrari" to "Katarina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia

    tutorialTitle("Operator Functions")
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])
}