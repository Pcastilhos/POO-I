/*
Exercício 6 — Herança Pessoa e Aluno
Crie:
- classe Pessoa
- classe Aluno herdando de Pessoa
Aluno deve possuir:
- matricula
- nota1
- nota2
Métodos:
- apresentar()
- calcularMedia()
*/


public class Main {

public static void main(String[] args) {
        
    Aluno aluno = new Aluno();
    aluno.nome = "João";
    aluno.idade = 20;
    aluno.matricula = 12345;
    aluno.nota1 = 8.5;
    aluno.nota2 = 7.0;
    aluno.apresentar();
    aluno.calcularMedia(); 
   }
}
