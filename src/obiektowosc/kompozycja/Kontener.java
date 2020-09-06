package obiektowosc.kompozycja;

public class Kontener {

    private String zawartosc;
    private boolean otwarty = false;

    public Kontener(String zawartosc) {
        this.zawartosc = zawartosc;
    }

    public void setOtwarty(boolean otwarty) {
        this.otwarty = otwarty;
    }

    @Override
    public String toString() {
        return "Kontener{" +
                "zawartosc='" + zawartosc + '\'' +
                ", otwarty=" + otwarty +
                '}';
    }
}
