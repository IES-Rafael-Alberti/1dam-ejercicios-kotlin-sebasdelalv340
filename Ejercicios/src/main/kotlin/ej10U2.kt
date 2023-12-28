fun ej8U2Iterativa() {
    //Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo.

    print("Introduce un número entero positivo: ")
    val num: Int
    var cont = 1
    try {
        num = readln().toInt()
        for (i in 1..num){
            for (j in cont downTo 1 step 2){
                print("$j ")
            }
            println("")
            cont += 2
        }
    } catch (e: NumberFormatException) {
        println("entrada no válida")
    }
}