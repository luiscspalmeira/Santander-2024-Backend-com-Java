import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try{

            Scanner teclado = new Scanner(System.in);

            //DecimalFormat formato = new DecimalFormat("#.##");
            
            System.out.println("Por favor, digite o número da Agência !");
            //int numero = Integer.parseInt(teclado.nextLine());
            Integer numero = Integer.valueOf(teclado.nextLine());

            System.out.println("Por favor, digite o nome da Agência !");
            String nomeAg = teclado.nextLine();

            System.out.println("Por favor, digite o seu nome !");
            String nome = teclado.nextLine();

            System.out.println("Por favor, digite o seu saldo !");
            double saldo = Double.parseDouble(teclado.nextLine());
            //saldo = Double.valueOf(formato.format(saldo));


            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + nomeAg + " , conta " + numero + " e seu saldo " + new DecimalFormat("#,##0.00").format(saldo) + " já está disponível para saque.");

            teclado.close();
        
        }catch(NumberFormatException e){
            System.out.println("Os campos número da agência e saldo precisam ser numéricos.");
        }

    }
}
