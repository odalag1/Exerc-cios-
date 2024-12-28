package idadepessoa;
public class principal {
    public static void main(String[] aStrings){

        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setIdade(20);
        System.out.println("Idade:" + pessoa.getIdade());
        System.out.println("Nome:" + pessoa.nome);
        pessoa.verificarIdade();
    }
}
