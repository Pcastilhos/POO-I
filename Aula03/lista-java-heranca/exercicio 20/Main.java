public class Main{

    public static void main(String[] args) {
        Gerente g1= new Gerente();

        g1.nome = "Pedro Castilhos";
        g1.salarioBase = 8000.00;
        g1.bonus = 10;
        g1.setor = "Fianceiro";
        g1.quantidadeFuncionarios= 20;
        g1.apresentar();
        g1.mostrarEquipe();
        g1.calcularSalarioMensal();

        Vendedor v1= new Vendedor();
        v1.nome= "Paulo da Silva";
        v1.salarioBase= 1600.0;
        v1.setor= "Eletronicos";
        v1.valorVendas= 30000.0;
        v1.percentualComissao=10;
        v1.apresentar();
        v1.calcularComissao();
        v1.calcularSalarioMensal();

        
    }



}