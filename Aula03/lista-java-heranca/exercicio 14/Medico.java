public class Medico extends Pessoa{
    public String especialidade;
    public String crm;

public void apresentar(){
    System.out.println("==== MÉDICO ====");
    System.out.println("Nome : "+nome);
    System.out.println("Salario : "+salario);
    System.out.println("Crm: "+crm);
} 

public void mostrarEspecialidade(){
    System.out.println("==== ESPECIALIDADE  ====");
    System.out.println("Especialidade : "+especialidade);
}

}
