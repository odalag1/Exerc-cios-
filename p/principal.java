package p;

public class principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setPreco(5);
        produto.setProduto("Coca-Cola");
        System.out.println("Produto: " + produto.getProduto());
        System.out.println("Preço: " + produto.getPreco());
        produto.aplicaDesconto(50);
        System.out.println("Preço com desconto: " + produto.getPreco());
        
    }
}