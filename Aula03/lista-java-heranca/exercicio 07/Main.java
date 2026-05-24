/*
Exercício 7 — Herança Pessoa e Professor
Crie:
- Pessoa
- Professor herdando de Pessoa
Professor deve possuir:
- disciplina
- salario
- cargaHoraria
Métodos:
- apresentar()
- calcularSalarioAnual()
 */

public class Main {

    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.nome = "João Silva";
        professor1.idade = 35;
        professor1.disciplina = "Matemática";
        professor1.salario = 5000.0;
        professor1.cargaHoraria = 40;
        professor1.apresentar();
        professor1.calcularSalarioAnual();
    }   
    
}
