/*
Exercício 17 — Sistema Empresa
CASO DE USO:
Uma empresa deseja cadastrar vendedores.
Crie:
- Funcionario
- Vendedor herdando de Funcionario
Vendedor:
- vendasMes
- comissao
Métodos:
- calcularComissao()
- mostrarSalarioFinal()
*/

public class Main{

    public static void main(String[] args) {
        Vendedor vend1= new Vendedor();

        vend1.nome = "Romário";
        vend1.salario = 2000.0;
        vend1.vendasMes= 30000.0;
        vend1.comissao= 3;
        vend1.apresentar();
        vend1.calcularComissao();
        vend1.calcularSalarioFinal();
    }

}