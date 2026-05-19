public class aluno extends pessoa {
    public String nota;
    public Double matricula;

    public void apresentar(){
        System.out.println("====ALUNO====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
        System.out.println("Matriícula: " + matricula);
    }
}