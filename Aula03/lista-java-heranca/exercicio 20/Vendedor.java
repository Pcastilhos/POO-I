public class Vendedor extends Funcionario{
    public double valorVendas;
    public int percentualComissao;



public double calcularComissao(){
    double comissao_total = ((valorVendas*percentualComissao)/100);
    return comissao_total;
}
@Override public Double calcularSalarioMensal(){
    System.out.println("==== SALARIO FINAL  ====");
    double comissao_total=calcularComissao();
    double salario_final = (salarioBase+comissao_total);
    System.out.println("Valor total de Venda = "+valorVendas+ " R$");
    System.out.println("Comisão = "+comissao_total+ " R$");
    System.out.println("Salario + Comissão  = "+salario_final+" R$");
    System.out.println("");
    return 0.0;
}

}
