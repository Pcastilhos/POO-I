/*
25.Crie um programa que:
 Leia um número
 Mostre se é par ou ímpar
 Mostre todos os números até ele
 Mostre a soma
 Mostre quantos são pares
 */

import java.util.Scanner;
public class Lista25 { 
public static void main(String[] args) {
  System.out.println("Informe 1 número : ");  
  Scanner scanner = new Scanner(System.in);
  int numero = scanner.nextInt();
  if (numero % 2 == 0) {
    System.out.println(numero + " é par.");
} else {
    System.out.println(numero + " é ímpar.");

}
for (int i = 0; i <= numero; i++) {
    System.out.println(i);
  }
int soma = 0;
for (int i = 1; i <= numero; i++) {
    soma += i;
}
System.out.println("A soma de 1 até " + numero + " é: " + soma);
int countPares = 0;
for (int i = 0; i <= numero; i++) {
    if (i % 2 == 0) {
        countPares++;
    }

}
System.out.println("Quantidade de números pares até " + numero + ": " + countPares);
}
}