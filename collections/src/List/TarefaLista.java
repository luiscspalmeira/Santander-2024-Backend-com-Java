package List;

import java.util.ArrayList;
import java.util.List;

public class TarefaLista {

    private List<Tarefa> tarefaList;

    public TarefaLista() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaRemover);
    }

    public int obterNumeroTarefas(){
        return tarefaList.size();
    }


    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        TarefaLista listaTarefa = new TarefaLista();

        System.out.println(listaTarefa.obterNumeroTarefas());

        listaTarefa.adicionarTarefa("teste 1");
        System.out.println(listaTarefa.obterNumeroTarefas());
        listaTarefa.obterDescricaoTarefas();

        listaTarefa.adicionarTarefa("teste 2");
        listaTarefa.adicionarTarefa("teste 3");
        listaTarefa.adicionarTarefa("teste 3");
        listaTarefa.adicionarTarefa("teste 4");
        listaTarefa.obterDescricaoTarefas();
        listaTarefa.removerTarefa("teste 3");
        System.out.println(listaTarefa.obterNumeroTarefas());
        listaTarefa.obterDescricaoTarefas();

    }
    
}