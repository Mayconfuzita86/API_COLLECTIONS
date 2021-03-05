package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0, 6000.0, 2550.0)

    for (salario in salarios){
        println(salario)
    }

    println("----------controle mim max media----------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter{it > 2500}

    println("----------somente maior que 2500----------------")

    salarioMaiorQue2500.forEach{
        println(it)
    }

    println("----------quantos existem dentro de um range----------------")

    println(salarios.count { it in 2000.0..5000.0 })

    println("----------busca----------------")

    println(salarios.find { it == 2250.0})
    println(salarios.find { it == 3400.0})

    println("----------busca qualquer valido----------------")

    println(salarios.any { it == 2250.0})
    println(salarios.find { it == 3400.0})
}