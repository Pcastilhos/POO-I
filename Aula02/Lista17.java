/*EXERCÍCIO 17
Crie um método chamado positivoOuNegativo(int n) que informe se o número é positivo ou
negativo.*/

import java.util.Scanner;
//Método 
public class Lista17 {
   public static void positivoOuNegativo() {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Digite um Númmero Inteiro: ");
   int n = scanner.nextInt();
   if (n > 0){
    System.out.println("O numero " +n+" é positivo");
   }
   else if (n < 0){
    System.out.println("O numero " +n+ " é negativo");
   }
   else{
    System.out.println("O numero " +n+ " é zero");
   }
   }
   //programa principal
   public static void main(String[] args){
    positivoOuNegativo();
   }
}  