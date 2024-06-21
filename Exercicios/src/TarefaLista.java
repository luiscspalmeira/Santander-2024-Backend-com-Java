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
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.retainAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        TarefaLista tarefaLista = new TarefaLista();
        System.out.println(tarefaLista.obterNumeroTotalTarefas());
        tarefaLista.adicionarTarefa("teste 1");
        tarefaLista.adicionarTarefa("teste 2");
        tarefaLista.adicionarTarefa("teste 1");

        System.out.println(tarefaLista.obterNumeroTotalTarefas());
        tarefaLista.obterDescricoesTarefas();
    }
    
}
