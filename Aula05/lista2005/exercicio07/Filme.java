/*
Exercício 7 — Sistema de Filmes
Contexto
Uma locadora deseja armazenar filmes cadastrados.
Diagrama de Classe
+---------------------------+
| Filme |
+---------------------------+
| - titulo: String |
| - genero: String |
| - duracao: int |
+---------------------------+
| + apresentar(): void |
+---------------------------+
Tarefa
Sua tarefa como analista de sistemas é:
 criar a classe Filme
 utilizar ArrayList
 cadastrar filmes
 listar os filmes cadastrados
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Filme {
    public String titulo;
    public String genero;
    public int duracao;
    
    public void apresentar(){
        System.out.println("==== FILME ====");
        System.out.println("Titulo: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Duração: " + duracao);
           }

    
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Filme> filmes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
        System.out.println("Informe o Titúlo do Filme: ");
        Filme F1 = new Filme();
        F1.titulo = scanner.next();
        System.out.println("Genero do Filme : ");
        F1.genero= scanner.next();
        System.out.println("Informe a Duração em Minutos: ");
        F1.duracao= scanner.nextInt();
        filmes.add(F1);
   }
       for (int i = 0; i < 3; i++) {
       filmes.get(i).apresentar(); 
   }
    scanner.close();
}
}
