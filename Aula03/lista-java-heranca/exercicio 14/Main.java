/*
Exercício 14 — Sistema Hospital
CASO DE USO:
Um hospital deseja cadastrar médicos.
Crie:
- Pessoa
- Medico herdando de Pessoa
Medico:
- especialidade
- salario
- crm
Métodos:
- apresentar()
- mostrarEspecialidade()
*/

public class Main{

    public static void main(String[] args) {
        Medico m1= new Medico();

        m1.nome = "Pedro Castilhos";
        m1.salario = 8000.00;
        m1.crm = "CRM/RS 123456";
        m1.especialidade = "Geriatra";
        m1.apresentar();
        m1.mostrarEspecialidade();
    }

}