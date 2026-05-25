public class Main{

    public static void main(String[] args) {
        Livro L1= new Livro();

        L1.titulo="A sombra do Vento";
        L1.anoPublicacao = 2009;
        L1.codigo= 001;
        L1.paginas=350;
        L1.autor= "Carlos Ruiz Zafón";
        L1.mostrarDados();
        L1.mostrarAutor();
        L1.verificarGrande();
        
        Revista R1 = new Revista();
        R1.titulo="Super Interessante";
        R1.edicao= 32;
        R1.anoPublicacao=2000;
        R1.mesPublicacao= "Maio";
        R1.codigo=002;
        R1.mostrarDados();
        R1.mostrarEdicao();
        R1.mostrarMes();
        


        }

      
    }