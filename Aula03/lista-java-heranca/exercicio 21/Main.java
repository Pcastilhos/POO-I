/* 
Crie:
- Veiculo
- Carro herdando de Veiculo
Veiculo:
- marca
- ano
Carro:
- modelo
- quantidadePortas
Métodos:
- apresentar()
- mostrarPortas()
*/
public class Main{
    public static void main(String[] args){
        Carro car1 = new Carro();
        car1.marca= "Volkswagen";
        car1.modelo= "Brasilia";
        car1.ano= 1973;
        car1.velocidadeAtual=80;
        car1.quantidadePortas= 4;
        car1.cambioAutomatico=false;
        car1.mostrarDados();
        car1.verificarCambio();
        car1.mostrarPortas();
        System.out.println(); 
        System.out.println(); 

        Moto mot1 = new Moto();
        mot1.marca= "BMW";
        mot1.modelo= "K 1600 GTL";
        mot1.ano= 2025;
        mot1.velocidadeAtual= 200;
        mot1.partidaEletrica=true;
        mot1.cilindradas=1600;
        mot1.mostrarDados();
        mot1.mostrarCilndradas();
        mot1.verificarPartida();
        

    }

}