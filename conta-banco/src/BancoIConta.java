public interface BancoIConta {
    
    void sacar(double valor);  
    
    void depositar(double valor);

    void transferir(double valor, BancoConta contaDestino);

    void imprimirExtrato();

}
