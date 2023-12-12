fun ejU4() {
    /* Escribe un programa que le pida al usuario una temperatura en grados Celsius, la convierta a
    grados Fahrenheit e imprima por pantalla la temperatura convertida */

    print("Introduce un número: ")

    try {
        val celsius = readln().toInt()
        if (celsius < -499) {
            throw NumberFormatException("número no válido")
        }
        val farenheit = (celsius * 9/5)+ 32
        println("$celsius grados centígrados son $farenheit grados Fahrenheit.")
    }
    catch (e: NumberFormatException) {
        print("El número no es válido")
    }

}