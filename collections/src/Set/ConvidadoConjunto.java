package Set;

import java.util.HashSet;
import java.util.Set;

public class ConvidadoConjunto {

    private Set<Convidado> convidadoSet;
    

    public ConvidadoConjunto() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorConvite(int codigo){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigo() == codigo){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConvidadoConjunto convidadoConjunto = new ConvidadoConjunto();

        convidadoConjunto.adicionarConvidado("Luis", 1013);
        convidadoConjunto.adicionarConvidado("Luis", 1014);
        convidadoConjunto.adicionarConvidado("Claudio", 1020);
        convidadoConjunto.adicionarConvidado("Santos", 1040);
        convidadoConjunto.adicionarConvidado("Palmeira", 1013);
        convidadoConjunto.adicionarConvidado("Luis", 1013);

        System.out.println(convidadoConjunto.contarConvidado());
        convidadoConjunto.exibirConvidado();

        convidadoConjunto.removerConvidadoPorConvite(1020);
        System.out.println(convidadoConjunto.contarConvidado());
        convidadoConjunto.exibirConvidado();


    }
    
}
