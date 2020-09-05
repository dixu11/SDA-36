package obiektowe.powtorka;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Klient klient1 = new Klient("berek1234", "masło");
        Klient klient2 = new Klient("janek4321","cośtam", LocalDate.of(2000,3,10));
        Klient klient3 = new Klient("janek4321","cośtam", LocalDate.of(2000,3,10));
        Klient klient4 = new Klient("janek4321","cośtam", LocalDate.of(2000,3,10));
        Klient klient5 = new Klient("janek4321","cośtam", LocalDate.of(2000,3,10));
        Klient klient6 = new Klient("janek4321","cośtam", LocalDate.of(2000,3,10));
        System.out.println(klient1);
        System.out.println(klient2);
        System.out.println(klient6);

        klient1.dodajPunkty(33);
        System.out.println(klient1);


        if (klient1.getPunkty() > 100) {
            System.out.println("Doswiadczony user");
        }
        klient1.dodajPunkty(500);
        klient2.dodajPunkty(1000);
        System.out.println("Sprawdzenie po dodaniu punktów: ");
        System.out.println(klient1);
        System.out.println(klient2);
       // klient1.punkty= 100000;

    }

}
