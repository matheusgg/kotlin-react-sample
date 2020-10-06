package br.com.sample.classesandobjects

fun main(args: Array<String>) {
    val foo = Outer.Nested().foo()
    println(foo)

    val inner = Outer().Inner().foo()
    println(inner)
}

class Outer {

    private val prop = 10

    class Nested {
        fun foo() = 2
    }

    /**
     * Inner classes carregam uma referencia para a outer class, dessa forma é possivel acessar seus membros
     */
    inner class Inner {
        fun foo() = prop
    }
}