import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double media;
        double primeiraMedia = teclado.nextDouble();
        
        double segundaMedia = teclado.nextDouble();
        
        if(primeiraMedia <= 10 && segundaMedia <= 10){
            media = (float) (((primeiraMedia)+(segundaMedia))/2);
        }else{
            return;
        }
    
    
        System.out.printf("MEDIA = %.4f", media);
    }
}
