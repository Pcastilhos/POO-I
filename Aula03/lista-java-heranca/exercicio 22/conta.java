import java.util.Scanner;

public class conta{
    public String titular;
    public int numero; 
    public Double saldo;

public Double sacar(Double valor){
    System.out.println("==== SACAR ====");
    Scanner scanner = new Scanner (System.in);
    System.out.println("Informe valor do Saque : ");
    valor = scanner.nextDouble();
    saldo = saldo + valor;
    return valor;
    } 

public Double depositar(Double valor){
    System.out.println("==== DEPOSITAR ====");
    Scanner scanner = new Scanner (System.in);
    System.out.println("Informe valor do Deposito : ");
    valor = scanner.nextDouble();
    saldo = saldo + valor;
    return valor;
    }           
    
public void mostrarSaldo(){
    System.out.println("Saldo = "+saldo);
    }        
}