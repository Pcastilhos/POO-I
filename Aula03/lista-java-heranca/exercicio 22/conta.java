import java.util.Scanner;

public class conta{
    public String titular;
    public int numero; 
    public Double saldo;

public void apresentar(){
    System.out.println("Titular : "+titular);
    System.out.println("Numero : "+numero);

}     

public Double sacar(){
    System.out.println("==== SACAR ====");
    Scanner scanner = new Scanner (System.in);
    System.out.println("Informe valor do Saque : ");
    Double valor = scanner.nextDouble();
    saldo = saldo - valor;
    System.out.println("Novo Saldo =  "+saldo+ "R$");
    return valor;
    } 

public Double depositar(){
    System.out.println("==== DEPOSITAR ====");
    Scanner scanner = new Scanner (System.in);
    System.out.println("Informe valor do Deposito : ");
    Double valor = scanner.nextDouble();
    saldo = saldo + valor;
    System.out.println("Novo Saldo =  "+saldo+ "R$");
    return valor;
    }           
    
public void mostrarSaldo(){
    System.out.println("Saldo = "+saldo+ "R$");
    }        
}