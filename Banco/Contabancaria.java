package novapasta;

public class Contabancaria{
public static void main(String[] args) {
    Dados conta = new Dados();
    System.out.println();



    conta.setSaldo(1000); 
    conta.setNumeroConta(135); 
    conta.titular = "David";
    System.out.println("Número da Conta: " + conta.getNumeroConta());
    System.out.println("Saldo: " + conta.getSaldo());
    System.out.println("Titular: " + conta.titular);
}
}