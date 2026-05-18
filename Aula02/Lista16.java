/*EXERCÍCIO 16
Crie um método chamado media(double a, double b) que retorne a média dos números
*/
import java.util.Scanner;

public class Lista16 {
    public static double media (double a, double b){
        return (a + b) / 2;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 2 números inteiros: \n");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double resultado = media(n1, n2);
        System.out.println("A Média de " + n1 + " e " + n2 + " é: " + resultado);
    }

    
}
