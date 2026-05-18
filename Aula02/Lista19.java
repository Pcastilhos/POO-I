/* EXERCÍCIO 19
Crie um método chamado impares(int n) que mostre todos os números ímpares até n.
 */

import java.util.Scanner;

public class Lista19{
    public static int impares(int n){
        System.out.println("Numeros impares até " +n+" :");
        for (int i=0 ; i <= n; i++){
            if(i % 2 != 0 ){
                System.out.println(i);
                }
        }
     return n;
    }
    public static void main(String[] args){
        System.out.print("Digite um número Inteiro: ");
        Scanner num = new Scanner (System.in);
        int valor = num.nextInt();
        impares(valor); 

    }

}