public class Item_Venda{
    private Produto produto;
    private int quantidade;

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double subTotal(){
        return produto.getPreco() * quantidade;
    }
    public Produto getProduto(){
        return produto;
    }
}

