public class BancoContaCorrente {

    
    private String agencia;
    private String conta;
    private String cliente;
    private double valor;


    
    public BancoContaCorrente(String agencia, String conta, String cliente, double valor) {
        this.agencia = agencia;
        this.conta = conta;
        this.cliente = cliente;
        this.valor = valor;
    }
    
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ContaCorrente [agencia=" + agencia + ", conta=" + conta + ", cliente=" + cliente + ", valor=" + valor
                + "]";
    }

    
    
}
