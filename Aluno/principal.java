package Aluno;
public class principal{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setnome("João");
        aluno1.setnota1(10);
        aluno1.setnota2(10);
        aluno1.setnota3(5);
        aluno1.fichaTecnica();

        aluno2.setnome("Maria");
        aluno2.setnota1(5);
        aluno2.setnota2(5);

       
    }
}