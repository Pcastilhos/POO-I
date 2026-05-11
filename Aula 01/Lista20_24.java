/*
20. Leia três números e mostre o maior.
21. Leia um número e mostre a tabuada dele (1 a 10).
22. Leia um número e conte quantos números pares existem até ele.
23. Leia um número e calcule o fatorial.
24. Leia dois números e mostre todos os números entre eles
*/

import java.util.Scanner;
public class Lista20_24 {
public static void main(String[] args) {
  //20. Leia três números e mostre o maior.
  System.out.println("Informe 3 números : ");  
  Scanner scanner = new Scanner(System.in);
  int numero1 = scanner.nextInt();
  int numero2 = scanner.nextInt();
  int numero3 = scanner.nextInt();
  int maior = numero1;
  if (numero2 > maior) {
    maior = numero2;
  }
  if (numero3 > maior) {
    maior = numero3;
  }
  System.out.println("O maior número é: " + maior);


//21. Leia um número e mostre a tabuada dele (1 a 10).
System.out.println("Informe 1 número : ");
int numero = scanner.nextInt();
System.out.println("Tabuada de " + numero + ":");
for (int i = 1; i <= 10; i++) {
    System.out.println(numero + " x " + i + " = " + (numero * i));
}  

//22. Leia um número e conte quantos números pares existem até ele.
System.out.println("Informe 1 número : ");
int numero4 = scanner.nextInt();
int countPares = 0;
for (int i = 0; i <= numero4; i++) {
    if (i % 2 == 0) {
        countPares++;
    }

}
System.out.println("Quantidade de números pares até " + numero4 + ": " + countPares);

//23. Leia um número e calcule o fatorial.
System.out.println("Informe 1 número : ");
int numero5 = scanner.nextInt();
int fatorial = 1;
for (int i = 1; i <= numero5; i++) {
    fatorial *= i;
}
System.out.println("O fatorial de " + numero5 + " é: " + fatorial); 
//24. Leia dois números e mostre todos os números entre eles
System.out.println("Informe 2 números : ");
int numero6 = scanner.nextInt();
int numero7 = scanner.nextInt();
if (numero6 < numero7) {
    System.out.println("Números entre " + numero6 + " e " + numero7 + ":");
    for (int i = numero6 + 1; i < numero7; i++) {
        System.out.println(i);
    }  
} else if (numero6 > numero7) {
    System.out.println("Números entre " + numero7 + " e " + numero6 + ":");
    for (int i = numero7 + 1; i < numero6; i++) {
        System.out.println(i);
    }               
} else {
    System.out.println("Os números são iguais, não há números entre eles.");      

}
}    
}