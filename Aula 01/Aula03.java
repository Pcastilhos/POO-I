import java.util.Scanner;

public class Aula03 {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();
    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();
    System.out.println("Digite Sua altura: ");
    float altura = scanner.nextFloat();
    System.out.println("Olá " + nome + ", você tem " + idade + " anos  e sua altura é "+ altura);
    
    
    }
}