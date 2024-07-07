package Map;

import java.util.HashMap;
import java.util.Map;

public class ContatoAgenda {

    private Map<String, Integer> contatoAgenda;

    public ContatoAgenda() {
        this.contatoAgenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatoAgenda.put(nome, telefone);
    }
    
    public void removerContato(String nome){
        if(!contatoAgenda.isEmpty()){
            contatoAgenda.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(contatoAgenda);
    }

    public Integer exibirPorNome(String nome){
        if(!contatoAgenda.isEmpty()){
            return contatoAgenda.get(nome);
        }
        return null;
    }

    public static void main(String[] args) {
        ContatoAgenda contatoAgendaMap = new ContatoAgenda();
        contatoAgendaMap.adicionarContato("Luis", 123);
        contatoAgendaMap.adicionarContato("Claudio", 234);
        contatoAgendaMap.adicionarContato("Luis", 000);
        contatoAgendaMap.adicionarContato("dos", 000);
        contatoAgendaMap.adicionarContato("Santos", 000);
        contatoAgendaMap.adicionarContato("Palmeira", 000);
        contatoAgendaMap.adicionarContato("teste", 000);        


        contatoAgendaMap.exibirContatos();
        contatoAgendaMap.removerContato("teste");
        contatoAgendaMap.exibirContatos();
        System.out.println(contatoAgendaMap.exibirPorNome("Claudio"));

    }
}
