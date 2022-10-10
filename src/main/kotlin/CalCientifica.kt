import kotlin.math.*

fun main(){
    var op = -1
    var num : Int

    while (op != 0){
        num = numero()
        op = menu()

        for(x in 1..num){
            operacion(op, x.toDouble())
        }

        println("-------------------------------------\n")
    }

}

fun numero() : Int{
    print("Escriba un numero -> ")
    return readLine()!!.toInt()
}

fun menu() : Int {
    println("--- DIGITE EL NUMERO DE LA OPERACION A REALIZAR ---")
    println("1 -> Seno")
    println("2 -> Coseno")
    println("3 -> Tangente")
    println("4 -> Exponencial")
    println("5 -> Logaritmo neperiano")
    println("0 -> SALIR")
    print("-> ")
    return readLine()!!.toInt()
}

fun operacion(op: Int, num: Double){
    when (op){
        1 -> println("El seno de $num es: ${String.format("%.2f", sin(num))}")
        2 -> println("El coseno de $num es: ${String.format("%.2f", cos(num))}")
        3 -> println("La tangente de $num es: ${String.format("%.2f", tan(num))}")
        4 -> println("El exponelcial de $num es: ${String.format("%.2f", ln(num))}")
        5 -> println("El logaritmo neperiano de $num es: ${String.format("%.2f", sin(num))}")
    }
}