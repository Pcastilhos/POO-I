/*Crie um método chamado saudacao(String nome) que mostre:
"Olá, [nome]" */
import java.util.Scanner;
public class Lista05 {

 public static void saudacao(){
   Scanner scanner = new Scanner(System.in);
   System.out.print("Digite seu nome: ");
   String nome = scanner.nextLine();
   System.out.println("Olá, " + nome);

 }
  public static void main(String[] args) {
    saudacao();
  } 
}
