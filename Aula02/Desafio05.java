/* DESAFIO 5
Crie um programa completo que:
 leia um número
 informe se é par ou ímpar
 mostre a tabuada
 mostre todos os pares até ele
 calcule a soma de 1 até ele
Utilize métodos separados para cada funcionalidade */

import java.util.Scanner;

public class Desafio05{
    
    public static int parOuImpar(int num){
        if (num % 2 == 0) {
        System.out.println("\n 01 = Número "+num+" é PAR \n");           
        }
        else {
        System.out.println("\n 01 - Número "+num+" é IMPAR \n");   
        }
        return 0;
    }
    public static int tabuada (int num){
        System.out.println("\n 02 - TABUADA de "+num+" :");   
        for (int i=0; i<=10; i++){
            int res = i * num;
            System.out.println(num+ " X "+i+ " = "+res );
            }
            return 0;
    }

    public static int pares(int num){
        System.out.println("\n\n03 - Numeros pares até " +num+" :");
        for (int i=0 ; i <= num; i++){
            if(i % 2 == 0 ){
                System.out.println(i);
                }
        }
        return 0;
    }
    public static int somaAtenum(int num){
     int soma = 0;
     for (int i = 1; i <= num; i++) {
     soma += i;
}
System.out.println("\n\n04 - A soma de 1 até " + num + " é = " + soma);
    return 0;
    }

    public static void main(String[] args){
     Scanner nuevo = new Scanner (System.in);
     System.out.println("Informe 1 número : ");
     int numero = nuevo.nextInt();

     parOuImpar(numero);
     tabuada(numero);
     pares(numero);  
     somaAtenum(numero);

     }
    
}