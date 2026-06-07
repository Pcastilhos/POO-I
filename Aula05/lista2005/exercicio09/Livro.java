/*
Exercício 9 — Sistema Biblioteca
Contexto
Uma biblioteca deseja armazenar livros.
Diagrama de Classe
+--------------------------------+
| Livro |
+--------------------------------+
| - titulo: String |
| - autor: String |
| - paginas: int |
+--------------------------------+
| + apresentar(): void |
| + verificarGrande(): void |
+--------------------------------+
Tarefa
Sua tarefa como analista de sistemas é:
 criar a classe Livro
 armazenar livros em ArrayList
 listar livros
 identificar livros com mais de 300 páginas

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Livro {
    public String titulo;
    public String autor;
    public int paginas;
    
    public void apresentar(){
        System.out.println("==== Lista de Livros ====");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        // se verificagrande for verdadeiro imprime
           if (verificarGrande()) {
            System.out.println("Livro com mais de 300 páginas");
        }
    }
        
    public boolean verificarGrande(){
        return paginas > 300;
        
    }
        
    
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
        System.out.println("Informe o Titúlo do Livro: ");
        Livro L1 = new Livro();
        L1.titulo = scanner.nextLine();
        System.out.println("Autor do livro : ");
        L1.autor= scanner.nextLine();
        System.out.println("QTD de Páginas: ");
        L1.paginas= scanner.nextInt();
        scanner.nextLine();
        livros.add(L1);
   }
       for (int i = 0; i < 3; i++) {
       livros.get(i).apresentar(); 
   }
    scanner.close();
}
}
