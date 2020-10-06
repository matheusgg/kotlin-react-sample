package br.com.sample.v140

/**
 * Agora e possivel mesclar parametros nomeados com parametros posicionais
 * desde que respeitem a ordem de declaracao
 */
fun main() {
    printVariables("One", 2, "Three")
    printVariables(value1 = "One", 2, "Three")
    printVariables("One", value2 = 2, "Three")
    printVariables("One", 2, value3 = "Three")
}

fun printVariables(value1: String, value2: Int, value3: String) {
    println("$value1, $value2, $value3")
}