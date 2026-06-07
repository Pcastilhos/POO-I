/*
Exercício 6 — ArrayList de Objetos
Contexto
Você foi contratado para desenvolver um sistema simples de alunos.
Diagrama de Classe
+---------------------------+
| Aluno |
+---------------------------+
| - nome: String |
| - media: double |
+---------------------------+
| + apresentar(): void |
+---------------------------+
Tarefa
Sua tarefa como desenvolvedor é:
 criar a classe Aluno
 criar um ArrayList
 cadastrar 3 alunos
 listar os alunos cadastrados
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    public String nome;
    public double media;
    
    public void apresentar(){
        System.out.println("====ALUNO====");
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
           }
    public void listar() {

       }
    
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
        System.out.print("Informe o nome do Aluno: ");
        Aluno a1 = new Aluno();
        a1.nome = scanner.next();
        System.out.println("Informe a média do Aluno "+ a1.nome +" :");
        a1.media= scanner.nextDouble();
        alunos.add(a1);
   }
       for (int i = 0; i < 3; i++) {
       alunos.get(i).apresentar(); 
   }
    scanner.close();
}
}
