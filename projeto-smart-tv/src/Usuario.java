public class Usuario {
    public static void main(String[] args) {
        smartTv smarttv = new smartTv();

        System.out.println("TV está ligada? " + smarttv.ligada);
        System.out.println("Canal? " + smarttv.canal);
        System.out.println("volume? " + smarttv.volume);

        smarttv.ligar();
        System.out.println("TV ligada? " + smarttv.ligada);

        smarttv.aumentarVolume();
        System.out.println("Volume atual " + smarttv.volume);
        
        smarttv.mudarCanal(15);

        System.out.println("Canal atual " + smarttv.canal);
    }

}