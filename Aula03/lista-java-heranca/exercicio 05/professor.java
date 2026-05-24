/*
Exercício 5 — Professor
Crie uma classe Professor com:
- nome
- idade
- disciplina
- salario
Crie os métodos:
- apresentar()
- calcularSalarioAnual()
*/

public class professor {
    public String nome;
    public int idade;
    public String disciplina;
    public Double salario;

    public void apresentar(){
        System.out.println("====PROFESSOR====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário: " + salario+ " R$");
    }
    public void salarioAtual(){
        double salarioAtual = salario*12;
        System.out.println("O Salário ANUAL atual é de : "+salarioAtual+ " R$");

    }

    public static void main(String[] args){
        professor prof1 = new professor();
        prof1.nome="Jair";
        prof1.idade= 20 ;
        prof1.disciplina="POO1";
        prof1.salario= 200000.00;
        prof1.apresentar();
        prof1.salarioAtual();


    }
}