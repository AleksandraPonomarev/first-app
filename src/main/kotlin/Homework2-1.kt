/**
 * Домашнее задание 2. Задача 1
 */
fun main(){
    val amount = 1900000 //в копейках!!!
    val comission:Int = if(amount*75/10000 <= 3500) {
        35000
    }
    else {
        amount*75/10000
    }
    println("$comission")
}