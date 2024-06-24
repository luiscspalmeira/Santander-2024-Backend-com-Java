import java.util.ArrayList;
import java.util.List;

public class Banco {

    List<BancoContaCorrente> infoConta;

    public Banco(){
        infoConta = new ArrayList<>();
    }

    public void adicionarCliente(String agencia, String conta,String cliente, double valor){
        infoConta.add(new BancoContaCorrente(agencia, conta, cliente, valor));
    }

    public void transferirValor(String contaSaida, String contaEntrada, double valor){
        for(BancoContaCorrente cc : infoConta){
            if(cc.getConta().equalsIgnoreCase(contaSaida)){
                if(cc.getValor() < valor){
                    System.err.println("Saldo insuficiente.");

                }else{
                    cc.setValor(cc.getValor() - valor);    
                    for(BancoContaCorrente cs : infoConta){
                        if(cs.getConta().equalsIgnoreCase(contaEntrada)){
                            cs.setValor(cs.getValor() + valor);                                         
                        }                
                    }                                       
                }                
            }            
        }
        
    }
    
    public void exibirClientes(){
        System.out.println(infoConta);
    }

    public static void main(String[] args) {
        
        Banco banco = new Banco();

        banco.adicionarCliente("3001", "2859", "luis", 200.50);
        banco.adicionarCliente("3001", "2860", "claudio", 50);
        //banco.adicionarCliente("3001", "3001", "palmeira", 300);

        banco.exibirClientes();

        banco.transferirValor("2859", "2860", 50);

        banco.exibirClientes();
    }
}
