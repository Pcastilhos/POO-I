/*EXERCÍCIO 14
Crie um método chamado maior(int a, int b) que retorne o maior número.*/

import java.util.Scanner;

public class Lista14{
    public static void maior(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 2 números inteiros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if (n1 > n2){
          System.out.println( n1 + " É maior que "+ n2);  
        }
        else
          System.out.println( n2 + " É maior que "+ n1);
    }

    public static void main(String[] args){
        maior();
    }
}