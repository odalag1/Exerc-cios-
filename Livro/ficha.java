package Livro;
public class ficha {
    private String titulo;
    private String autor;

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    void exibeficha() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }



}
