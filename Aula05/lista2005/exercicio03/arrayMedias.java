/*
Exercício 3 — Array de Médias
Objetivo
Criar um programa que armazene as médias de 4 alunos e mostre:
 maior média
 menor média
 média geral da turma*/
import java.util.Scanner;

public class arrayMedias {
    public static void main(String[] args) {
        int tam = 4;
        double[] medias = new double[tam];
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double maior;
        double menor;

        // Ler as médias
        for (int i = 0; i < tam; i++) {
            System.out.print("Informe a média do aluno " + (i + 1) + ": ");
            medias[i] = scanner.nextDouble();
        }

        // Inicializa maior e menor com o primeiro valor do array
        maior = medias[0];
        menor = medias[0];

        // Processar as médias
        for (int i = 0; i < tam; i++) {
            soma += medias[i];

            if (medias[i] > maior) {
                maior = medias[i];
            }

            if (medias[i] < menor) {
                menor = medias[i];
            }
        }

        double mediaGeral = soma / tam;

        // Exibir resultados
        System.out.println("Maior média: " + maior);
        System.out.println("Menor média: " + menor);
        System.out.println("Média geral da turma: " + mediaGeral);

        scanner.close();
    }
}