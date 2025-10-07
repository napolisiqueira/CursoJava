package napoli.sqr.modulo2;

public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV está ligada? "+ smartTv.onOrOff);

        smartTv.tvOn();
        System.out.println("TV está ligada? "+ smartTv.onOrOff);

        smartTv.tvOff();

        System.out.println(smartTv.canal);
        smartTv.changeCanalPos();
    }
}
