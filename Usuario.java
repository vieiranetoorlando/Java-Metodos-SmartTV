// puxando metodos das classe da SmartTV
public class Usuario {

    public static void main(String[] args) {
        // criando variavel ligada com outra classe para puxar os metodos

        SmartTV smartTv = new SmartTV();
        // diminuindo o valor do volume com o metodo da classe SmartTV
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        // Imprimindo o volume atual
        System.out.println("Volume atual: " +smartTv.volume);
        // Imprimindo o canal atual
        System.out.println("Canal Atual: "+ smartTv.canal);


        // mostrando se a TV está ligada
        System.out.println("Tv Ligada ? " + smartTv.ligada);
        // alterando o valor do canal puxando o metodo
        smartTv.mudarCanal(13);
        // mostrar valor do canal atual
        System.out.println("Canal Atual: " + smartTv.canal);
        // valor do Volume
        System.out.println("Volume Atual: " + smartTv.volume);

        // usando o metado ligar da classe e mostrando na tela o resultado
        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);
        // Usando o metodo desligar e mostrando o resultado
        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);

    }
}
