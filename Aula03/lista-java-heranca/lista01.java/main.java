
public class main {

    public static void main(String[] args) {
        professor p1 = new professor();
        p1.nome = "João";
        p1.idade = 30;
        p1.disciplina = "Matemática";
        p1.salario = 5000.0;

        aluno a1 = new aluno();
        a1.nome = "Maria";
        a1.idade = 25;
        a1.nota = "8.5";
        a1.matricula = 10.;

        p1.apresentar();
        System.out.println();
        a1.apresentar();
    }
}