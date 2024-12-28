package novapasta;

public class Dados{
  private  int numeroConta;
    private double saldo;
    String titular;


    public String getTitular(String titular) {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

        public double getSaldo() {
            return saldo;
        }
        public int getNumeroConta() {
            return numeroConta;
        }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}