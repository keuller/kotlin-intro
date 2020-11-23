package com.kotlin.demo

// criar tipo de dado
typealias Handler = (String) -> Unit

//arrow function
var ola: () -> Unit = {
    println("Ola Kotliners!")
}

val greet: Handler = { name ->
    println("Ola $name!")
}

// funcao sintaxe lambda
val greet2 = { nome: String -> 
    println("Ola $nome")
}

// funcao com paramentros de entrada e saida
fun somar(a: Int, b: Int): Int {
    return a + b
}

// funcao inline
fun subtrair(a: Int, b: Int): Int = a - b

fun main() {
    println("Ola Kotlin developers!")
    ola()

    ola = { println("Ola Kotliners 2!") }
    ola()
    
    val result = somar(5, 5)
    println("Resultado 5 + 5 = $result")

    val result2 = subtrair(10, 3)
    println("Resultado 10 - 3 = $result2")

    greet2("Bruno")
}
