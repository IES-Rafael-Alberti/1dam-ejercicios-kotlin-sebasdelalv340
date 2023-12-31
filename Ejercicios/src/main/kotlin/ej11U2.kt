fun ej13U2Iterativa() {
    //Escribir un programa que muestre el eco de todo lo que el usuario introduzca hasta que el usuario escriba “salir” que terminará.

    var eco: String
    do {
        print("Escribe: ")
        eco = readln()
        if (eco != "salir") {
            println(eco)
        }
    } while (eco != "salir")
}