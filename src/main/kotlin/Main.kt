package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
    val input = readln()
    if (input.isEmpty()) {
        println("Ошибка! Пустой ввод!")
        return
    }
    val parts = input.split(" ")
    if (parts.size != 3) {
        println("Ошибка! Нужно ввести два числа и знак операции через пробел!")
        return
    }
    val num1 = parts[0].toDouble()
    val num2 = parts[1].toDouble()
    val op = parts[2]
    if (op == "/" && num2 == 0.0) {
        println("Ошибка: деление на ноль невозможно.")
        return
    }
    val result = when (op) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> {
            println("Ошибка: неверная операция. Доступны: + - * /")
            return
        }
    }
    println("Результат: $result")
}