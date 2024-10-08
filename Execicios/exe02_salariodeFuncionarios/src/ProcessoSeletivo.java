import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");
        Scanner teclado = new Scanner(System.in);

        //Chamando os métodos de selecionar o candidatos
        System.out.println("-----------------------------------------------");
        selecaoCandidatos();
        System.out.println("-----------------------------------------------");
        imprimirSelecionado();
        System.out.println("-----------------------------------------------");
        String[] candidatos = {"Felipe","Marcia","Julia", "Paulo", "Augusto"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void imprimirSelecionado(){
        String[] candidatos = {"Felipe","Marcia","Julia", "Paulo", "Augusto"};

        

        for(String candidado: candidatos){
            System.out.println("O candidato " + candidado + " Foi selecionado");
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativaRealizada = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativaRealizada ++;
            else{
                System.out.println("Contato Realizado com Sucesso!");
            }


        }while(continuarTentando && tentativaRealizada < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " Nas " + tentativaRealizada + " Realizado");
        }else
            System.out.println("Não Conseguimos contato com " + candidato + " Nas " + tentativaRealizada + " Realizado");

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void selecaoCandidatos(){
        //Criando um array de Candidatos Selecionado
        String[] candidatos = {"Felipe","Marcia","Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Jose"};
        //Atributos
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0, salarioPretendido = 0.0;
        String candidato = "";
        //Verficando ser o total de candidatos selecioando é menor que 5 e a quantidade atual não é maior que a quantidade de funcionário
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            candidato = candidatos[candidatosAtual];
            salarioPretendido = valorPretendido();

            System.out.println("O candidato(a): " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            //Verificando ser é menor que o salário base
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidatos " + candidato + ", Foi selecionando pela vaga");
                candidatosSelecionados ++;
            }else{

            }
            //Alimentando a repetição
            candidatosAtual ++;
        }

        
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        //Primeiro exemplo
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com uma Contra Proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidato");
        }
    }
}
