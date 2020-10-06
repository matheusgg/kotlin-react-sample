package br.com.sample.v140

/**
 * Conversoes SAM (Single Abstract Method) agora sao realizadas automaticamente pelo compilador,
 * com isso e possivel passar uma lambda onde uma interface com apenas 1 metodo abstrato e esperada.
 */
fun main() {
    val isEven1 = object : IntPredicate {
        override fun accept(value: Int) = value % 2 == 0
    }

    println(isEven1.accept(3))

    val isEven2 = IntPredicate2 { it % 2 == 0 }
    println(isEven2.accept(4))
}

interface IntPredicate {

    fun accept(value: Int): Boolean
}

/**
 * Para possibilitar a conversao e preciso informar o modificador fun
 */
fun interface IntPredicate2 {

    fun accept(value: Int): Boolean
}