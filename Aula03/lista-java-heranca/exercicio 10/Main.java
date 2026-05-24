/*
Exercício 10 — Sistema Funcionário
Crie:
- Funcionario
- Gerente herdando de Funcionario
Funcionario:
- nome
- salario
Gerente:
- setor
- bonus
Métodos:
- apresentar()
- calcularSalarioFinal()
*/

public class Main{

    public static void main(String[] args) {
        Gerente g1= new Gerente();

        g1.nome = "Pedro Castilhos";
        g1.salario = 8000.00;
        g1.bonus = 10;
        g1.setor = "Fianceiro";
        g1.apresentar();
        g1.calcularSalarioFinal();
    }


}