package obiektowosc.obiektowosc.statki;

public class DemoStatek {

    public static void main(String[] args) {
        Statek statek = new Statek("Międzyzdroje","Gdańsk");
        statek.wyswietl();

        Statek statek2 = new Statek("Gdańsk", "Międzyzdroje",600);
        statek2.wyswietl();


     /*   System.out.println(statek.toString());
        System.out.println(statek2.toString());*/

      statek.setPortCel("Gdynia");
        System.out.println(statek.getPortCel());

        System.out.println(statek);
        System.out.println(statek2);



    }
}
