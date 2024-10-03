public class Banco {

    /**
     * 
     * @Autor Henrique Martins
     * @Since 02/10/2024
     */
    public static void main(String[] args) throws Exception {

        //Criando um objeto de uma nova Conta
        ContaTerminal novaConta = new ContaTerminal();

        //Realizando o Cadastramento
        novaConta.cadastramentoConta();

        novaConta.deposito(20);
    }
}
