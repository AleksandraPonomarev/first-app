/**
 *Домашнее задание 2. Задача 3
 *
 */
fun main(){
    val meloman :Boolean = false
    val count: Int = 14238// в рублях
    //сумма покупки в копейках
    var priceInKop = if (count <= 1000) {
        count
    }
    else {
        if (count in 1001..10000) {
            (count - 100) * 100
        }
        else {
            count * 95
        }
    }
    if(meloman == true) {
        priceInKop = priceInKop * 99/100
    }
    println("Итоговая сумма покупки равна ${priceInKop/100} рублей и ${priceInKop%100} копеек")
}