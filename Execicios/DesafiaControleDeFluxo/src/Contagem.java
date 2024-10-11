import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o Primeiro Valor que inicializará a contagem: ");
        int valor1 = teclado.nextInt();
        System.out.print("Digite o Segundo Valor que Finalizará a contagem: ");
        int valor2 = teclado.nextInt();
        try {
            if (valor1 > valor2) {
                throw new ParametrosInvalidosException();
            }
        } catch (Exception e) {
            System.out.println("Erro no cálculo de contagem, tente novamente!");
        }
        

        ImprimindoValor(valor1, valor2);


    }

    private static void ImprimindoValor(int valor1, int valor2) throws ParametrosInvalidosException {
        for(valor1++;valor1 < valor2; valor1++){
            System.out.println("Imprimindo Número " + valor1);
        }
    }
}
