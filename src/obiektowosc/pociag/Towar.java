package obiektowosc.pociag;

public class Towar {

    private String zawartosc;
    private double waga;

    public Towar(String zawartosc, double waga) {
        this.zawartosc = zawartosc;
        this.waga = waga;
    }

    public double getWaga() {
        return waga;
    }
}
