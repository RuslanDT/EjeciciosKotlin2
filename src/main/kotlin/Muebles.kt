class Inmueble constructor(var anio: Int, var metros: Int, var habitaciones: Int, var garage: Boolean, var zona: Char)

fun main(){
    var lista = listOf(
        Inmueble(2000, 100, 3, true, 'A'),
        Inmueble(2012, 60, 2, true, 'B'),
        Inmueble(1980, 120, 4, false, 'A'),
        Inmueble(2005, 75, 3, true, 'B'),
        Inmueble(2015, 90, 2, false, 'A')
    )

    var casasPresupuesto = presupuesto(lista, 27000)
    println("--- El presupuesto se ajusta para ---")
    casasPresupuesto.map {
        var g = if(it.first.garage) "con" else "sin"
        println("--> Inmueble del año ${it.first.anio} de ${it.first.metros} m^2, ${it.first.habitaciones}, $g garaje, en zona ${it.first.zona} con el precio ${it.second}")
    }
}

fun presupuesto(lista: List<Inmueble>, precio: Int): List<Pair<Inmueble, Double>>{
    var casas: MutableList<Pair<Inmueble, Double>> = emptyList<Pair<Inmueble, Double>>().toMutableList()
    var precioFinal = 0.0

    lista.map {
        when (it.zona) {
            'A' -> {
                precioFinal =
                    if (it.garage){
                        (it.metros * 1000 + it.habitaciones * 5000 + 15000) * (2022 - it.anio) / 100.toDouble()
                    }else{
                        (it.metros * 1000 + it.habitaciones * 5000) * (2022 - it.anio) /  100.toDouble()
                    }
            }
            else -> {
                precioFinal =
                    if (it.garage){
                        ((it.metros * 1000 + it.habitaciones * 5000 + 15000) * (2022 - it.anio) / 100) * 1.5
                    }else{
                        ((it.metros * 1000 + it.habitaciones * 5000) * (2022 - it.anio) / 100) * 1.5
                    }
            }
        }

        if (precioFinal <= precio) {
            casas.add(Pair(it, precioFinal))
        }
    }
    return casas
}
