fun ej6U2() {
    //Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre. El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres con un nombre posterior a la N y el grupo B por el resto. Escribir un programa que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde.

    try {
        println("Introduce el sexo (M/H): ")
        val sexo = readln().lowercase()
        println("Introdue un nombre: ")
        val nombre = readln().lowercase()
        if (sexo == "m" && nombre[0].toString() in "a".."l") {
            println("Grupo A")
        } else if (sexo == "h" && nombre[0].toString() in "n".."z") {
            println("Grupo A")
        } else {
            println("Grupo B")
        }
    } catch (e: Exception) {
        println("entrada no válida")
    }
}