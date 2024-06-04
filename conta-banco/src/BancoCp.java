public class BancoCp extends BancoConta{
    
    public BancoCp(BancoCliente cliente) {
		super(cliente);
	}

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança");
        super.imprimirInfosComuns();
        
    }

}
