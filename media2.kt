fun main(){
    val aluno1 = LerNota("Aluno 1")
    val aluno2 = LerNota("Aluno 2")
    val aluno3 = LerNota("Aluno 3")

    val media = (aluno1 + aluno2 + aluno3) / 3

    println("A média dos três alunos é: $media")
}

fun LerNota(nomeAluno: String): Double {
    print("Digite a nota do $nomeAluno: ")
    return readLine()!!.toDouble()
}