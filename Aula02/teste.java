/* public class teste {

public static void mensagem() {
System.out.println("Bem-vindo!");
}
public static void main(String[] args) {
mensagem();
mensagem();
mensagem();
}
}


public class teste {
public static void saudacao(String nome) {
System.out.println("Olá, " + nome);
}
public static void main(String[] args) {
saudacao("Jair");
saudacao("Maria");
}
}

public class teste {
public static int soma(int a, int b) {
return a + b;
}
public static void main(String[] args) {
int resultado = soma(10, 5);
System.out.println(resultado);
}
}
*/


/*
import java.util.Scanner;
public class teste {
public static void saudacao() {
Scanner scanner = new Scanner(System.in);
System.out.print("Digite seu nome: ");
String nome = scanner.nextLine();
System.out.println("Olá, " + nome);
}
public static void main(String[] args) {
saudacao();
saudacao();
saudacao();
}
}

*/

import java.util.Scanner;
public class teste {
public static void soma() {
Scanner scanner = new Scanner(System.in);
System.out.print("Digite o primeiro número: ");
int a = scanner.nextInt();
System.out.print("Digite o segundo número: ");
int b = scanner.nextInt();
int resultado = a + b;
System.out.println("Resultado: " + resultado);
}
public static void main(String[] args) {
soma();
}
}