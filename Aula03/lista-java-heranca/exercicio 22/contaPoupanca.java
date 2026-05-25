public class contaPoupanca extends conta{
    public double rendimento;
    public int aniversario;

public void aplicarRendimento(){
    System.out.println("==== RENDIMENTO ====");
    System.out.println("Rendimento : "+rendimento+ " R$");
    saldo = saldo + rendimento;
    System.out.println("Saldo após rendimento : "+saldo+ " R$");
;

} 

public void mostrarAniversario(){
    System.out.println("==== ANIVERSARIO ====");
    System.out.println("Data : "+aniversario);
    }

}
