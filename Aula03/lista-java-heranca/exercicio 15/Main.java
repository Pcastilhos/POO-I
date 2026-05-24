/*
Exercício 15 — Sistema Loja
CASO DE USO:
Uma loja deseja cadastrar produtos eletrônicos.
Crie:
- Produto
- Computador herdando de Produto
Computador:
- memoriaRAM
- processador
- placaVideo
Métodos:
- apresentar()
- mostrarConfiguracao()
*/

public class Main{

    public static void main(String[] args) {
        Computador comp1= new Computador();

        comp1.produto = "COMPUTADOR";
        comp1.memoriaRAM = "32G";
        comp1.processador = "i5";
        comp1.placaVideo = "RX-550";
        comp1.preco= 3000.00;
        comp1.apresentar();
        comp1.mostrarConfiguracao();
    }

}