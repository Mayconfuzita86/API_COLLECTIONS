package one.digitalinnovation.collections

fun main(){

    val joao = Funcionario("João", 6000.0, "CLT")
    val pedro = Funcionario("Pedro", 1400.0, "PJ")
    val maria = Funcionario("Maria", 1000.0,"CLT")
    val jose = Funcionario("Jose", 3000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    println("------------realizar busca------------------")
    println(repositorio.findById(joao.nome))

    println("------------realizar busca------------------")

    repositorio.findAll().forEach{ println(it)}

    println("------------remover ------------------")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach{ println(it)}
}