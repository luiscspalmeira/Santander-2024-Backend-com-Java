import java.util.ArrayList;
import java.util.List;

public class ItemCarrinhoDeCompras {

    private List<Item> carrinhoLista;

    public ItemCarrinhoDeCompras() {
        this.carrinhoLista = new ArrayList<>() ;
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoLista.add(new Item(nome, preco, quantidade));     
    }

    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for (Item i : carrinhoLista){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemRemover.add(i);
            }
        }
        carrinhoLista.removeAll(itemRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item i: carrinhoLista){
            total = total + i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinhoLista);
    }


    public static void main(String[] args) {

        ItemCarrinhoDeCompras compras = new ItemCarrinhoDeCompras();

        compras.adicionarItem("colher", 20.0, 2);
        compras.adicionarItem("garfo", 30.0, 2);
        compras.adicionarItem("faca", 40.0, 2);

        System.out.println(compras.calcularValorTotal());

        compras.exibirItens();
        
        compras.removerItem("colher");

        System.out.println(compras.calcularValorTotal());

        compras.exibirItens();
        


    }
    
}
