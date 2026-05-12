/*EXERCÍCIO 13
Crie um método chamado dobro(int n) que retorne o dobro do número.
*/

import java.util.Scanner;

public class Lista13{
    public static void dobro(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        int dobro = n * 2;
        System.out.println("o dobro de " +n+ " é " + dobro);
    }

    public static void main(String[] args){
        dobro();
    }
}