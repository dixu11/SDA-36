package obiektowosc.obiektowosc.wyjatki;

import java.util.ArrayList;
import java.util.List;

public class Sklep {

    private List<String> produkty = new ArrayList<>();

    public void dodajProdukt(String produkt) {
        produkty.add(produkt);
    }

    public String znajdzProduktPoNazwie(String nazwa) throws BrakProduktuException {
        for (String produkt : produkty) {
            if (produkt.contains(nazwa)) {
                return produkt;
            }
        }
       // throw new NoSuchElementException("Nie znaleziono: " + nazwa);
        throw new BrakProduktuException("Nie znaleziono: " + nazwa);
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "produkty=" + produkty +
                '}';
    }
}
