/* EXERCÍCIO 11
Crie um método chamado mostrarNome () que leia o nome do usuário e mostre na tela.*/
import java.util.Scanner;
public class Lista11 {

 public static void mostrarNome(){
   Scanner scanner = new Scanner(System.in);
   System.out.print("Digite seu nome: ");
   String nome = scanner.nextLine();
   System.out.println(nome);

 }
  public static void main(String[] args) {
    mostrarNome();
  } 
}
