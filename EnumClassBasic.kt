enum class Day {
    sunday,monday,tueday,wednesday,thursday,friday,saturday;
    fun weekoff() {
        if(this == sunday)
        println("yes its weekoff")
        else 
        println("no its not weekoff")
    }
}
fun main() {
    val day = Day.monday
    day.weekoff()
}
