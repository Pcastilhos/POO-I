/*
Exercício 3 — Pessoa
Crie uma classe Pessoa com:
- nome
- idade
Crie um método apresentar()
 */


public class pessoa {
    public String nome;
    public int idade;

    public void apresentar(){
        System.out.println("====PESSOA====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

    }

    public static void main(String[] args) {
        pessoa p1 = new pessoa();
        p1.nome = "João";
        p1.idade = 30;
        p1.apresentar();
    }
}