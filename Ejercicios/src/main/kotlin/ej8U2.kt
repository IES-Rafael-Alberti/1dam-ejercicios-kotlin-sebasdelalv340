fun ej6U2Iterativa() {
    //Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo, de altura el número introducido.
    print("Introduce un número entero positivo: ")
    var cont = 1
    try {
        val num = readln().toInt()

        for (i in 1..num) {
            println("*".repeat(cont))
            cont += 1
        }
    } catch (e: NumberFormatException) {
        println("entrada no válida")
    }
}