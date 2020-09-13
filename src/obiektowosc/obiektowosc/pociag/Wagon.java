package obiektowosc.obiektowosc.pociag;

public class Wagon {

    private int ladownosc = 1000;
    private Towar[] towary;

    //Po zaprojektowaniu następującej struktury zrób w wagonie metodę która zwraca true lub false w zależności
    //czy towary przekraczają ładowność wagonu.


    public Wagon(Towar[] towary) {
        this.towary = towary;
    }

    public boolean czyPrzeladowany() {
        int suma = 0;
        for (Towar towar : towary) {
            suma += towar.getWaga();
        }

        if (suma <= ladownosc) {
            return false;
        } else
            return true;
    }
}
