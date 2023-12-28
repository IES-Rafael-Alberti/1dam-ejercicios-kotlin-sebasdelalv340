fun ej7U2Iterativa() {
    //Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10.

    for (i in 1..10) {
        for (j in 1..10) {
            println("$i x $j = ${i * j}")
        }
        println(".".repeat(6))
    }
}