package obiektowosc.obiektowosc.wyjatki;

import java.util.NoSuchElementException;

public class SklepDemo {
    public static void main(String[] args)  {
        Sklep sklep = new Sklep();
        sklep.dodajProdukt("jajka");
        sklep.dodajProdukt("mleko");
        sklep.dodajProdukt("chleb");


        System.out.println(sklep);
        try {
            System.out.println(sklep.znajdzProduktPoNazwie("ml"));
            System.out.println(sklep.znajdzProduktPoNazwie("jajka"));
            //System.out.println(sklep.znajdzProduktPoNazwie("woda"));
            int[] liczby = new int[10];
            System.out.println(liczby[100]);
        } catch (BrakProduktuException | NoSuchElementException e) {
            // System.out.println("Brak produktu");
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("wychodzimy poza zakres tablicy");
        } catch (Exception e) {
            System.out.println("Inny, nieprzewidziany wyjątek");
        }
        System.out.println("Koniec apki");
    }
}
