package obiektowosc.obiektowosc.kompozycja;

public class Main {
    public static void main(String[] args) {
        Kontener kontener = new Kontener("beczki z paliwem");
        Statek statek1 = new Statek("Wiesiek");
        Statek statek2 = new Statek("Monika", kontener);

//        System.out.println(statek1);
//        System.out.println(statek2);

        System.out.println("Testy:");
        statek1.otworzKontener("złe");
        System.out.println(statek1);
        statek1.otworzKontener("roman");
        System.out.println(statek1);


      /*  System.out.println("Testy:");
        statek2.otworzKontener("złe");
        System.out.println(statek2);
        statek2.otworzKontener("roman");
        System.out.println(statek2);*/
    }
}
