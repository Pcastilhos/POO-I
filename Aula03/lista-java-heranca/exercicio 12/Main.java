/*
Exercício 12 — Sistema Bancário
Crie:
- Conta
- ContaCorrente herdando de Conta
Conta:
- titular
- saldo
ContaCorrente:
- limite
- agencia
Métodos:
- apresentar()
- mostrarLimite()
*/

public class Main{

    public static void main(String[] args) {
        contaCorrente cc1= new contaCorrente();
        
        cc1.titular = "Pedro Castilhos";
        cc1.saldo = 8000.00;
        cc1.limite = 10000.00;
        cc1.agencia = "0001-02";
        cc1.apresentar();
        cc1.mostrarLimite();
    }

}