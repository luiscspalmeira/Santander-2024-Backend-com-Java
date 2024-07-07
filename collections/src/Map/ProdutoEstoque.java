package Map;

import java.util.HashMap;
import java.util.Map;

public class ProdutoEstoque {

    private Map<Long, Produto> produtoEstoque;

    public ProdutoEstoque() {
        this.produtoEstoque = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco){
        produtoEstoque.put(codigo, new Produto(nome, preco, quantidade));
    }
    
    public void exibirProduto(){
        System.out.println(produtoEstoque);
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!produtoEstoque.isEmpty()){
            for(Produto p : produtoEstoque.values()){
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!produtoEstoque.isEmpty()){
            for(Produto p : produtoEstoque.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!produtoEstoque.isEmpty()){
            for(Produto p : produtoEstoque.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public static void main(String[] args) {
        ProdutoEstoque produtoEstoqueMap = new ProdutoEstoque();

        produtoEstoqueMap.adicionarProduto(1L, "Colher", 2, 15);
        produtoEstoqueMap.adicionarProduto(2L, "Faca", 3, 10);
        produtoEstoqueMap.adicionarProduto(3L, "Garfo", 4, 5);
        //produtoEstoqueMap.adicionarProduto(4L, "Prato", 6, 20);

        produtoEstoqueMap.exibirProduto();
        System.out.println(produtoEstoqueMap.calcularValorTotal());
        System.out.println(produtoEstoqueMap.obterProdutoMaisCaro());
        System.out.println(produtoEstoqueMap.obterProdutoMaisBarato());
    }
}
