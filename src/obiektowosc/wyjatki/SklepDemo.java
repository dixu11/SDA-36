package obiektowosc.wyjatki;

import java.util.NoSuchElementException;

public class SklepDemo {
    public static void main(String[] args) {
        Sklep sklep = new Sklep();
        sklep.dodajProdukt("jajka");
        sklep.dodajProdukt("mleko");
        sklep.dodajProdukt("chleb");


        System.out.println(sklep);
        try {
            System.out.println(sklep.znajdzProduktPoNazwie("ml"));
            System.out.println(sklep.znajdzProduktPoNazwie("jajka"));
            System.out.println(sklep.znajdzProduktPoNazwie("woda"));
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Koniec apki");
    }
}
