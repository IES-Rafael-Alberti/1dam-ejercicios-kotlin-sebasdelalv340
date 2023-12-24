
fun ejU22() {
    //Escribir un programa que pida al usuario que introduzca una frase en la consola y una vocal, y después muestre por pantalla la misma frase pero con la vocal introducida en mayúscula.

    println("Introduce una frase y una volcal: (Hola mundo e): ")


    try {
        val frase = readln()
        val letra = frase.last().uppercase()
        val fraseMod = frase.substring(0, frase.length - 1)
        println(fraseMod + letra)
        
    } catch (e: Exception) {
        println("entrada no válida")
    }
}

