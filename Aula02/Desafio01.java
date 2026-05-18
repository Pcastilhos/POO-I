/* DESAFIO 1
Crie um programa com métodos para:
 somar
 multiplicar
 mostrar tabuada */

import java.util.Scanner;

public class Desafio01{

    
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
    public static int tabuada (int tab){
        Scanner tabu = new Scanner(System.in);
        System.out.print("Digite um Número :");
        tab = tabu.nextInt();
        System.out.println("A tabuada do numero "+tab+ " :");
        for(int i=0;i<=10;i++){
            int result= i*tab;
            System.out.println(+i+ " X " +tab+ " = " +result);
        }
        return 0;
    }

    public static void main() {
        System.out.print("Escolha uma opção : \n 1 - Smoar \n 2 - Multiplcar \n 3 - Tabuada \n");
        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt(); 
        switch (n) {
        case 1:
        somar(0,0);
        break;
        case 2:
        Multiplicar(0,0);
        break;
        case 3:
        tabuada(0);
        break;
}
        
    }
    }

