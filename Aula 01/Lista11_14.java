import java.util.Scanner;

public class Lista08_09{
public static void main(String[] args) {
//6. Leia dois números e mostre a soma.
  System.out.println("Informe 2 números : ");  
  Scanner scanner = new Scanner(System.in);
  int numero1 = scanner.nextInt();
  int numero2 = scanner.nextInt();
  int Multi = numero1 * numero2;
  System.out.println("A Multiplicação dos Valores é :"+ Multi);

  //7. Leia dois números e mostre a subtração.
  System.out.println("Informe mais 2 números : ");  
  double numero3 = scanner.nextDouble();
  double numero4 = scanner.nextDouble();
  double Div = numero3 / numero4;
  System.out.println("A Divisão dos Valores é :"+ Div);
}
}
