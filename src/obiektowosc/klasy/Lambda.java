package obiektowosc.klasy;

public class Lambda {

    public static void main(String[] args) {


        ModyfikatorTekstu dodajeWykrzyknik = tekst -> tekst + "!";

        String wynik = dodajeWykrzyknik.modyfikujTekst("Testowy tekst");
        System.out.println(wynik);

        ModyfikatorLiczby potegowanie = liczba -> liczba * liczba;

        System.out.println(potegowanie.modyfikuj(4));
    }


}
