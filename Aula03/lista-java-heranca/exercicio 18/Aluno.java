public class Aluno extends Pessoa {
public int matricula;
public double nota1;
public double nota2;

public double calcularMedia() {
    double media = (nota1 + nota2)/2;
    System.out.println("Media: " + media);
    return media;
    }

public void mostrarSituacao(){
    Double media;
    media=calcularMedia();
    System.out.println("==== SITUAÇÃO ====");
    if (media>=7 && media<=10){
       
        System.out.println("APROVADO");
    }     
    else{
        System.out.println("REPROVADO");
    }
}
    
}