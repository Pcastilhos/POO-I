/*
Exercício 5 — ArrayList de Produtos
Objetivo
Criar um ArrayList para armazenar nomes de produtos.
O sistema deve:
 cadastrar 5 produtos
 listar os produtos cadastrados
*/


public class aluno {
    public String nome;
    public int idade;
    public int matricula;

    public void apresentar(){
        System.out.println("====ALUNO====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matriícula: " + matricula);
    }

  public static void main(String[] args) {
        aluno a1 = new aluno();
        a1.nome = "Maria";
        a1.idade = 20;
        a1.matricula = 12345;
        a1.apresentar();
    }
}


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