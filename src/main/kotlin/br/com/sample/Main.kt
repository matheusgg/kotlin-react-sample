package br.com.sample

fun main() {
    val message = buildString {
        append("Hello ")
        append("World!")
    }
    println(message)
}