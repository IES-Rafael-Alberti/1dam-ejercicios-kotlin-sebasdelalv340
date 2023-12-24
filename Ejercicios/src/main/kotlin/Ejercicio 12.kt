fun ejU27() {
    //Escribir un programa que pregunte el nombre de un producto, su precio y un número de unidades y muestre por pantalla una cadena con el nombre del producto seguido de su precio unitario con 6 dígitos enteros y 2 decimales, el número de unidades con tres dígitos y el coste total con 8 dígitos enteros y 2 decimales.
    try {
        println("Introduce un producto: ")
        val producto = readln()
        println("Introduce su precio: ")
        val precio = readln().toDouble()
        println("Introduce el número  de unidades: ")
        val ud = readln().toDouble()
        val coste = precio * ud

        println("El nombre del productos es $producto, el precio es ${precio.toString().format("%.2f")}, las unidades son $ud y el coste toal del producto es ${coste.toString().format("%.2f")}")
    } catch (e: Exception) {
        println("entrada no válida")
    }


}