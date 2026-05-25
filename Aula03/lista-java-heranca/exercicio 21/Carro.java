

public class Carro extends Veiculo {
    public boolean cambioAutomatico;
    public int quantidadePortas;

public void verificarCambio(){
    System.out.println("==== CAMBIO ====");
    if (cambioAutomatico==true){
      System.out.println("Cambio : Automático ");
    }
    else {
      System.out.println("Cambio : Manual "); 
    }

} 

public void mostrarPortas(){
    System.out.println("==== DETALHES ====");
    System.out.println("Quantidade de Portas : "+quantidadePortas);
}
}