/**
 * Домашнее задание 3. Задача 1
 */
fun main(){
val time = 12488
    println("${agoToText(time)}")
}
fun agoToText(timeInSecond: Int): String{
    return when (timeInSecond) {
        in 0..60 -> "только что"
        in 61..60*60 -> "${timeInSecond/60} ${minute(timeInSecond)} назад"
        in 60*60+1..24 * 60 * 60 -> "${timeInSecond/60/60} ${clocks(timeInSecond)} назад"
        in 24 * 60 * 60+1 ..48 * 60 * 60 -> "сегодня"
        in 48 * 60 * 60+1..72 * 60 * 60 -> "вчера"
        else -> "давно"
    }
}
fun minute(timeInSecond: Int): String{
    return when (timeInSecond / 60) {
        1, 21, 31, 41, 51  -> "минуту"
        in 2..4, in 22..24, in 32..34, in 42..44, in 52..54 -> "минуты"
        in 5..20, in 25..30, in 35..40, in 45..50, in 55..60 -> "минут"
        else -> "время вычислено неверно"
    }
}
fun clocks(timeInSecond: Int): String{
    return when (timeInSecond / 60 / 60) {
        1, 21 -> "час"
        in 2..4, in 22..24 -> "часа"
        in 5..20 -> "часов"
        else -> "время вычислено неверно"
    }
}