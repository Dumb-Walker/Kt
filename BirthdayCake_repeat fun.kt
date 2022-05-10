
fun candles(age : Int) {
    repeat(age) {
    	print("'")
    }
    println("")
    repeat(age) {
        print("|")
    }
    println("")
}

fun cake(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age) {
            print("@")
        }
        println("")
    }
}

fun greeting(greet: String) {
    println("\n!!!$greet!!!\n")
}

fun main() {
    val age = 23
    val cakeLayer = 4
    greeting("HAPPY BIRTHDAY")
    candles(age)
    cake(age,cakeLayer)
}
