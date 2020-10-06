package br.com.sample.v140

/**
 * Agora e possivel passar referencias de funcoes e utilizar os valores default dos parametros
 * declarados na funcao
 */
fun main() {
    println(apply(::foo)) // Print 100
    println(apply2(::foo)) // Print Unit
}

fun foo(i: Int = 100) = "$i"

fun apply(func: () -> String) = func()

fun apply2(func: (Int) -> Unit) = func(50)