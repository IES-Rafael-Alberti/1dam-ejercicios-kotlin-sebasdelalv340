fun ejU21() {
    //Escribir un programa que pida al usuario que introduzca una frase en la consola y muestre por pantalla la frase invertida.

    println("Introduce una frase: ")
    val frase = readln().toString()

    try {
        val fraseInvertida = frase.reversed()
        print(fraseInvertida)
    } catch (e: Exception) {
        println("entrda no válida")
    }
}

