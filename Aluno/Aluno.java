package Aluno;
public class Aluno {
    String nome;
   private int nota1;
   private int nota2;
   private int nota3;

    public void setnome(String nome){
        this.nome = nome;
    }
    public void setnota1(int nota1){
        this.nota1 = nota1;
    }
    public void setnota2(int nota2){
        this.nota2 = nota2;
    }
    public void setnota3(int nota3){
        this.nota3 = nota3;
    }
    
    public double pegaMedia(){
        return (nota1 + nota2 + nota3)/3;
    }

    public void fichaTecnica(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Media do aluno é " + pegaMedia());
    }
    
}
