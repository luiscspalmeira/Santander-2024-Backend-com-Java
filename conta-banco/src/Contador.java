import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException  {
        
        Scanner teclado = new Scanner(System.in);

        try{
            Integer parametroUm = Integer.parseInt(teclado.nextLine());
            Integer parametroDois = Integer.parseInt(teclado.nextLine());
            contar(parametroUm, parametroDois);
            teclado.close();

        }catch(NumberFormatException exception){

            System.out.println("O segundo deve ser maior que o primeiro.");

        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
    
        
        int contagem = parametroDois - parametroUm;

        for (int x = 0; x <= contagem; x++){
            System.out.println(x);
        }        

    }
    
}
