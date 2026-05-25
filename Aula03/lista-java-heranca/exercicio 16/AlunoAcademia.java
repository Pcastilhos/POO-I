

public class AlunoAcademia extends Pessoa{
    public Double peso;
    public Double altura;
    public String objetivo;

public void apresentar(){
    System.out.println("==== APRESENTAR ALUNO ====");
    System.out.println("Nome : "+nome);
    System.out.println("Idade: "+idade);

 } 

public void calcularIMC(){
    System.out.println("==== CALCULO IMC ====");
    System.out.println("Altura : "+altura);
    System.out.printf("Peso : %.2f%n",peso);
    //IMC = peso / (altura x altura).
    //O resultado de IMC é dado em kg/m2.
    double IMC = peso /(altura*altura);
    System.out.printf("IMC = %.2f kg/m2 \n", IMC);
}

}
