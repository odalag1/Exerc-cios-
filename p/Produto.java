package p;

public class Produto {
    private String produto;
    private double preco;

    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicaDesconto(double percentual){
        double desconto = preco - (preco - (percentual / 100));
        preco -= desconto;
    }


   
}
