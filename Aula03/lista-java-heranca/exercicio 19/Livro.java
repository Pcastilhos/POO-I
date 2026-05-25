public class Livro extends Item{
    public String autor;
    public int paginas;
   

public void verificarGrande(){
    System.out.println("==== VERIFICAR GRANDE ??? ====");
    System.out.println("Páginas : "+paginas);
    System.out.println("");
}


public void mostrarAutor(){
    System.out.println("==== AUTOR ====");
    System.out.println("Nome do Autor : "+autor);
    
}

}
