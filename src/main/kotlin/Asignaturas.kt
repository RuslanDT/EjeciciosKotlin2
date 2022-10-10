fun main(){
    var asignaturas: MutableList<Pair<String,Int>> = listOf(
        Pair("redes", 80),
        Pair("movil", 97),
        Pair("web", 77),
        Pair("taller inv.", 70),
        Pair("Gestion de proy.", 30)
    ).toMutableList()

    var notas = notas(asignaturas)

    asignaturas.map{
        println("${it.first.uppercase()}: ${it.second} ${notas[asignaturas.indexOf(Pair(it.first,it.second))]}")
    }
}

fun notas (asignaturas: MutableList<Pair<String, Int>>) : List<String>{
    var nota: MutableList<String> = emptyList<String>().toMutableList()

    asignaturas.map {
        when (it.second){
            in 95..100 -> nota.add("Excelente")
            in 85..94 -> nota.add("Notable")
            in 75..84 -> nota.add("Bueno")
            in 70..74 -> nota.add("Suficiente")
            else -> nota.add("Desempeño Insuficiente")
        }
    }

    return nota
}

