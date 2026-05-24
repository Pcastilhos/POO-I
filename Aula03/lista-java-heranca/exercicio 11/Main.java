

/*
Exercício 11 — Sistema Produto
Crie:
- Produto
- Livro herdando de Produto
Produto:
- nome
- preco
Livro:
- autor
- paginas
Métodos:
- apresentar()
- mostrarAutor()
*/

public class Main{

    public static void main(String[] args) {
        Livro L1= new Livro();

        L1.nome="A sombra do Vento";
        L1.preco=60.00;
        L1.categoria="Livro Ficção";
        L1.paginas=350;
        L1.autor= "Carlos Ruiz Zafón";

        L1.apresentar();
        L1.mostrarAutor();
    }

}