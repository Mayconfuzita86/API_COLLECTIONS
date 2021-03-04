package one.digitalinnovation.collections

fun main() {
    val nomes = Array(5){""}
        nomes[0] = "Maria"
        nomes[1] = "José"
        nomes[2] = "Zazá"
        nomes[3] = "João"
        nomes[4] = "Antonio"

    for (nome in nomes){
        println(nome)
    }

    println("-------------1------------------")

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("-------------1------------------")

    val nomes2 = arrayOf("Pereira", "Zuco", "Bartolomeu")

    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}