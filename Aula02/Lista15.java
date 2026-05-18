/*EXERCÍCIO 15
Crie um método chamado soma(int a, int b) que retorne a soma.
*/
import java.util.Scanner;

public class Lista15 {
    public static int soma(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 2 números inteiros: \n");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int resultado = soma(n1, n2);
        System.out.println("A soma é: " + resultado);
    }

    
}
