public class Gerente extends Funcionario{
    public String setor;
    public double bonus;

public void apresentar(){
    System.out.println("==== FUNCIONÁRIO ====");
    System.out.println("Nome : "+nome);
    System.out.println("Salario : "+salario);
    System.out.println("Setor: "+setor);
    System.out.println("Bonus : "+bonus+ "%");

} 

public void calcularSalarioFinal(){
    System.out.println("==== SALARIO FINAL  ====");
    double salario_final = (salario*bonus)/100+salario;
    System.out.println("Quantidade de Portas : "+salario_final);
}

}
