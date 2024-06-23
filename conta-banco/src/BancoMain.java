import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    


    public static void main(String[] args) {

        

        BancoCliente cliente = new BancoCliente();
        cliente.setNome("Luis");

        BancoConta cc = new BancoCc(cliente);
        BancoConta cp = new BancoCp(cliente);
        


        cc.depositar(200);
        cc.transferir(10, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        


    }
}
    

