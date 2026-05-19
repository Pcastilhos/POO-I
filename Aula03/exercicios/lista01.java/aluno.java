/* 
Exercício 1 — Média do Aluno
Crie uma classe Aluno com:
- nome
- nota1
- nota2
Crie o método calcularMedia().
O método deve retornar a média das duas notas.
Utilize Scanner para:
- ler o nome
- ler as notas
Mostre:
- nome do aluno
- média final
*/


import java.util.Scanner;

public class aluno {
    String nome;
    Double nota1;
    Double nota2;

    public double calcularMedia () {
        Double media = (nota1 + nota2) / 2;
        System.out.println("O aluno " + nome + " tem a média :" +media);
        return media;
        }

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno : ");
        aluno a1 = new aluno();
        a1.nome = scanner.nextLine();
        System.out.print("Digite a primeira nota: ");
        a1.nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        a1.nota2 = scanner.nextDouble();
        a1.calcularMedia();
    }
 
}
