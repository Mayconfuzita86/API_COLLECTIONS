package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("João", 6000.0, "CLT")
    val pedro = Funcionario("Pedro", 1400.0, "PJ")
    val maria = Funcionario("Maria", 1000.0,"CLT")
    val jose = Funcionario("Jose", 3000.0, "PJ")

    val funcionarios = listOf(joao, pedro, maria, jose)

    funcionarios.forEach { println(it)}

    println("------------Busca um nome------------------")

    println(funcionarios.find {it.nome == "Maria"})

    println("------------ordena------------------")

    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------ordena por tipo------------------")

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
    """
        Nome: $nome
        Salário: $salario    
    """.trimIndent()
}