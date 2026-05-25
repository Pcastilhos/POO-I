public class Revista extends Item{
    public int edicao;
    public String mesPublicacao;
   
     
public void mostrarMes(){
    System.out.println("==== MES ====");
    System.out.println("Mes : "+mesPublicacao);
    System.out.println("");
    } 

public void mostrarEdicao(){
    System.out.println("==== EDIÇÂO ====");
    System.out.println("Edição: "+edicao);
    
}

}
