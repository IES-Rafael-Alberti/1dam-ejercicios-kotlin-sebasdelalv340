
fun ejU6() {
    /* Escribe un programa que pida el importe final de un artículo y calcule e imprima por pantalla el
    IVA que se ha pagado y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%) */

    print("Introduce el importe final: ")

    try {
        val precioFinal = readln().toDouble()

        print("Para $precioFinal, el iva pagado es de ${precioFinal - (precioFinal / 1.1)} y el importe sin iva ${precioFinal / 1.1}")
    }
    catch (e:NumberFormatException) {
        print("entrada no válida")
    }
}
