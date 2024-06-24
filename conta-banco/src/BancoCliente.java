public class BancoCliente {

    private String agencia;
    private String conta;
    private String cliente;
    

    public BancoCliente(String agencia, String conta, String cliente) {
    
        this.agencia = agencia;
        this.conta = conta;
        this.cliente = cliente;
    }

    public String getConta() {
        return conta;
    }


    @Override
    public String toString() {
        return "BancoCliente [agencia=" + agencia + ", conta=" + conta + ", cliente=" + cliente + "]";
    }



    


   


    

   

    
}
