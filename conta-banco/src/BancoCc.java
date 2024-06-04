public class BancoCc extends BancoConta{

    public BancoCc(BancoCliente cliente) {
		super(cliente);
	}

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        super.imprimirInfosComuns();
    }

  
    
}
