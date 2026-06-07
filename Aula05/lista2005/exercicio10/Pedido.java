/*
Exercício 10 — Sistema de Pedidos
Contexto
Uma empresa deseja informatizar pedidos.
Diagrama de Classe
+--------------------------------+
| Pedido |
+--------------------------------+
| - produto: String |
| - quantidade: int |
| - preco: double |
+--------------------------------+
| + calcularTotal(): double |
| + apresentar(): void |
+--------------------------------+
Tarefa
Sua tarefa como desenvolvedor é:
 criar a classe Pedido
 armazenar pedidos em ArrayList
 calcular valor total dos pedidos
 mostrar faturamento final
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    public String Produto;
    public Double preco;
    public int quantidade;
    
    public void apresentar(){
        System.out.println("==== Pedido ====");
        System.out.println("Produto: " + Produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + preco);
        System.out.println("Total do pedido : " +calcularTotal());
        
    }    
    public double calcularTotal(){
        return quantidade * preco;
   }     
    
  public static void main(String[] args) {
        double faturamentoFinal = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pedido> pedido = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
        System.out.println("Informe o nome do Produto: ");
        Pedido P1 = new Pedido();
        P1.Produto = scanner.nextLine();
        System.out.println("Informe a Quantidade : ");
        P1.quantidade= scanner.nextInt();
        System.out.println("Informe o Preço : ");
        P1.preco= scanner.nextDouble();
        scanner.nextLine();
        pedido.add(P1);
   }
       for (int i = 0; i < 3; i++) {
       pedido.get(i).apresentar(); 
       faturamentoFinal += pedido.get(i).calcularTotal();
   }
    System.out.println("FATURAMENTO FINAL : "+faturamentoFinal);
    scanner.close();
}
}

