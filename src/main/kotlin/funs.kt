fun main() {
    var a = 10
    var b = 3
    var result = summa(a,b)
    println(result)

}

fun summa(param1: Int, param2: Int): Int {
    return param1 + param2

}


fun tolya(nails: Int,tap: Int){
    println("Снять сантехнику")
    println("Заменить на новую")
    println("Дополнительные работы")
    println("Установить смесители")
    println("$nails и $tap")
}


fun vasya (nails: Int,tap: Int):String{
    println("Снять старый паркет")
    println("Вынести мусор")
    println("Дополнительные работы")
    println("Постелить новы паркет")
    println("$nails и $tap")
    return "Акт о выполнении работ"
}
