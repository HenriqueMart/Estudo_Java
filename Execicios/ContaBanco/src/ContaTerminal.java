
import java.util.Scanner;

public class ContaTerminal {

    //Atributos
    int numero;
    String agencia; 
    String nomeCliente;
    float saldo = 0f;

    //Utilizando o Construtor para já iniciar um valor
    public ContaTerminal(){
        this.saldo = 237.48f;
    }

    //Cadastramento das informações do usuário
    public boolean cadastramentoConta(){
       
        //Criando\instanciando um objeto que permitirar pegar informações do teclado
        Scanner teclado = new Scanner(System.in);


        //Solicitando informações
        System.out.print("Digite Seu nome: ");
        this.nomeCliente = teclado.next();

        System.out.print("Digite o número da conta: ");
        this.numero = teclado.nextInt();

        System.out.print("Digite Sua Agencia: ");
        this.agencia = teclado.next();
    

        

        //Fazendo a validação de forma simples para verificar ser tem alguma informações que não foi preenchida
        if (nomeCliente == "" && numero == 0 && agencia == "") {
            return false;
        }

        //Mostrando o Status da Conta
        status();

        //Retornando o boolean que foi feito com sucesso
        return true;
    }



    //Mostrando as informações da conta
    public void status(){
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco\n sua agência é " + this.agencia + ", \nconta " + this.numero + "\n e seu saldo " + this.saldo + "\n já está disponível para saque");
    }

    //Utilizando depósito e Saque
    public void deposito(float valorDepositado){
    //Realizando depósito
        this.saldo += valorDepositado;
        System.out.println("Sucesso no Deposita\nValor na sua conta é de " + this.saldo);
    }
    //Realizando Saque
    public void sacar(float valorSacado){
        //Verificando ser o valor que o usuário tem é maior que ele solita para o saque
        if (valorSacado <= this.saldo) {
            this.saldo -= valorSacado;
        }else{
            System.out.println("Valor Solicitado menor do que você tem!\nTente Novamente!");
            return ;
        }
    }

    //Método get e set
    private void setSaldo(float novoSaldo){
        this.saldo = novoSaldo;
    }
    private float getSaldo(){
        return this.saldo;
    }
}
