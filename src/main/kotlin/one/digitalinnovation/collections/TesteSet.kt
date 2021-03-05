package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("João", 6000.0, "CLT")
    val pedro = Funcionario("Pedro", 1400.0, "PJ")
    val maria = Funcionario("Maria", 1000.0,"CLT")
    val jose = Funcionario("Jose", 3000.0, "PJ")


    //separa conjunto
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria, jose)

    //agrupa os conjuntos
    val resolution = funcionarios1.union(funcionarios2)

    resolution.forEach{
        println(it)
    }

    println("------------subtrair------------------")

    val funcionarios3 = listOf(joao, pedro, maria, jose)
    val resultSubtract = funcionarios3.subtract(funcionarios1)

    resultSubtract.forEach{
        println(it)
    }

    println("------------intersect = em comum------------------")

    val resultIntersect = funcionarios3.intersect(funcionarios1)

    resultIntersect.forEach{
        println(it)
    }


}