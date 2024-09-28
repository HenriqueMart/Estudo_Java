public class SmartTv {
    boolean ligada;
    int volume;
    double canal;

    //Construtor
    public SmartTv(){
        this.ligada=false;
        this.volume=50;
        this.canal=1; 
    }

    //Métodos

    //Ligar e desligar TV
    public void ligar(){
        this.ligada = true;
    }
    public void desligar(){
        this.ligada = false;
    }

    //Aumentar e diminuir volume
    public void aumentarVolume(){
        this.volume ++;
    }
    public void diminuirVolume(){
        this.volume --;
    }
    public void volume(int valor){
        this.volume = valor;
    }

    //Passar Canal
    public void aumentarCanal(){
        this.canal ++;
    }
    public void diminuirCanal(){
        this.canal --;
    }
    public void mudarCanal(int canalDigitado){
        this.canal = canalDigitado;
    }


    //ToString -> Mostrando as Informações
    public void status(){
        System.out.println("TV Ligada: " + this.ligada);
        System.out.println("TV Volume Atual: " + this.volume);
        System.out.println("TV Canal Atual: " + this.canal);
    }
}
