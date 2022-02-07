/**
 * Домашнее задание 2. Задача 1
 */
fun main(){
    val amount = 1900000 //в копейках!!!
    val comissionStandart = 0.0075
    val comissionMin = 3500
    val comissionReal = amount* comissionStandart
    val comission:Int = if(comissionReal <= comissionMin) {
        comissionMin
    }
    else (
            comissionReal
    ).toInt()
    println("$comission")
}