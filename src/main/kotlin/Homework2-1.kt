/**
 * Домашнее задание 2. Задача 1
 */
fun main(){
    val amount = 1900000 //в копейках!!!
    val comissionStandart = 0.0075
    val comission:Int = if(amount* comissionStandart <= 3500) {
        35000
    }
    else (
        amount * comissionStandart
    ).toInt()
    println("$comission")
}