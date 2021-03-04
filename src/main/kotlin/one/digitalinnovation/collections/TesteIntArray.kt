package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("-------------1------------------")
    for (valor in values) {
        println(valor)
    }
    println("-------------2------------------")
    // utilizando expressão lambda
    values.forEach {
        println(it)
    }

    println("--------------3-----------------")
    // utilizando expressão lambda
    values.forEach { valor ->
        println(valor)
    }
    println("-------------4------------------")
    for (index in values.indices){
        println(values[index])
    }

    println("-------------5------------------")
    values.sort()
    for (valor in values){
        println(valor)
    }
}

