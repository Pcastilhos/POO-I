/* DESAFIO 2
Crie um programa que tenha um método chamado menu() mostrando:
1 - Somar
2 - Multiplicar
3 - Sair */


import java.util.Scanner;

public class Desafio02{

    
    public static int somar(int n1, int n2){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 2 números :");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        int soma = (n1 + n2);
        System.out.println("Soma do numero " +n1+ " e "+n2+ " = "+soma);
        return 0;        
    }
    public static int Multiplicar(int x, int y){
        Scanner mult = new Scanner(System.in);
        System.out.println("Digite 2 números");
        x = mult.nextInt();
        y = mult.nextInt();
        int multiplica = x * y ;
        System.out.println("A Multiplicação de " +x+" X "+y+ " = " +multiplica);
        return 0;
    }
    public static int menu(int n) {
        System.out.print("Escolha uma opção : \n 1 - Somar \n 2 - Multiplcar \n 3 - sair \n");
        Scanner numero = new Scanner(System.in);
        n = numero.nextInt(); 
        switch (n) {
        case 1:
        somar(0,0);
        break;
        case 2:
        Multiplicar(0,0);
        break;
        case 3:
        return(0);
        }
        return 0;
            }
    public static void main(String[] args) {
        menu(0);
        
    }

}
