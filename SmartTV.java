public class SmartTV {

    boolean ligada=false;
    int canal=1;
    int volume =25;

    // criando metodo para mudar de canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    // criando metodo para aumentar o canal
    public void aumentarCarnal(){
        canal++;
    }
    // criando metodo para diminuir o canal
    public void diminuirCarnal(){
        canal--;
    }
    // Aumentar o volume
    public void  aumentarVolume(){
        //volume = volume +1
        volume++;
        System.out.println("Aumentando o Volume para: "+ volume);
    }
    // Diminuir o volume
    public void  diminuirVolume(){
        //volume = volume -1
        volume--;
        System.out.println("Diminuindo o volume para: "+ volume);
    }
    // ligar tv
    public void  ligar() {
        ligada=true;
    }
    // Desligar tv
    public void desligar() {
        ligada=false;
    }
}
