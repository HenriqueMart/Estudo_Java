

public class Usuário {
    public static void main(String[] args) throws Exception {
        //Criando um Objeto de Controle
        SmartTv smartTv = new SmartTv();


        //Informações do Usuário
        smartTv.canal(25);

        smartTv.aumentarVolume();

        smartTv.status();
    }
}
