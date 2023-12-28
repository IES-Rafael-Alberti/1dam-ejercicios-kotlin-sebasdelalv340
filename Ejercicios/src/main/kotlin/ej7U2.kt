fun ej4U2Iterativa() {
    //Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
    println("Introduce un número entero positivo: ")
    try {
        val num = readln().toInt()

        for (i in num downTo 0) {
            if (i == 0) {
                print(i)
            } else {
                print("$i,")
            }

        }
    } catch (e: NumberFormatException) {
        println("entrada no válida")
    }
}