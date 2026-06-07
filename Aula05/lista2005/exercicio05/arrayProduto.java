import java.util.ArrayList;
import java.util.Scanner;

public class arrayProduto {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ler 5 nomes
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome do produto " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            produtos.add(nome);
        }

        // Exibir nomes usando get() e size()
        System.out.println("\nLista de Produtos:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println((i + 1) + " - " + produtos.get(i));
        }

        scanner.close();
    }
}