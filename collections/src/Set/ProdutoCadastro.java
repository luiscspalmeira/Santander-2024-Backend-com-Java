package Set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProdutoCadastro {

    Set<Produto> produtoCadastrado;

    

    public ProdutoCadastro() {
        this.produtoCadastrado = new HashSet<>();
    }

    public void adicionarProduto(int codigo, String nome, double preco, int quantidade){
        produtoCadastrado.add(new Produto(codigo, nome, preco, quantidade));
        
    }
    
    public void exibirProdutoNome(){
        for(Produto p : produtoCadastrado){
            System.out.println(p.getNome());
        }

    }

    public void exibirProdutoPreco(){

    }

    public static void main(String[] args) {

        ProdutoCadastro produtoCadastro = new ProdutoCadastro();  

        produtoCadastro.adicionarProduto(1, "teste 1", 50, 1);
        produtoCadastro.adicionarProduto(2, "teste 2", 80, 2);
        produtoCadastro.adicionarProduto(3, "teste 3", 100, 3);
        produtoCadastro.exibirProdutoNome();
    }
}
