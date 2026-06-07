import java.util.ArrayList;
import java.util.Scanner;

public class arrayList01 {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ler 5 nomes
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            alunos.add(nome);
        }

        // Exibir nomes usando get() e size()
        System.out.println("\nNomes informados:");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println((i + 1) + " - " + alunos.get(i));
        }

        scanner.close();
    }
}