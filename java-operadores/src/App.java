public class App {
    public static void main(String[] args) throws Exception {
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        //Convertendo em positivo
        numero = numero * 1;

        //Condição Ternária 
        int a = 5, b = 7;

        String resultado =  a==b ? "Verdadeiro":"Falso";

        System.out.println(resultado);

        //Comparando String

        String nome = "Jose", nome2 = "Jose";

        System.out.println(nome == nome2);

        //Forma para compara só o elemento dentro do objeto
        System.out.println(nome.equals(nome2));

    }
}
