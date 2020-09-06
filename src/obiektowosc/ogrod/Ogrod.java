package obiektowosc.ogrod;

import java.util.Arrays;

public class Ogrod {

    private Lawka lawka;
    private Drzewo[] drzewa;
    private Kwiat[] kwiaty;

    public Ogrod(Lawka lawka, Drzewo[] drzewa, Kwiat[] kwiaty) {
        this.lawka = lawka;
        this.drzewa = drzewa;
        this.kwiaty = kwiaty;
    }

    @Override
    public String toString() {
        return "Ogrod{" +
                "lawka=" + lawka +
                ", drzewa=" + Arrays.toString(drzewa) +
                ", kwiaty=" + Arrays.toString(kwiaty) +
                '}';
    }
}
