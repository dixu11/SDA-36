package obiektowosc.obiektowosc.dziedziczenie;

public class Slon extends Zwierze {
    public Slon(String imie, int wiek) {
        super(imie, wiek);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Slon tabi");
    }
}
