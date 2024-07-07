package Set;

import java.util.HashSet;
import java.util.Set;

public class ContatoAgenda {
    
    private Set<Contato> contatoAgenda;

    public ContatoAgenda() {
        this.contatoAgenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoAgenda.add(new Contato(nome, numero));
    }

    public void pesquisarPorNome(String nome){
        Set<Contato> contatoPesquisado = new HashSet<>();
        if(!contatoAgenda.isEmpty()){
            for (Contato c : contatoAgenda){
                if(c.getNome() == nome){
                    contatoPesquisado.add(c);
                    break;
                }                
            }
        }
        if(!contatoPesquisado.isEmpty()){
            System.out.println(contatoPesquisado);
        }else{
            System.out.println("Não existe contato.");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if(!contatoAgenda.isEmpty()){
            for (Contato c : contatoAgenda){
                if(c.getNome() == nome){
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        return contatoAtualizado;
    }

    public int quantidadeContatos(){
        return contatoAgenda.size();
    }

    public void exibirContatos(){
        System.out.println(contatoAgenda);
    }



    public static void main(String[] args) {
        ContatoAgenda contatoAgenda = new ContatoAgenda();

        contatoAgenda.adicionarContato("Luis", 123);
        contatoAgenda.adicionarContato("Claudio", 234);
        contatoAgenda.adicionarContato("Luis", 000);

        System.out.println(contatoAgenda.quantidadeContatos());
        contatoAgenda.exibirContatos();

        contatoAgenda.pesquisarPorNome("Luis");
        contatoAgenda.pesquisarPorNome("Claudio");
        contatoAgenda.pesquisarPorNome("Santos");        

        System.out.println(contatoAgenda.atualizarNumeroContato("Luis", 456));
        
    }
}
