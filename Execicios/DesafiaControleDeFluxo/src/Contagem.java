import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) throws Exception {
        //Objeto para pegar informação digitada
        Scanner teclado = new Scanner(System.in);
        
        //Atributos digitado pelo usuário
        System.out.print("Digite o Primeiro Valor que inicializará a contagem: ");
        int valor1 = teclado.nextInt();
        System.out.print("Digite o Segundo Valor que Finalizará a contagem: ");
        int valor2 = teclado.nextInt();

        //Verificando ser terá uma exceção
        try {
            //Verificando ser o Valor 1 é maior que o valor 2
            if (valor1 > valor2) {
                //Caso sim lança uma exceção
                throw new ParametrosInvalidosException();
            }
            //Caso não ele continua a contagem passando os parâmetros
            ImprimindoValor(valor1, valor2);
        } catch (Exception e) {
            //Caso tenha ele imprimir uma mensagem para o usuário
            System.out.println("Erro no cálculo de contagem, tente novamente!");
        }
        

        


    }

    private static void ImprimindoValor(int valor1, int valor2) throws ParametrosInvalidosException {
        for(valor1++;valor1 < valor2; valor1++){
            System.out.println("Imprimindo Número " + valor1);
        }
    }
}
