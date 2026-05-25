public class contaCorrente extends conta{
    public double taxaMensal;
    public double limite;

public void cobrarTaxa(){
    System.out.println("==== CONTA CORRENTE ====");
    System.out.println("Taxa Mensal : "+taxaMensal+ " R$");
    saldo = saldo - taxaMensal;
    System.out.println("Saldo após cobrança de taxa : "+saldo+ " R$");
} 

public void usarLimite(){
    System.out.println("==== LIMITE ====");
    System.out.println("Limite : "+limite+ " R$");
    saldo = saldo + limite;
    System.out.println("Saldo após uso do Limite : "+saldo+ " R$");
}

}
