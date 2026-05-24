/*Exercício 2 — Salário Anual do Professor
Crie uma classe Professor com:
- nome
- salarioMensal
- disciplina
Crie o método calcularSalarioAnual().
O método deve retornar salarioMensal * 12.
Mostre:
- nome
- disciplina
- salário anual */

import java.util.Scanner;

public class professor {
 String nome;
 Double salarioMensal;
 String disciplina;

 public double calcularSalarioAnual () {
    Double salarioAnual = salarioMensal * 12;
    System.out.println("O professor " + nome +" recebe " +salarioAnual+ " por Ano!");
    return salarioAnual;
    
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do professor: ");
        professor p1 = new professor();
        p1.nome = scanner.nextLine();
        System.out.println("Digite a renda mensal do professor:");
        p1.salarioMensal = scanner.nextDouble();
        p1.calcularSalarioAnual();
    }
}