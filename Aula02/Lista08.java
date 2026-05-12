/* EXERCÍCIO 8
Crie um método chamado par Ou Impar(int n) que informe se o número é par ou ímpar.*/
import java.util.Scanner;
//Método 
public class Lista08 {
   public static void parOuImpar() {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Digite um Númmero Inteiro: ");
   int n = scanner.nextInt();
   if (n % 2 == 0){
    System.out.println("O numero " +n+" é par");
   }
   else{
    System.out.println("O numero " +n+ " é impar");
   }
   }
   public static void main(String[] args){
    parOuImpar();
   }


}