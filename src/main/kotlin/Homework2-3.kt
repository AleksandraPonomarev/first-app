/**
 *Домашнее задание 2. Задача 3
 *
 */
fun main(){
    val meloman :Boolean = true
    val count: Int = 14238// в рублях
    val discount = 100
    val bigDiscount = 95
    val melomanDiscount = 99
    //сумма покупки в копейках
    var priceInKop: Int = if (count <= 1000) {
        count * 100
    }
    else {
        if (count in 1001..10000) {
            (count - discount) * 100
        }
        else {
            count * bigDiscount
        }
    }
    if(meloman) {
        priceInKop = (priceInKop * melomanDiscount)/100
    }
    println("Итоговая сумма покупки равна ${priceInKop/100} рублей и ${priceInKop%100} копеек")
}