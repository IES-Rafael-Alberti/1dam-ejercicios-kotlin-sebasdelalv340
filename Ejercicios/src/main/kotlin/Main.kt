
fun main() {
    //ejU4()
    //ejU6()
    //ejU12()
    //ejU15()
    //ejU18()
    //ejU20()
    //ejU21()
    //ejU22()
    //ejU24()
    //ejU25()
    //ejU26()
    //ejU27()
    //ej2U2()
    //ej3U2()
    //ej6U2()
    //ej8U2()
    //ej10U2()
    //ej2U2iterativa()
    //ej4U2Iterativa()
    //ej6U2Iterativa()
    //ej7U2Iterativa()
    //ej8U2Iterativa()
    //ej13U2Iterativa()
    ej15U2Iterativa()
}

fun mostrarMenuPpal() {
    println("1. Ejercicios U1")
    println("2. Ejercicios U2")
    println("3. Ejercicios U3")
}

fun pedirOpcion(min: Int, max: Int): Int {

    var opcion: Int
    do {
        println("Seleccione opción (0 = SALIR) >> ")
        opcion = try {
            readln().toInt()
        } catch (e: NumberFormatException) {
            println("entrada no válida")
            -1
        }
        if (opcion !in min..max) {
            println("entrada no válida")
        }
    } while (opcion !in min..max)

    return opcion
}
