public class Pessoa {
   public String nome;
   public int idade;
   public String cpf ;


public void apresentar(){
 System.out.println("Nome : "+nome);
 System.out.println("Idade : "+idade);
 }

public void mostrarCpf(){
  System.out.println("==== CPF ====");
  System.out.println("CPF : "+cpf); 
}

}