
fun ejU18() {
    //Escribir un programa que pregunte el nombre completo del usuario en la consola y después muestre por pantalla el nombre completo del usuario tres veces, una con todas las letras minúsculas, otra con todas las letras mayúsculas y otra solo con la primera letra del nombre y de los apellidos en mayúscula. El usuario puede introducir su nombre combinando mayúsculas y minúsculas como quiera.

    println("Introduce tu nombre completo: ")

    try {
        val nombre = readln().toString()

        println(nombre.lowercase())
        println(nombre.uppercase())
        letraMayus(nombre)

    } catch (e: Exception) {
        println("entrada no válida")
    }
}
fun letraMayus(nombre: String) {
    val str = nombre.split(" ")

    for (i in str) {
        print("${i.replaceFirstChar{ it.uppercase() }} ")
    }
}

