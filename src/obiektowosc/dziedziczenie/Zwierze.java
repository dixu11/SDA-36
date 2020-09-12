package obiektowosc.dziedziczenie;

public class Zwierze {

    private String imie;
    private int wiek;

    public Zwierze(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    /*public Zwierze() {
        imie = "";
        age = 1;
        System.out.println("Konstruktor zwierzecia");
    }*/

    public void biegaj() {
        System.out.println("Zwierze biegnie");
    }

    public void wydajDzwiek() {
        System.out.println("Zwierze wydaje dzwiek: ");
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "imie='" + imie + '\'' +
                ", age=" + wiek +
                '}';
    }
}
