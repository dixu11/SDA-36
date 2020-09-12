package obiektowosc.dziedziczenie;

public class Pies extends Zwierze{

    private String imie;
    private int wiek;

    public Pies(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Pies() {
        imie = "Burek";
        wiek = 1;
    }

    public void wydajDzwiek() {
        super.wydajDzwiek();
        System.out.println("Hau hau!");
    }

    public void aportuj() {
        System.out.println("Pies gania za patykiem");
    }
}
