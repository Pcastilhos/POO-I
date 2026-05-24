/*
Exercício 13 — Sistema Escolar
CASO DE USO:
Uma escola deseja cadastrar alunos.
Crie:
- Pessoa
- Aluno herdando de Pessoa
Aluno:
- matricula
- nota1
- nota2
Métodos:
- calcularMedia()
- mostrarSituacao()
*/

public class Main{

    public static void main(String[] args) {
        Aluno a1= new Aluno();

        a1.nome = "Pedro Castilhos";
        a1.matricula = 20000;
        a1.nota1 = 7;
        a1.nota2 = 7;
        a1.apresentar();
        a1.mostrarSituacao();
    }

}