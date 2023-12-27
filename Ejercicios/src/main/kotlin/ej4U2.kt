fun ej8U2() {
    //En una determinada empresa, sus empleados son evaluados al final de cada año. Los puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando, traduciéndose en mejores beneficios. Los puntos que pueden conseguir los empleados pueden ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las cifras mencionadas. A continuación se muestra una tabla con los niveles correspondientes a cada puntuación. La cantidad de dinero conseguida en cada nivel es de 2.400€ multiplicada por la puntuación del nivel.
    //Escribir un programa que lea la puntuación del usuario e indique su nivel de rendimiento, así como la cantidad de dinero que recibirá el usuario.

    var nivel = 0.0
    try {
        print("Introduce el nivel de rendimiento (0.0, 0.4, 0.6 o más): ")
        nivel = readln().toDouble()
    } catch (e: NumberFormatException) {
        print("entrada no válida")
    }
    if (nivel == 0.0) {
        println("El nivel de rendimiento es Inaceptable y percibirá ${nivel * 2400} euros.")
    } else if (nivel == 0.4) {
        println("El nivel de rendimiento es Aceptable y percibirá ${nivel * 2400} euros.")
    } else if (nivel >= 0.6) {
        println("El nivel de rendimiento es Meritorio y percibirá ${nivel * 2400} euros.")
    }
}