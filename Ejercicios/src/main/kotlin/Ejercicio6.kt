fun ejU20() {
    //Los teléfonos de una empresa tienen el siguiente formato prefijo-número-extension donde el prefijo es el código del país +34, y la extensión tiene dos dígitos (por ejemplo +34-913724710-56). Escribir un programa que pregunte por un número de teléfono con este formato y muestre por pantalla el número de teléfono sin el prefijo y la extensión.
    println("Introduce un teléfono con el siguiente formato (+34-913724710-56):")
    try {
        val tel = readln().toString()
        val listaTel = tel.split("-")
        println(listaTel[1])
    } catch (e: Exception) {
        println("entrada no válida")
    }
}