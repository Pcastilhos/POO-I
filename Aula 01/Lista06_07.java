import java.util.Scanner;

public class Lista06_07{
public static void main(String[] args) {
//6. Leia dois números e mostre a soma.
  System.out.println("Informe 2 números : ");  
  Scanner scanner = new Scanner(System.in);
  int numero1 = scanner.nextInt();
  int numero2 = scanner.nextInt();
  int soma = numero1 + numero2;
  System.out.println("A soma dos Valores é :"+ soma);

  //7. Leia dois números e mostre a subtração.
  System.out.println("Informe mais 2 números : ");  
  int numero3 = scanner.nextInt();
  int numero4 = scanner.nextInt();
  int menos = numero3 - numero4;
  System.out.println("A subtração dos Valores é :"+ menos);
}
}
