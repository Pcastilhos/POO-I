import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeituraArquivo {
    public static void main(String[] args) {
        ArrayList<String> linhas = new ArrayList<>();

        try {
            File arquivo = new File("dados.txt");
            Scanner leitor = new Scanner(arquivo);

            // Ler o arquivo e armazenar no ArrayList
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                linhas.add(linha);
            }

            leitor.close();

            // Mostrar os dados na tela
            System.out.println("Dados do arquivo:");
            for (int i = 0; i < linhas.size(); i++) {
                System.out.println(linhas.get(i));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}