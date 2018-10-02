package ru.siksmfp.kotlin.patterns.behaviour.interpreter.implementation

class ExpressionParser {
    fun parse(string: String): List<Expression<Int>> {

        val result: ArrayList<Expression<Int>> = ArrayList()
        var value: Int = 0
        for (st in string) {
            if (st == '+') {
                result.add(Plus(value))
            } else if (st == '-') {
                result.add(Minus(value))
            } else {
                value = Integer.valueOf(st as String)
            }
        }
        return result

    }

    fun applyOperators(expression: List<Expression<Int>>): Int {
        var result: Int = 0;
        for (ex in expression) {
            result+=ex.calculate(0)
        }

        return result
    }

}