/*
Exercício 8 — Sistema Animal
Crie:
- Animal
- Cachorro herdando de Animal
Animal:
- nome
- idade
Cachorro:
- raca
- peso
Métodos:
- apresentar()
- emitirSom()
*/
public class Main {
public static void main(String[] args){
    Cachorro dog1 = new Cachorro();
    dog1.nome="Zoe";
    dog1.idade=4;
    dog1.peso=7.8;
    dog1.raca="Shitzu";
    dog1.apresnetar();
    dog1.emitiSom();

}
}
