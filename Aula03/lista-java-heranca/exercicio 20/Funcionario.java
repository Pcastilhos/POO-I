public class Funcionario{
    public String nome;
    public Double salarioBase;
    public String setor;

public Double calcularSalarioMensal(){
    System.out.println("==== SALARIO MENSAL ====");
    double inss;
    if (salarioBase <= 1621.00) {
        // Faixa do mínimo: 7,5%
        inss = salarioBase * 0.075;
    } else {
        // Faixa do teto (DEMO): 10%
        inss = salarioBase * 0.10;
    }
    double salarioMensal = salarioBase - inss;
    System.err.println("Salario Mensal = "+salarioMensal+" R$");
    System.out.println("");
    return 0.0;
    } 
    
public void apresentar(){
    System.out.println("==== FUNCIONÁRIO ====");
    System.out.println("Nome : "+nome);
    System.out.println("Salario Base : "+salarioBase+" R$");
    System.out.println("Setor : "+setor);
}    
}