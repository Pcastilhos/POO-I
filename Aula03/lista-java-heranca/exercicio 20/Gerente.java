public class Gerente extends Funcionario{
    public int quantidadeFuncionarios;
    public double bonus;

public void mostrarEquipe(){
    System.out.println("==== QTD FUNCIONÁRIOS ====");
    System.out.println("Total : " +quantidadeFuncionarios);

} 

@Override public Double calcularSalarioMensal(){
    System.out.println("==== SALARIO FINAL  ====");
    double salario_mensal = (salarioBase*bonus)/100+salarioBase;
    System.out.println("Bonus : "+bonus+"%");
    System.out.println("Salario Mensal : "+salario_mensal+" R$");
    System.out.println("");
    return 0.0;
    }

}
