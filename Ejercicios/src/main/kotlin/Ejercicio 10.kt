fun ejU25() {
    //Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato dd/mm/aaaa y muestra por pantalla, el día, el mes y el año. Adaptar el programa anterior para que también funcione cuando el día o el mes se introduzcan con un solo carácter.
    print("Introduce una fecha con el siguiente formato (dd/mm/aaa): ")

    try {
        val fecha = readln()
        val listFecha = fecha.split("/")

        println("El día ${listFecha[0]}, el mes ${listFecha[1]} y el año ${listFecha[2]}.")
    } catch (e: NumberFormatException) {
        println("entrada no válida")
    }
}