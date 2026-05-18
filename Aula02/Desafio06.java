/* DESAFIO 6
Situação:
A cantina da escola quer um programa simples para registrar pedidos. O sistema deve ler o
nome do aluno, o produto escolhido e a quantidade, calcular o valor total e aplicar o
desconto conforme a forma de pagamento.
Produto:
1 - Salgado = R$ 7,00
2 - Suco = R$ 5,00
3 - Combo = R$ 11,0
Forma de pagamento:
1 - Dinheiro/Pix → 10% de desconto
2 - Cartão → sem desconto
O programa deve mostrar:
Nome do aluno
Produto escolhido
Quantidade
Valor bruto
Desconto
Valor final*/

import java.util.Scanner;

public class Desafio06 {

    public static String nomeAluno(Scanner scanner) {
        System.out.print("Nome do aluno: ");
        return scanner.nextLine();
    }

    public static int nomeProduto(Scanner scanner) {
        System.out.println("\nProdutos:");
        System.out.println("1 - Salgado (R$ 7,00)");
        System.out.println("2 - Suco (R$ 5,00)");
        System.out.println("3 - Combo (R$ 11,00)");
        System.out.print("Escolha o produto (1 a 3): ");
        return scanner.nextInt();
    }

    public static String obterNomeProduto(int opcaoProduto) {
        if (opcaoProduto == 1) {
            return "Salgado";
        } else if (opcaoProduto == 2) {
            return "Suco";
        } else if (opcaoProduto == 3) {
            return "Combo";
        } else {
            return "Produto inválido";
        }
    }

    public static double precoUnitario(int opcaoProduto) {
        if (opcaoProduto == 1) {
            return 7.0;
        } else if (opcaoProduto == 2) {
            return 5.0;
        } else if (opcaoProduto == 3) {
            return 11.0;
        } else {
            return 0.0;
        }
    }

    public static int formaPagamento(Scanner scanner) {
        System.out.println("\nForma de pagamento:");
        System.out.println("1 - Dinheiro/Pix (10% de desconto)");
        System.out.println("2 - Cartão (sem desconto)");
        System.out.print("Escolha a forma de pagamento (1 ou 2): ");
        return scanner.nextInt();
    }

    public static double calcularDesconto(double valorBruto, int formaPagamento) {
        if (formaPagamento == 1) {
            return valorBruto * 0.10;
        } else {
            return 0.0;
        }
    }

    public static void exibirResumo(String nomeAluno, String nomeProduto, int quantidade,
                                    double valorBruto, double desconto, double valorFinal) {
        System.out.println("\nResumo do pedido:");
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Produto escolhido: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Valor bruto: R$ %.2f%n", valorBruto);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeAluno = nomeAluno(scanner);
        int opcaoProduto = nomeProduto(scanner);

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        int formaPagamento = formaPagamento(scanner);

        String nomeProduto = obterNomeProduto(opcaoProduto);
        double precoUnitario = precoUnitario(opcaoProduto);

        double valorBruto = precoUnitario * quantidade;
        double desconto = calcularDesconto(valorBruto, formaPagamento);
        double valorFinal = valorBruto - desconto;

        exibirResumo(nomeAluno, nomeProduto, quantidade, valorBruto, desconto, valorFinal);

        scanner.close();
    }
}