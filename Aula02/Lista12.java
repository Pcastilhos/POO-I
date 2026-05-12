/*EXERCÍCIO 12
Crie um método chamado lerIdade() que leia a idade do usuário e informe se é maior ou
menor de idade*/

import java.util.Scanner;
public class Lista12 {

 public static void lerIdade(){
   Scanner scanner = new Scanner(System.in);
   System.out.print("Digite sua Idade: ");
   int idade = scanner.nextInt();
   if( idade < 18 ){
    System.out.println("MENOR DE IDADE");
   }
   else{
   System.out.println("MAIOR DE IDADE");
   }
 }
  public static void main(String[] args) {
    lerIdade();
  } 
}
