public class Moto extends Veiculo {
    public boolean partidaEletrica;
    public int cilindradas;

public void verificarPartida(){
    System.out.println("==== PARTIDA ELETRICA ====");
    if (partidaEletrica==true){
      System.out.println("Partida Eletrica : SIM ");
    }
    else {
      System.out.println("Partida Eletrica : NÃO "); 
    }

} 

public void mostrarCilndradas(){
    System.out.println("==== CILINDRADAS ====");
    System.out.println("Cilindradas : "+cilindradas);
}
}