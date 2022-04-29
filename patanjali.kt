object whatsapp{
    private var chat = 0
    private var message = 0
    fun message() : Int = message ++
    fun chat() : Int = chat++
    fun notification() = println("notification - ${chat+message}")
}

fun main() {
    whatsapp.message()
    whatsapp.message()
    whatsapp.message()
    whatsapp.chat()
    
    whatsapp.notification()
}
