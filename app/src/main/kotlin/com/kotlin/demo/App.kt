package com.kotlin.demo

import com.kotlin.demo.util.Calculator

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
    val c1 = Contact(
        phone = "119876234652",
        id = "abc123",
        email = "abdoral.gusmao@gmail.com",
        name = "Abdoral Gusmao",
    )

    println("$c1")

    println("Div: 10 / 2 = ${Calculator.execute(com.kotlin.demo.sample.Calculator.DIV, 10, 2)}")
    println("Sub: 10 - 3 = ${Calculator.sub(10, 3)}")
    println("Mult: 2 * 4 = ${Calculator.mult(2, 4)}")

}
