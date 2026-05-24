public class Professor extends Pessoa {
public String disciplina;
public Double salario;
public int cargaHoraria;

public void apresentar() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Disciplina: " + disciplina);
    System.out.println("Salário: R$ " + salario);
    System.out.println("Carga Horária: " + cargaHoraria + "h");   
}

public double calcularSalarioAnual () {
    Double salarioAnual = salario * 12;
    System.out.println("O professor " + nome +" recebe " +salarioAnual+ " por Ano!");
    return salarioAnual;
}
}