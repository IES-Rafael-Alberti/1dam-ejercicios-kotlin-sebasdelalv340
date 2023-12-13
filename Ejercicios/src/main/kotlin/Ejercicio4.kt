fun ejU15() {
    //Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año. Estos ahorros debido a intereses, que no se cobran hasta finales de año, se te añaden al balance final de tu cuenta de ahorros. Escribir un programa que comience leyendo la cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario. Después el programa debe calcular y mostrar por pantalla la cantidad de ahorros tras el primer, segundo y tercer años. Redondear cada cantidad a dos decimales.

    print("Introduce tus ahorros: ")

    try {
        val ahorro = readln().toDouble()
        val primerAño = ahorro * 1.04
        val segundoAño = primerAño * 1.04
        val tercerAño = segundoAño * 1.04

        println("El balance inicial es de $ahorro. Con un interés compuesto al 4%, los resultados el primero año: ${String.format("%.2f", primerAño)}, el segundo: ${String.format("%.2f", segundoAño)} y el tercero: ${String.format("%.2f", tercerAño)}")
    }
    catch (e:NumberFormatException) {
        println("entrada no válida")
    }
}

