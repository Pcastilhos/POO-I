/*EXERCÍCIO 18
Crie um método chamado pares(int n) que mostre todos os números pares até n.
*/

import java.util.Scanner;

public class Lista18{
    public static int pares(int n){
        System.out.println("Numeros pares até " +n +" :");
        for (int i=0 ; i <= n; i++){
            if(i % 2 == 0 ){
                System.out.println(i);
                }
        }
     return n;
    }
    public static void main(String[] args){
        System.out.print("Digite um número Inteiro: ");
        Scanner num = new Scanner (System.in);
        int valor = num.nextInt();
        pares(valor); 

    }

}