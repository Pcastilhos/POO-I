/*
Exercício 4 — Aluno
Crie uma classe Aluno com:
- nome
- idade
- matricula
Crie o método apresentar()
*/

public class aluno {
    public String nome;
    public int idade;
    public int matricula;

    public void apresentar(){
        System.out.println("====ALUNO====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matriícula: " + matricula);
    }

  public static void main(String[] args) {
        aluno a1 = new aluno();
        a1.nome = "Maria";
        a1.idade = 20;
        a1.matricula = 12345;
        a1.apresentar();
    }
}
