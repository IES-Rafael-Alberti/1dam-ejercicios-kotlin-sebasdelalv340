fun ejU24() {
    //Escribir un programa que pregunte por consola el precio de un producto en euros con dos decimales y muestre por pantalla el número de euros y el número de céntimos del precio introducido.
    println("Introduce un precio con dos decimales: ")

    try {
        val precio = readln()
        val listprecio = precio.split(".")
         println("El precio se compone de ${listprecio[0]} euros y ${listprecio[1]} centimos.")
    } catch (e: NumberFormatException) {
        println("entrada no válida")
    }
}