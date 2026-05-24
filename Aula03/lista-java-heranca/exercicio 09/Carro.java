

public class Carro extends Veiculo {
    public String modelo;
    public int quantidadePortas;

public void apresentar(){
    System.out.println("==== CARRRO ====");
    System.out.println("Marca : "+marca);
    System.out.println("Ano Fabricação : "+ano);
    System.out.println("modelo : "+modelo);

} 

public void mostrarPortas(){
    System.out.println("==== DETALHES ====");
    System.out.println("Quantidade de Portas : "+quantidadePortas);
}
}