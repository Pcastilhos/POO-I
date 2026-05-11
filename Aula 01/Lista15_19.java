import java.util.Scanner;

public class Lista15_19 {
public static void main(String[] args) {
//15. Leia um número e mostre todos os números até ele.
  System.out.println("Informe 1 número : ");  
  Scanner scanner = new Scanner(System.in);
  int numero = scanner.nextInt();
  for (int i = 0; i <= numero; i++) {
    System.out.println(i);
  }

//16. Leia um número e mostre a soma de 1 até ele.
System.out.println("Informe 1 número : ");
int numero1 = scanner.nextInt();
int soma = 0;
for (int i = 1; i <= numero1; i++) {
    soma += i;
}
System.out.println("A soma de 1 até " + numero1 + " é: " + soma);


//17. Leia um número e mostre apenas os números pares até ele.
System.out.println("Informe 1 número : ");
int numero2 = scanner.nextInt();
System.out.println("Números pares até " + numero2 + ":");
for (int i = 0; i <= numero2; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}
//18. Leia um número e mostre apenas os números ímpares até ele.
System.out.println("Informe 1 número : ");
int numero3 = scanner.nextInt();    
System.out.println("Números ímpares até " + numero3 + ":");
for (int i = 0; i <= numero3; i++) {
    if (i % 2 != 0) {
        System.out.println(i);
    }
}

//19. Leia um número e informe se é par ou ímpar.
System.out.println("Informe 1 número : ");
int numero4 = scanner.nextInt();
if (numero4 % 2 == 0) {
    System.out.println(numero4 + " é par.");
} else {
    System.out.println(numero4 + " é ímpar.");

}
}
}