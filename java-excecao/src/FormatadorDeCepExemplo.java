public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2765064");   
            System.out.println(cepFormatado);
        } catch (Exception e) {
            System.out.println("O cep não tem 8 dígito");
        }
        
    }


    public static String formatarCep(String cep) throws CepInvalidoExcepcion{
        if (cep.length() != 8) {
            throw new CepInvalidoExcepcion();
        }

        //Simulando um cep formatado
        return "23.765-064";
    }
}
