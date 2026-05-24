public class Cachorro extends Animal{
    public String raca;
    public double peso;

   public void apresnetar(){
    System.out.println("====== CACHORRO ======");
    System.out.println("Idade: "+idade);
    System.out.println("Nome: "+nome);
    System.out.println("Raça: "+raca);
    System.out.println("Peso: "+peso);
    }
    public void emitiSom(){
    System.out.println("Emite som : Latir ");
    }

   }