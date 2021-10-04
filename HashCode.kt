// Date: 04-10-21
// HashCode Practice
// Todo : Learn - HashCode

interface FirstInterface {
    fun speed()
}

interface SecondInterface {
    fun speed()
}

abstract class Cars : FirstInterface, SecondInterface {
    protected abstract val carName: String
    protected abstract val carModel: String
    protected abstract val year: Int
    /* override fun speed() {
         println("abstracted function in Cars class")
     }*/
}

class Suzuki : Cars() {
    override val carName = "Maruti"
    override val carModel = "ac45"
    override val year = 2020
    override fun speed() {
        println("Speed - 120km/h $carName Suzuki $carModel - $year")
    }
}

data class DataClassOne(val first: Int, val second: Double, val third: String, val forth: Char, val fifth: Byte)
//todo Double :1078018048, String :1854031332

fun main() {
    val firstObject = Suzuki()
    firstObject.speed()

    val secondObject = DataClassOne(23, 34.5, "hello world!!", 'A', 67)
    println("Int :${secondObject.first.hashCode()},Double :${secondObject.second.hashCode()}, String :${secondObject.third.hashCode()}")
    println("Char :${secondObject.forth.hashCode()}, Byte :${secondObject.fifth.hashCode()}")
}