fun ej15U2Iterativa() {
    //Leer números enteros de teclado, hasta que el usuario ingrese el 0. Finalmente, mostrar la sumatoria de todos los números positivos ingresados.

    var num: Int
    var suma = 0
    println("Introduce un número entero, para salir introducir 0: ")
    do {
        num = try {
            readln().toInt()
        } catch (e: NumberFormatException) {
            println("entrada no válida")
            -1
        }
        suma += num
    } while (num != 0)
    print(suma)
}