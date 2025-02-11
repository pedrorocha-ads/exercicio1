import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Venda venda = new Venda();

    for(int i = 0; i < 2; i++){
        System.out.println("Digite o nome do produto: ");
        String descricao = scanner.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade: ");
        int quantiade = scanner.nextInt();
        scanner.nextLine();

        Produto produto = new Produto(preco, descricao);
        Item_Venda item = new Item_Venda(produto, quantidade);
        venda.addItem(item);
    }
    }

}