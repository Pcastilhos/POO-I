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
        car1.quantidadePortas= 4;
        car1.apresentar();
        car1.mostrarPortas();

    }

}