/*
Exercício 16 — Sistema Academia
CASO DE USO:
Uma academia deseja cadastrar alunos.
Crie:
- Pessoa
- AlunoAcademia herdando de Pessoa
AlunoAcademia:
- peso
- altura
- objetivo
Métodos:
- calcularIMC()
- apresentar()
*/

public class Main{

    public static void main(String[] args) {
        AlunoAcademia aacad1= new AlunoAcademia();

        aacad1.nome = "Pedro";
        aacad1.idade = 47;
        aacad1.altura = 1.8;
        aacad1.peso = 82.0;
        aacad1.objetivo= "Isometria";
        aacad1.apresentar();
        aacad1.calcularIMC();
    }

}