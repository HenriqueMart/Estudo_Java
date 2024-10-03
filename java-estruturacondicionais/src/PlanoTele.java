import java.util.Scanner;

public class PlanoTele {
    public static void main(String[] args) throws Exception {
        
        //Atributos
        Scanner teclado = new Scanner(System.in);


        System.out.println("Seja bem Vindo a Operadora 123");
        
        System.out.print("Qual Seria o Seu plano? ");
        int plano = teclado.nextInt();

        switch(plano){
            case 1:
                System.out.println("Você escolheu o plano básico!\n5Gb Youtube");
            case 2:
                System.out.println("Você escolheu o plano médio!\nWhats e Intagram grátis");
            case 3:
                System.out.println("Você escolheu o plano básico!\\n100 minutos de ligação");
            default:
                System.out.println("Plano não existe! Tente Novamento!");
        }


    }
}
