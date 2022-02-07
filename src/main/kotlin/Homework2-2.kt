/**
 *Домашнее задание 2. Задача 2
 */
fun main(){
    val like = 2000
    val people = if (like % 1000 == 0)
    {
        "человек"
    }
    else {
        if (like % 100 == 11) {
            "людям"
        } else {
            if (like % 10 == 1) {
                "человеку"
            } else {
                "людям"
            }
        }
    }
    println("Понравилось $like $people")
}