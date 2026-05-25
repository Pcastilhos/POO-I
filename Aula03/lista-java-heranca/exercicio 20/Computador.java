public class Computador extends Produto{
    public String memoriaRAM;
    public String processador;
    public String placaVideo;

public void apresentar(){
    System.out.println("==== APRESENTAR PRODUTO ====");
    System.out.println("Nome : "+produto);
    System.out.println("Valor: "+preco);
 } 

public void mostrarConfiguracao(){
    System.out.println("==== CONFIGURAÇÃO ====");
    System.out.println("Memória RAM : "+memoriaRAM);
    System.out.println("Processador : "+processador);
    System.out.println("Placa de Video :" +placaVideo);
}

}
