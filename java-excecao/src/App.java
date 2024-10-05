import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
    //Tratamento de dados utilizando try e catch
       try {
           
       //Objeto
        Scanner teclado = new Scanner(System.in);

        //Solicitando dados pelo terminal 
        System.out.print("Digite seu nome: ");
        String nome = teclado.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = teclado.next();


        System.out.print("Digite sua idade:");
        int idade = teclado.nextInt();

        System.out.print("Digite sua altura:");
        float altura = teclado.nextFloat();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome + ".");
        System.out.println("Minha idade é de " + idade);
        System.out.println("Minha altura é de " + altura);
       }catch (InputMismatchException e) {
        System.out.println("Os campos Idade e Altura precisam ser numéricos!");
    }
    }
}
