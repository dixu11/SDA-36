package obiektowosc.dziedziczenie;

public class Pies extends Zwierze{

    public Pies(){
        super("Burek",3);
    }

    public Pies(String imie, int wiek) {
        super(imie,wiek);
    }

    public void wydajDzwiek() {
        System.out.println("Hau hau!");
    }

    public void aportuj() {
        System.out.println("Pies gania za patykiem");
    }
}
