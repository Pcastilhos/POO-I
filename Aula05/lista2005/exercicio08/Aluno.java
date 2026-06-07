/*
Exercício 8 — Sistema Escolar
Contexto
Uma escola deseja cadastrar alunos e calcular médias.
Diagrama de Classe
+--------------------------------+
| Aluno |
+--------------------------------+
| - nome: String |
| - nota1: double |
| - nota2: double |
+--------------------------------+
| + calcularMedia(): double |
| + apresentar(): void |
+--------------------------------+
Tarefa
Sua tarefa como desenvolvedor é:
 criar a classe Aluno
 calcular média
 armazenar alunos em ArrayList
 mostrar os alunos aprovados
Considere aprovado média >= 7.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
 
    public double calcularMedia(){
        double media = (nota1+nota2)/2;
        return media;
        }
    
    public void apresentar(){
        System.out.println("====ALUNO====");
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + calcularMedia());
           }

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
        System.out.println("Informe o nome do Aluno: ");
        Aluno a1 = new Aluno();
        a1.nome = scanner.next();
        System.out.println("Informe a Nota 1 do Aluno "+ a1.nome +" :");
        a1.nota1= scanner.nextDouble();
        System.out.println("Informe a Nota 2 do Aluno "+ a1.nome +" :");
        a1.nota2= scanner.nextDouble();
        alunos.add(a1);
   }
        // Mostrar apenas alunos aprovados
        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).calcularMedia() >= 7) {
            alunos.get(i).apresentar();
   }
        }
    scanner.close();
}
}

