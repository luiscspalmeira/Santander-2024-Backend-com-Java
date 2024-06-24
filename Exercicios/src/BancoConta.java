public class BancoConta {
    
    private String conta;
    private double valor;
    private BancoCliente bancoCliente;

    public BancoConta(BancoCliente bancoCliente, double valor){  
        this.bancoCliente = bancoCliente;
        this.valor = valor;
    }

    public String getConta(){
        return conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public BancoCliente getBancoCliente() {
        return bancoCliente;
    }

    public void setBancoCliente(BancoCliente bancoCliente) {
        this.bancoCliente = bancoCliente;
    }

    @Override
    public String toString() {
        return "BancoConta [bancoCliente=" + bancoCliente + ", valor=" + valor + "]";
    }
   
}
