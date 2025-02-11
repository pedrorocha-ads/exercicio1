import java.util.ArrayList;

public class Venda {
    private ArrayList<Item_Venda> itens;

    public Venda(){
        itens = new ArrayList<>();
    }
    public void addItem(Item_Venda item){
        itens.add(item);
    }
    public double total(){
        double total = 0.0;
        for(Item_Venda item : itens){
            total += item.subTotal();
        }
        return total;
    }
    public void mostrarVendas(){
        for(Item_Venda item : itens){
            System.out.println(item.getProduto().getDescricao() + " - " + item.getQuantidade() + " - " + item.subTotal());
        }
    }
}
