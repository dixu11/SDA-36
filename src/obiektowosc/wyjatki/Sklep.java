package obiektowosc.wyjatki;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Sklep {

    private List<String> produkty = new ArrayList<>();

    public void dodajProdukt(String produkt) {
        produkty.add(produkt);
    }

    public String znajdzProduktPoNazwie(String nazwa) {
        for (String produkt : produkty) {
            if (produkt.contains(nazwa)) {
                return produkt;
            }
        }
        throw new NoSuchElementException("Nie znaleziono: " + nazwa);
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "produkty=" + produkty +
                '}';
    }
}
