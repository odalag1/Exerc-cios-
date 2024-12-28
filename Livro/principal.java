package Livro;
public class principal {

    public static void main(String[] args) {
        ficha f1 = new ficha();
        f1.settitulo("O Senhor dos Anéis");
        f1.setautor("J.R.R. Tolkien");
        f1.exibeficha();

        
        System.out.println();

        
        ficha f2 = new ficha();
        f2.settitulo("Top Gun");
        f2.setautor("Tom Cruise");
        f2.exibeficha();
    }
}