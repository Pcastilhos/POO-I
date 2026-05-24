public class Aluno extends Pessoa {
public int matricula;
public double nota1;
public double nota2;

public void apresentar() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Matricula: " + matricula);
    System.out.println("Nota 1: " + nota1);    
}

public double calcularMedia() {
    double media = (nota1 + nota2)/2;
    System.out.println("Media: " + media);
    return media;
    }
    
}