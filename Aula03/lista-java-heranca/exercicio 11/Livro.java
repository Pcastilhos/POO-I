public class Livro extends Produto{
    public String autor;
    public int paginas;
    public String categoria;

public void apresentar(){
    System.out.println("==== APRESENTAR PRODUTO ====");
    System.out.println("Nome : "+nome);
    System.out.println("Preço : "+preco);
    System.out.println("Categoria : "+categoria);
    System.out.println("Páginas :" +paginas);

} 

public void mostrarAutor(){
    System.out.println("==== AUTOR ====");
    System.out.println("Nome do Autor : "+autor);
}

}
