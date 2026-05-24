public class Aluno extends Pessoa {
public int matricula;
public double nota1;
public double nota2;

public void apresentar() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Matricula: " + matricula);
    System.out.println("Nota 1: " +nota1);
    System.out.println("Nota 2: " +nota2);
}

public double calcularMedia() {
    double media = (nota1 + nota2)/2;
    System.out.println("Media: " + media);
    return media;
    }

public void mostrarSituacao(){
    Double media;
    media=calcularMedia();
    System.out.println("==== SITUAÇÃO ====");
    if (media>=7 && media<9){
       
        System.out.println("NA MÉDIA!");
    }
    else if (media>=9) {
        System.out.println("TÁ BEM DE BOA!");
        
    }else{
        System.out.println("DEU RUIM!");
    }
}
    
}