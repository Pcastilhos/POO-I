import java.util.Scanner;

public class Lista05{
public static void main(String[] args) {
//Leia um número e mostre o dobro.
  System.out.println("Informe um número : ");  
  Scanner scanner = new Scanner(System.in);
  int numero = scanner.nextInt();
  int dobro = numero * numero;
  System.out.println("Dobro do Valor é :"+ dobro);
}
}
