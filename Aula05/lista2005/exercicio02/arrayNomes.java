/*
Exercício 2 — Array de Nomes
Objetivo
Criar um programa que armazene 5 nomes em um array de String e depois liste todos
os nomes.
Requisitos
 Utilizar array
 Utilizar Scanner
 Utilizar for*/
import java.util.Scanner;
public class arrayNomes{
public static void main(String[] args) {
int tam = 5;    
String[] nomes = new String[tam];
// Ler nomes
for (int i=0;i < tam ;i++){
  System.out.println("Informe o Nome " + (i + 1) + " :");
  Scanner scanner = new Scanner(System.in);
  nomes[i] = scanner.nextLine();
}
//Apresentar os Números 
System.out.println("Nomes Informados :");
for (int i = 0; i < tam; i++) {
System.out.println((i+1)+" - "+nomes[i]);
}
scanner.close();
}
}