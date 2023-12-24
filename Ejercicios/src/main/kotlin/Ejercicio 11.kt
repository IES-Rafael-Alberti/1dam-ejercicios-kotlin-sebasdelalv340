import java.lang.Exception

fun ejU26() {
    //Escribir un programa que pregunte por consola por los productos de una cesta de la compra, separados por comas, y muestre por pantalla cada uno de los productos en una línea distinta.
    println("Introduce la lista de la compra separando los productos por comas: ")

    try {
        var listaCompra = readln()
        val cesta = listaCompra.replace(",", "\n")
         print(cesta)
    } catch (e: Exception) {
        println("entrada no válida")
    }
}