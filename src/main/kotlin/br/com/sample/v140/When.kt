package br.com.sample.v140

/**
 * Agora e possivel utilizar break e continue dentro de expressoes when que estao contidas
 * dentro de um loop sem precisar especificar labels.
 */
fun main() {
    // Antes
    loop@ for (x in 0..10) {
        when (x) {
            1 -> continue@loop
            7 -> break@loop
            else -> println(x)
        }
    }

    // Depois
    for (x in 0..10) {
        when (x) {
            1 -> continue
            7 -> break
            else -> println(x)
        }
    }
}