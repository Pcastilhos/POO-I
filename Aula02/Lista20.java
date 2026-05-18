/* EXERCÍCIO 20
Crie um método chamado contador(int inicio, int fim) que mostre os números entre os dois
valores.
 */

import java.util.Scanner;

public class Lista20{
    public static int contador(int inicio, int fim){
        System.out.println("Conatado de "+inicio +" até " +fim+" :");
        if (inicio < fim){
        for (int i=inicio ; i <= fim ; i++){
                {
                System.out.println(i);
                }
        }
        }
        else {
        for (int i=inicio ; i >= fim ; i--){
            {
            System.out.println(i);
            }
        }
        }  
    return 0;
    }

    public static void main(String[] args){
        System.out.print("Digite um número Inteiro inicial : ");
        Scanner num = new Scanner (System.in);
        int valori= num.nextInt();
        System.out.print("Digite um numero Inteiro Final : ");
        int valorf= num.nextInt();
        contador(valori, valorf);

    }

}