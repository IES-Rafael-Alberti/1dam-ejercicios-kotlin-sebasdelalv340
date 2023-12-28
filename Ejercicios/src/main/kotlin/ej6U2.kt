fun ej2U2iterativa() {
    //Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).

    print("Introduce tu edad: ")

    try {
        val edad = readln().toInt()
        for (i in 1..edad) {
            if (i == edad) {
                print(i)
            } else {
                print("$i-")
            }
        }
    } catch (e: NumberFormatException) {
        println("entrada no válida")
    }
}