package List;

import java.util.ArrayList;
import java.util.List;

public class LivroCatalogo {
    
    private List<Livro> livroCatalogo;

    public LivroCatalogo() {
        this.livroCatalogo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livroCatalogo.add(livro);
    }

    public void pesquisarPorAutor(String autor){
        List<Livro> pesquisaAutor = new ArrayList<>();
        for(Livro l : livroCatalogo){
            if(l.getAutor().equalsIgnoreCase(autor)){
                pesquisaAutor.add(l);
            }
        }
        System.out.println("Livro pesquisado para autor: " + autor);
        System.out.println(pesquisaAutor);
        System.out.println("");
    }

    public void pesquisarPorTitulo(String titulo){
        List<Livro> pesquisaTitulo = new ArrayList<>();
        for (Livro l : livroCatalogo){
            if (l.getTitulo().equalsIgnoreCase(titulo)){
                pesquisaTitulo.add(l);
            }
        }
        System.out.println("Livro pesquisado para titulo: " + titulo);
        System.out.println(pesquisaTitulo);
        System.out.println("");
    }

    public void pesquisarPorAno(int anoInicial, int anoFinal){
        List<Livro> livroPorAno = new ArrayList<>();
        if(!livroCatalogo.isEmpty()){
            for (Livro l : livroCatalogo){
                if((l.getAnoPublicacao() >= anoInicial) && (l.getAnoPublicacao() <= anoFinal)){
                    livroPorAno.add(l);
                }
            }
        }
        System.out.println(livroPorAno);
        System.out.println("");
    }

    public int quantidadeLivro(){
        return livroCatalogo.size();
    }

    public void listaLisvros(){
        System.out.println(livroCatalogo);
    }

    public static void main(String[] args) {
        LivroCatalogo catalogoLivro = new LivroCatalogo();

        System.out.println(catalogoLivro.quantidadeLivro());
        catalogoLivro.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        catalogoLivro.adicionarLivro(new Livro("O Principe", "Nicolau Maquiavel", 1513));
        catalogoLivro.adicionarLivro(new Livro("A Arte da Guerra", "Sun Tzu", 1080));
        catalogoLivro.adicionarLivro(new Livro("Helena", "Machado de Assis", 1876));
        System.out.println(catalogoLivro.quantidadeLivro());
        catalogoLivro.listaLisvros();
        catalogoLivro.pesquisarPorAutor("Machado de Assis");
        catalogoLivro.pesquisarPorTitulo("O Principe");
        catalogoLivro.pesquisarPorAno(1000, 2000);


    }

}
