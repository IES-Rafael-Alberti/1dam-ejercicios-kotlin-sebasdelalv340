fun ej18U2Iterativa() {
    //Solicitar al usuario que ingrese números enteros positivos y, por cada uno, imprimir la suma de los dígitos que lo componen. La condición de corte es que se ingrese el número -1. Al finalizar, mostrar cuántos de los números ingresados por el usuario fueron números pares.

    var num: Int
    var suma = 0
    var pares = 0
    println("Introduce un número entero, para salir introducir -1: ")
    do {
        num = try {
            readln().toInt()
        } catch (e: NumberFormatException) {
            println("entrada no válida")
            -2
        }
        if (num%2 == 0) {
            pares += 1
            suma += num
            println("Suma: $suma")
        } else if (num != -1) {
            suma += num
            println("Suma: $suma")
        }
    } while (num != -1)
    print("Números pares: $pares")
}
