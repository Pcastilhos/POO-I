/*EXERCÍCIO 9
Crie um método chamado tabuada (int n) que mostre a tabuada do número.
*/
import java.util.Scanner;

public class Lista09 {
    public static void tabuada (){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe 1 número : ");
    int n = scanner.nextInt();
    System.out.println("Tabuada de " + n + ":");
    for (int i = 1; i <= 10; i++) {
    System.out.println(n + " x " + i + " = " + (n * i));
    }
    } 
    public static void main(String[] args){
    tabuada();
    }

  }

