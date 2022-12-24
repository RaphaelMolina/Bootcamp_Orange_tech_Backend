package edu.raphael.segundaSemana;

public class Usuario {

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("\nTv ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("\nTv ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(37);
        System.out.println("Canal Atual: " + smartTv.canal);
        

        smartTv.desligar();
        System.out.println("\nTv ligada ? " + smartTv.ligada);

    }
    
}
