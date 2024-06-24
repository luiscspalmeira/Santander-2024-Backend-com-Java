import java.util.ArrayList;
import java.util.List;

public class MainTeste {


    List<BancoContaCorrente> infoConta;

    public MainTeste(){
        infoConta = new ArrayList<>();
    }


  
    public void adicionarClienteCc(BancoCliente bancoCliente, double valor){
        infoConta.add(new BancoContaCorrente(bancoCliente, valor));
        
    }

    public void adicionarClienteCp(BancoCliente bancoCliente, double valor){
        infoConta.add(new BancoContaCorrente(bancoCliente, valor));
        
    }

    public void transferirValor(String contaSaida, String contaEntrada, double valor){

        for(BancoConta cc : infoConta){
            //System.out.println(cc.getBancoCliente().getConta());
        
            if(cc.getBancoCliente().getConta().equals(contaSaida)){
                if(cc.getValor() < valor){
                    System.err.println("Saldo insuficiente.");
                }else{
                    cc.setValor(cc.getValor() - valor);    
                    for(BancoContaCorrente cs : infoConta){
                        if(cs.getBancoCliente().getConta().equalsIgnoreCase(contaEntrada)){
                        
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

        MainTeste teste = new MainTeste();

        

        //teste.adicionarClienteCc(new BancoCliente("3001", "2859", "luis"), 10);
        teste.adicionarClienteCc(new BancoCliente("3001", "2859", "luis"), 500);
        teste.adicionarClienteCp(new BancoCliente("3001", "2860", "claudio"), 400);
        teste.exibirClientes();
        teste.transferirValor("2859", "2860", 100);
        teste.exibirClientes();

        
    }
    
}
