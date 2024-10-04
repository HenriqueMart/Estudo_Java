import java.util.concurrent.ThreadLocalRandom;

public class Mesada { 
    public static void main(String[] args) throws Exception {
        
        double mesada = 50f;

        while (mesada > 0) { 
            double doce = valorAleatorio();

            if(doce > mesada)
                doce = mesada;

            System.out.println("Doce Valor: " + doce);
            mesada = mesada - doce;
        }
        System.out.println("Mesada:" + mesada);

        System.out.println("Jão gatou toda a sua mesada!");

    }

    private static double valorAleatorio(){  
            return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    

}
