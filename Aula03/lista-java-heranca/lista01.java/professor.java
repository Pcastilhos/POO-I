public class professor extends pessoa {
    public String disciplina;
    public Double salario;

    public void apresentar(){
        System.out.println("====PROFESSOR====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário: " + salario);
    }
}