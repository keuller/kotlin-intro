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

//    println("$c1")
//
//    println("Div: 10 / 2 = ${Calculator.execute(com.kotlin.demo.sample.Calculator.DIV, 10, 2)}")
//    println("Sub: 10 - 3 = ${Calculator.sub(10, 3)}")
//    println("Mult: 2 * 4 = ${Calculator.mult(2, 4)}")

//    val nomes: List<String> = listOf("Paulo", "Eduardo", "Giovanna", "Gabriel", "Bruno", "Eduardo")
//    for(nome in nomes) {
//        println("Nome: $nome")
//    }

    val nomes = mutableSetOf("Paulo", "Eduardo", "Giovanna", "Gabriel", "Bruno", "Eduardo")
    nomes.add("Patricia")

    nomes.filter {
        nome -> nome.startsWith("P")
    }.map {
        "Ola $it"
    }.forEach {
        println(it)
    }

    nomes.clear()
    println(nomes)

//    val contatos: Set<Contact> = setOf(
//        Contact("12345", "Abdoral Gusmao", "abdoralgusmao@gmail.com"),
//        Contact("54321", "Leonard Hofstadter", "leonard@outlook.com"),
//        Contact("23456", "Sheldon Cooper", "sheldon.cooper@calthec.com"),
//        Contact("65432", "Penny", "penny@gmail.com"),
//        Contact("12345", "Abdoral Gusmao", "abdoralgusmao@gmail.com")
//    )
//
//    contatos.forEach { println("Personagem: $it") }


    val cidades = mutableMapOf(
        "SP" to "Sao Paulo",
        "SJC" to "Sao Jose dos Campos",
        "SA" to "Santo Andre",
        "SBC" to "Sao Bernardo do Campo"
    )

    cidades["RJ"] = "Rio de Janeiro"

//    for ((key, value) in cidades) {
//        println("$key => $value")
//    }

    cidades.keys.forEach { println("$it => ${cidades[it]} ")}
    cidades.values.forEach { println("Cidade: $it") }
}
