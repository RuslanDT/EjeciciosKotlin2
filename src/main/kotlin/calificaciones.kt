fun main(){
    val listaCal = mutableListOf(78, 50, 91, 100, 69, 86, 70)

    println(calificaciones(listaCal))
}

fun calificaciones (lista : List<Int>) : MutableList<Pair<Int, String>>{
    var calif : MutableList<Pair<Int, String>> = emptyList<Pair<Int, String>>().toMutableList()
    lista.map{
        when (it) {
            in 95..100 -> calif.add(Pair(it, "Excelente"))
            in 85..94 -> calif.add(Pair(it, "Notable"))
            in 75..84 -> calif.add(Pair(it, "Bueno"))
            in 70..74 -> calif.add(Pair(it, "Suficiente"))
            else -> calif.add(Pair(it, "Desempeño Insuficiente"))
        }
    }

    return calif
}