fun ejU12() {
    /*Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice de masa corporal y lo almacene en una variable, y muestre por pantalla la frase Tu índice de masa corporal es donde es el índice de masa corporal calculado redondeado con dos decimales.*/

    try {
        print("Introduce tu peso (en kg): ")
        val peso = readln().toDouble()
        print("Introduce tu estatura (en metros): ")
        val estatura = readln().toDouble()
        val imc = String.format("%.2f", peso / estatura)

        println("Tu índice de masa corporal es $imc")
    }
    catch (e:NumberFormatException) {
        print("entrada no válida")
    }
}