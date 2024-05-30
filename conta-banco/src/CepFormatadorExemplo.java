public class CepFormatadorExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {            
            //e.printStackTrace();
            System.out.println("Cep inválido.");
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();

        return "23.765-064";       
    }
}
