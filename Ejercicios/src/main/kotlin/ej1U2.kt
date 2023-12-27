import java.security.KeyStore.TrustedCertificateEntry

fun ej2U2() {
    //Escribir un programa que almacene la cadena de caracteres contraseña en una variable, pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida por el usuario coincide con la guardada en la variable sin tener en cuenta mayúsculas y minúsculas.
    val pass = "contraseña"
    var correcto = false

    while (!correcto){
        try {
            println("Introduce la contraseña: ")
            val contra = readln().lowercase()

            if (pass == contra) {
                correcto = true
                return println("Contraseña correcta")
            } else {
                println("Contraseña incorrecta")
            }

        } catch (e: Exception) {
            println("entrada no válida")
        }
    }
}
