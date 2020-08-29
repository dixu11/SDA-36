package obiektowosc.statki;

public class DemoStatek {

    public static void main(String[] args) {
        Statek statek = new Statek("Międzyzdroje","Gdańsk");
        statek.wyswietl();

        Statek statek2 = new Statek("Gdańsk", "Międzyzdroje",600);
        statek2.wyswietl();
    }
}
