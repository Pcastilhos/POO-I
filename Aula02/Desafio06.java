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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Cadastro do aluno
        System.out.print("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        // 2) Escolha do produto
        System.out.println("\nProdutos:");
        System.out.println("1 - Salgado (R$ 7,00)");
        System.out.println("2 - Suco (R$ 5,00)");
        System.out.println("3 - Combo (R$ 11,00)");
        System.out.print("Escolha o produto (1 a 3): ");
        int opcaoProduto = scanner.nextInt();

        // 3) Quantidade do pedido
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        // 4) Forma de pagamento
        System.out.println("\nForma de pagamento:");
        System.out.println("1 - Dinheiro/Pix (10% de desconto)");
        System.out.println("2 - Cartao (sem desconto)");
        System.out.print("Escolha a forma de pagamento (1 ou 2): ");
        int formaPagamento = scanner.nextInt();

        // 5) Define nome e preco unitario do produto
        String nomeProduto;
        double precoUnitario;

        if (opcaoProduto == 1) {
            nomeProduto = "Salgado";
            precoUnitario = 7.0;
        } else if (opcaoProduto == 2) {
            nomeProduto = "Suco";
            precoUnitario = 5.0;
        } else if (opcaoProduto == 3) {
            nomeProduto = "Combo";
            precoUnitario = 11.0;
        } else {
            nomeProduto = "Produto invalido";
            precoUnitario = 0.0;
        }

        // 6) Calcula valor bruto, desconto e valor final
        double valorBruto = precoUnitario * quantidade;
        double desconto = (formaPagamento == 1) ? valorBruto * 0.10 : 0.0;
        double valorFinal = valorBruto - desconto;

        // 7) Exibe o resumo da venda
        System.out.println("\n----- RESUMO DO PEDIDO -----");
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Produto escolhido: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Valor bruto: R$ %.2f%n", valorBruto);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}
