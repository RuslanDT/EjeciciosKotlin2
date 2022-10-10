fun main() {
    var anios = listOf(2000, 1987, 4000, 2020, 1636, 1000, 4, 1600)

    var aniosB = buscador(anios) { anio -> validacion(anio) }

    aniosB.map {
        println("El anio ${it.first} ${if(it.second) "es bisiesto" else "no es bisiesto"}")
    }
}

fun buscador(lista: List<Int>, validacion: (Int) -> Boolean): List<Pair<Int, Boolean>> {
    val bisiestos: MutableList<Pair<Int, Boolean>> = emptyList<Pair<Int, Boolean>>().toMutableList()

    lista.map {
        bisiestos.add(Pair(it, validacion(it)))
    }

    return bisiestos
}


fun validacion(anio: Int): Boolean {
    if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
        return true
    }
    return false
}