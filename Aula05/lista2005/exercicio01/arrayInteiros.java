/*
Exercício 1 — Array de Inteiros
Objetivo
Criar um programa que armazene 5 números inteiros em um array e depois mostre
todos os valores.
Requisitos
 Utilizar array
 Utilizar Scanner
 Utilizar for */
import java.util.Scanner;
public class arrayInteiros{
public static void main(String[] args) {
int tam = 5;    
int[] numeros = new int[tam];
// Ler numeros
for (int i=0;i < tam ;i++){
  System.out.println("Informe o Valor " + (i + 1) + " :");
  Scanner scanner = new Scanner(System.in);
  numeros[i] = scanner.nextInt();
}
//Apresentar os Números 
System.out.println("Valores Informados :");
for (int i = 0; i < tam; i++) {
System.out.print(numeros[i]+" ");
}
scanner.close();
}
}