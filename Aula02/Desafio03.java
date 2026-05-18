/* DESAFIO 3
Crie um método chamado fatorial(int n) que calcule o fatorial.
*/

import java.util.Scanner;

public class Desafio03{
    public static int fatorial(int n){
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite um número : ");
        n = scn.nextInt();
        int fat = n;
        System.out.println("fatorial de "+n+ " passo a passo :");
         for (int i=n; i > 1; i-- ){
            int fatm1 = i -1;
            int fat_old = fat;
            fat = fat * fatm1;
            System.out.println(fat_old+ " X " +fatm1+ " = " +fat);

        }
        System.out.println("FATORIAL DE " +n+ " É  :" +fat);
        return 0;
    }
    public static void main(String[] args) {
        fatorial(0);
    }
    }


