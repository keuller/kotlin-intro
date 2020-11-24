package com.kotlin.demo.util

import com.kotlin.demo.sample.Calculator

object Calculator {

    fun execute(oper: Calculator, a: Int, b: Int): Int = when(oper) {
        Calculator.SUM -> sum(a, b)
        Calculator.SUB -> sub(a, b)
        Calculator.DIV -> div(a, b)
        else -> mult(a, b)
    }

    fun sum(a: Int, b: Int) = a + b

    fun sub(a: Int, b: Int) = a - b

    fun div(a: Int, b: Int) = a / b

    fun mult(a: Int, b: Int) = a *b

}
