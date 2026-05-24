public class contaCorrente extends conta{
    public String agencia;
    public double limite;

public void apresentar(){
    System.out.println("==== CONTA CORRENTE ====");
    System.out.println("Titular : "+titular);
    System.out.println("Saldo : "+saldo+ " R$");
    System.out.println("Agencia : "+agencia);

} 

public void mostrarLimite(){
    System.out.println("==== LIMITE ====");
    System.out.println("Limite : "+limite+ " R$");
}

}
