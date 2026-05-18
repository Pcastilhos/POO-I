/*DESAFIO 4
Crie um método chamado quantidadePares(int n) que conte quantos números pares
existem até n.*/

import java.util.Scanner;

public class Desafio04{
    public static int quantidadePares(int n){
        int cont = 0;
        for (int i=0 ; i <= n; i++){
            if(i % 2 == 0 ){
                cont++;
            }
        }
        System.out.println("Quantidade de pares até " +n + " = " +cont);
     return n;
    }
    public static void main(String[] args){
        System.out.print("Digite um número Inteiro: ");
        Scanner num = new Scanner (System.in);
        int valor = num.nextInt();
        quantidadePares(valor); 

    }

}