package obiektowosc.obiektowosc.ogrod;

public class Kwiat {

    private String kolor;
    private String rodzaj;

    public Kwiat(String kolor, String rodzaj) {
        this.kolor = kolor;
        this.rodzaj = rodzaj;
    }

    @Override
    public String toString() {
        return "Kwiat{" +
                "kolor='" + kolor + '\'' +
                ", rodzaj='" + rodzaj + '\'' +
                '}';
    }
}
