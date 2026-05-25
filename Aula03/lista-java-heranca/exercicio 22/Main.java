
public class Main{

    public static void main(String[] args) {
        contaCorrente cc1= new contaCorrente();
        System.out.println("=== CONTA CORRENTE ===");
        cc1.titular = "Pedro Castilhos";
        cc1.saldo = 8000.00;
        cc1.taxaMensal=10;
        cc1.numero=001;
        cc1.limite=10000;
        cc1.apresentar();
        cc1.mostrarSaldo();
        cc1.depositar();
        cc1.sacar();
        cc1.cobrarTaxa();
        cc1.usarLimite();
        System.out.println();
        System.out.println();

        contaPoupanca cp1= new contaPoupanca();
        System.out.println("=== CONTA POUPANCA ===");
        cp1.titular = "Pedro Veio";
        cp1.saldo = 10000.00;
        cp1.numero=002;
        cp1.rendimento=1000;
        cp1.aniversario=15;
        cp1.apresentar();
        cp1.mostrarSaldo();
        cp1.depositar();
        cp1.sacar();
        cp1.mostrarAniversario();
        cp1.aplicarRendimento();    
      
    }

}