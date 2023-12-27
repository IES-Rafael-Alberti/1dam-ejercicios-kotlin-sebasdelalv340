fun ej3U2() {
    //Escribir un programa que pida al usuario dos números y muestre por pantalla su división. Si el divisor es cero el programa debe mostrar un error.
    println("Introduce el dividendo: ")

    try {
        val dividendo = readln().toInt()
        var divisor = 0
        do {
            println("Introduce el divisor: ")
            divisor = readln().toInt()
            if (divisor == 0) {
                println("error - El divisor no puede ser 0.")
            }
        } while (divisor == 0)
        println("El resultado es ${dividendo/divisor}")
    } catch (e: NumberFormatException) {
        println("entrada incorrecta")
    }


}