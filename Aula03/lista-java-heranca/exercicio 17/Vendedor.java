public class Vendedor extends Funcionario{
    public double vendasMes;
    public int comissao;

public void apresentar(){
    System.out.println("==== FUNCIONÁRIO ====");
    System.out.println("Nome : "+nome);
    System.out.println("Salario : "+salario);
    System.out.println("Vendas no Mês: "+vendasMes);
    System.out.println("Porcentagem Comissão : "+comissao+ "%");

} 

public double calcularComissao(){
    double comissao_total = ((vendasMes*comissao)/100);
    return comissao_total;
}
public void calcularSalarioFinal(){
    System.out.println("==== SALARIO FINAL  ====");
    double comissao_total=calcularComissao();
    double salario_final = (salario+comissao_total);
    System.out.println("Comisão = "+comissao_total+ " R$");
    System.out.println("Salario + Comissão  = "+salario_final+" R$");
}

}
