import java.util.Scanner;

public class Lista11_14{
public static void main(String[] args) {
//11. Leia um número e informe se é positivo ou negativo.
  System.out.println("Informe 2 números : ");  
  Scanner scanner = new Scanner(System.in);
  int numero1 = scanner.nextInt();
  int numero2 = scanner.nextInt();
  int Multi = numero1 * numero2;
  System.out.println("A Multiplicação dos Valores é :"+ Multi);

//12. Leia dois números e mostre qual é maior.
  System.out.println("Informe mais 2 números : ");  
  double numero3 = scanner.nextDouble();
  double numero4 = scanner.nextDouble();
  double Div = numero3 / numero4;
  System.out.println("A Divisão dos Valores é :"+ Div);

//13.Mostre os números de 1 até 10.
  System.out.println("\nNúmeros de 1 até 10"); 
   for (int i = 1; i <= 10; i++) {
    System.out.println(i);
   }  
//14.Mostre os números de 10 até 1.
  System.out.println("\nNúmeros de 10 até 1"); 
  for (int i = 10; i >= 1; i--) {
    System.out.println(i);
} 
}
}
