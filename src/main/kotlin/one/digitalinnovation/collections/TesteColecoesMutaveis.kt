package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 6000.0, "CLT")
    val pedro = Funcionario("Pedro", 1400.0, "PJ")
    val maria = Funcionario("Maria", 1000.0, "CLT")
    val jose = Funcionario("Jose", 3000.0, "PJ")

    val funcionarios = mutableListOf( joao, maria)
    funcionarios.forEach{ println(it)}

    println("------------incluir na list------------------")

    funcionarios.add(pedro)
    funcionarios.forEach{ println(it)}

    println("------------remover na list------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it)}

    println("------------set na list------------------")

    val funcionarioSet = mutableSetOf(joao)
    //funcionarioSet.forEach{ println(it)}

    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)

    funcionarioSet.forEach{ println(it)}

    println("------------remover na list------------------")

    funcionarioSet.remove(maria)

    funcionarioSet.forEach{ println(it)}



}