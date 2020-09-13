package obiektowosc.obiektowosc.osoby;

public class Demo {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Maria");
        osoba.wiek = 25;
        osoba.rola = "user";

        Osoba osoba2 = new Osoba("Jan");
        osoba2.rola = "admin";

        osoba.wyswietl();
        osoba2.wyswietl();



    }
}
